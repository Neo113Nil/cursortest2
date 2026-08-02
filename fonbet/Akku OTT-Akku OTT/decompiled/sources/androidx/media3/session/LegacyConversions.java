package androidx.media3.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.HeartRating;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PercentageRating;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Rating;
import androidx.media3.common.StarRating;
import androidx.media3.common.ThumbRating;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.session.CommandButton;
import androidx.media3.session.MediaLibraryService;
import androidx.media3.session.SessionCommands;
import androidx.media3.session.legacy.AudioAttributesCompat;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.MediaControllerCompat;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.media3.session.legacy.PlaybackStateCompat;
import androidx.media3.session.legacy.RatingCompat;
import com.google.common.collect.G;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
class LegacyConversions {
    public static final com.google.common.collect.M<String> KNOWN_METADATA_COMPAT_KEYS = com.google.common.collect.M.m(MediaMetadataCompat.METADATA_KEY_TITLE, MediaMetadataCompat.METADATA_KEY_ARTIST, MediaMetadataCompat.METADATA_KEY_DURATION, MediaMetadataCompat.METADATA_KEY_ALBUM, MediaMetadataCompat.METADATA_KEY_AUTHOR, MediaMetadataCompat.METADATA_KEY_WRITER, MediaMetadataCompat.METADATA_KEY_COMPOSER, MediaMetadataCompat.METADATA_KEY_COMPILATION, MediaMetadataCompat.METADATA_KEY_DATE, MediaMetadataCompat.METADATA_KEY_YEAR, MediaMetadataCompat.METADATA_KEY_GENRE, MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER, MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, MediaMetadataCompat.METADATA_KEY_DISC_NUMBER, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, MediaMetadataCompat.METADATA_KEY_ART, MediaMetadataCompat.METADATA_KEY_ART_URI, MediaMetadataCompat.METADATA_KEY_ALBUM_ART, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, MediaMetadataCompat.METADATA_KEY_USER_RATING, MediaMetadataCompat.METADATA_KEY_RATING, MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, MediaMetadataCompat.METADATA_KEY_MEDIA_ID, MediaMetadataCompat.METADATA_KEY_MEDIA_URI, MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE, "android.media.metadata.ADVERTISEMENT", MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, MediaConstants.EXTRAS_KEY_MEDIA_TYPE_COMPAT);
    private static final String TAG = "LegacyConversions";

    public static class ConversionException extends Exception {
        private ConversionException(String str) {
            super(str);
        }
    }

    private LegacyConversions() {
    }

    public static com.google.common.collect.G<MediaItem> convertBrowserItemListToMediaItemList(List<MediaBrowserCompat.MediaItem> list) {
        G.a aVar = new G.a();
        for (int i = 0; i < list.size(); i++) {
            aVar.c(convertToMediaItem(list.get(i)));
        }
        return aVar.g();
    }

    @Nullable
    public static CommandButton convertCustomBrowseActionToCommandButton(Bundle bundle) {
        String string = bundle.getString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ID");
        if (string == null) {
            return null;
        }
        CommandButton.Builder sessionCommand = new CommandButton.Builder().setSessionCommand(new SessionCommand(string, Bundle.EMPTY));
        String string2 = bundle.getString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_LABEL");
        if (string2 != null) {
            sessionCommand.setDisplayName(string2);
        }
        String string3 = bundle.getString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ICON_URI");
        if (string3 != null) {
            try {
                sessionCommand.setIconUri(Uri.parse(string3));
            } catch (Throwable th) {
                Log.e(TAG, "error parsing icon URI of legacy browser action ".concat(string), th);
            }
        }
        Bundle bundle2 = bundle.getBundle("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_EXTRAS");
        if (bundle2 != null) {
            sessionCommand.setExtras(bundle2);
        }
        return sessionCommand.build();
    }

    @SuppressLint({"WrongConstant"})
    public static AudioAttributes convertToAudioAttributes(@Nullable AudioAttributesCompat audioAttributesCompat) {
        return audioAttributesCompat == null ? AudioAttributes.DEFAULT : new AudioAttributes.Builder().setContentType(audioAttributesCompat.getContentType()).setFlags(audioAttributesCompat.getFlags()).setUsage(audioAttributesCompat.getUsage()).build();
    }

    public static AudioAttributesCompat convertToAudioAttributesCompat(AudioAttributes audioAttributes) {
        return new AudioAttributesCompat.Builder().setContentType(audioAttributes.contentType).setFlags(audioAttributes.flags).setUsage(audioAttributes.usage).build();
    }

    public static MediaBrowserCompat.MediaItem convertToBrowserItem(MediaItem mediaItem, @Nullable Bitmap bitmap) {
        MediaDescriptionCompat convertToMediaDescriptionCompat = convertToMediaDescriptionCompat(mediaItem, bitmap);
        MediaMetadata mediaMetadata = mediaItem.mediaMetadata;
        Boolean bool = mediaMetadata.isBrowsable;
        int i = (bool == null || !bool.booleanValue()) ? 0 : 1;
        Boolean bool2 = mediaMetadata.isPlayable;
        if (bool2 != null && bool2.booleanValue()) {
            i |= 2;
        }
        return new MediaBrowserCompat.MediaItem(convertToMediaDescriptionCompat, i);
    }

    public static int convertToBufferedPercentage(@Nullable PlaybackStateCompat playbackStateCompat, @Nullable MediaMetadataCompat mediaMetadataCompat, long j) {
        return MediaUtils.calculateBufferedPercentage(convertToBufferedPositionMs(playbackStateCompat, mediaMetadataCompat, j), convertToDurationMs(mediaMetadataCompat));
    }

    public static long convertToBufferedPositionMs(@Nullable PlaybackStateCompat playbackStateCompat, @Nullable MediaMetadataCompat mediaMetadataCompat, long j) {
        long bufferedPosition = playbackStateCompat == null ? 0L : playbackStateCompat.getBufferedPosition();
        long convertToCurrentPositionMs = convertToCurrentPositionMs(playbackStateCompat, mediaMetadataCompat, j);
        long convertToDurationMs = convertToDurationMs(mediaMetadataCompat);
        return convertToDurationMs == -9223372036854775807L ? Math.max(convertToCurrentPositionMs, bufferedPosition) : Util.constrainValue(bufferedPosition, convertToCurrentPositionMs, convertToDurationMs);
    }

    public static Bundle convertToBundle(CommandButton commandButton) {
        Bundle bundle = new Bundle();
        SessionCommand sessionCommand = commandButton.sessionCommand;
        if (sessionCommand != null) {
            bundle.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ID", sessionCommand.customAction);
        }
        bundle.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_LABEL", commandButton.displayName.toString());
        Uri uri = commandButton.iconUri;
        if (uri != null) {
            bundle.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ICON_URI", uri.toString());
        }
        if (!commandButton.extras.isEmpty()) {
            bundle.putBundle("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_EXTRAS", commandButton.extras);
        }
        return bundle;
    }

    private static byte[] convertToByteArray(Bitmap bitmap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long convertToCurrentPositionMs(@Nullable PlaybackStateCompat playbackStateCompat, @Nullable MediaMetadataCompat mediaMetadataCompat, long j) {
        if (playbackStateCompat == null) {
            return 0L;
        }
        long currentPosition = playbackStateCompat.getState() == 3 ? getCurrentPosition(playbackStateCompat, j) : playbackStateCompat.getPosition();
        long convertToDurationMs = convertToDurationMs(mediaMetadataCompat);
        return convertToDurationMs == -9223372036854775807L ? Math.max(0L, currentPosition) : Util.constrainValue(currentPosition, 0L, convertToDurationMs);
    }

    public static DeviceInfo convertToDeviceInfo(@Nullable MediaControllerCompat.PlaybackInfo playbackInfo, @Nullable String str) {
        if (playbackInfo == null) {
            return DeviceInfo.UNKNOWN;
        }
        return new DeviceInfo.Builder(playbackInfo.getPlaybackType() == 2 ? 1 : 0).setMaxVolume(playbackInfo.getMaxVolume()).setRoutingControllerId(str).build();
    }

    public static int convertToDeviceVolume(@Nullable MediaControllerCompat.PlaybackInfo playbackInfo) {
        if (playbackInfo == null) {
            return 0;
        }
        return playbackInfo.getCurrentVolume();
    }

    public static long convertToDurationMs(@Nullable MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null || !mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            return -9223372036854775807L;
        }
        long j = mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
        if (j <= 0) {
            return -9223372036854775807L;
        }
        return j;
    }

    private static long convertToExtraBtFolderType(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException(android.support.v4.media.a.a(i, "Unrecognized FolderType: "));
        }
    }

    private static int convertToFolderType(long j) {
        if (j == 0) {
            return 0;
        }
        if (j == 1) {
            return 1;
        }
        if (j == 2) {
            return 2;
        }
        if (j == 3) {
            return 3;
        }
        if (j == 4) {
            return 4;
        }
        if (j == 5) {
            return 5;
        }
        return j == 6 ? 6 : 0;
    }

    public static boolean convertToIsDeviceMuted(@Nullable MediaControllerCompat.PlaybackInfo playbackInfo) {
        return playbackInfo != null && playbackInfo.getCurrentVolume() == 0;
    }

    private static boolean convertToIsEnded(PlaybackStateCompat playbackStateCompat, @Nullable MediaMetadataCompat mediaMetadataCompat, long j) {
        long convertToDurationMs = convertToDurationMs(mediaMetadataCompat);
        return convertToDurationMs != -9223372036854775807L && convertToCurrentPositionMs(playbackStateCompat, mediaMetadataCompat, j) >= convertToDurationMs;
    }

    public static boolean convertToIsPlaying(@Nullable PlaybackStateCompat playbackStateCompat) {
        return playbackStateCompat != null && playbackStateCompat.getState() == 3;
    }

    public static boolean convertToIsPlayingAd(@Nullable MediaMetadataCompat mediaMetadataCompat) {
        return (mediaMetadataCompat == null || mediaMetadataCompat.getLong("android.media.metadata.ADVERTISEMENT") == 0) ? false : true;
    }

    public static int convertToLegacyErrorCode(int i) {
        if (i == -110) {
            return 8;
        }
        if (i == -109) {
            return 11;
        }
        if (i == -6) {
            return 2;
        }
        if (i == -2) {
            return 1;
        }
        if (i == 1) {
            return 10;
        }
        switch (i) {
            case -107:
                return 9;
            case -106:
                return 7;
            case -105:
                return 6;
            case -104:
                return 5;
            case -103:
                return 4;
            case -102:
                return 3;
            default:
                return 0;
        }
    }

    @Nullable
    public static MediaLibraryService.LibraryParams convertToLibraryParams(Context context, @Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            bundle.setClassLoader(context.getClassLoader());
            int i = bundle.getInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", -1);
            if (i >= 0) {
                bundle.remove("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS");
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                bundle.putBoolean(MediaConstants.EXTRA_KEY_ROOT_CHILDREN_BROWSABLE_ONLY, z);
            }
            return new MediaLibraryService.LibraryParams.Builder().setExtras(bundle).setRecent(bundle.getBoolean("android.service.media.extra.RECENT")).setOffline(bundle.getBoolean("android.service.media.extra.OFFLINE")).setSuggested(bundle.getBoolean("android.service.media.extra.SUGGESTED")).build();
        } catch (Exception unused) {
            return new MediaLibraryService.LibraryParams.Builder().setExtras(bundle).build();
        }
    }

    public static com.google.common.collect.G<CommandButton> convertToMediaButtonPreferences(@Nullable PlaybackStateCompat playbackStateCompat, Player.Commands commands, Bundle bundle) {
        if (playbackStateCompat == null) {
            G.b bVar = com.google.common.collect.G.b;
            return com.google.common.collect.i0.e;
        }
        List<PlaybackStateCompat.CustomAction> customActions = playbackStateCompat.getCustomActions();
        G.a aVar = new G.a();
        for (PlaybackStateCompat.CustomAction customAction : customActions) {
            String action = customAction.getAction();
            Bundle extras = customAction.getExtras();
            CommandButton.Builder enabled = new CommandButton.Builder(extras != null ? extras.getInt(MediaConstants.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT, 0) : 0, customAction.getIcon()).setSessionCommand(new SessionCommand(action, extras == null ? Bundle.EMPTY : extras)).setDisplayName(customAction.getName()).setEnabled(true);
            String string = extras != null ? extras.getString(MediaConstants.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT) : null;
            if (string != null) {
                Uri parse = Uri.parse(string);
                String scheme = parse.getScheme();
                if (Objects.equals(scheme, FirebaseAnalytics.Param.CONTENT) || Objects.equals(scheme, "android.resource")) {
                    enabled.setIconUri(parse);
                }
            }
            aVar.c(enabled.build());
        }
        return CommandButton.getMediaButtonPreferencesFromCustomLayout(aVar.g(), commands, bundle);
    }

    public static MediaDescriptionCompat convertToMediaDescriptionCompat(MediaItem mediaItem, @Nullable Bitmap bitmap) {
        CharSequence charSequence;
        CharSequence charSequence2;
        MediaDescriptionCompat.Builder mediaId = new MediaDescriptionCompat.Builder().setMediaId(mediaItem.mediaId.equals("") ? null : mediaItem.mediaId);
        MediaMetadata mediaMetadata = mediaItem.mediaMetadata;
        if (bitmap != null) {
            mediaId.setIconBitmap(bitmap);
        }
        Bundle bundle = mediaMetadata.extras;
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        Integer num = mediaMetadata.folderType;
        boolean z = (num == null || num.intValue() == -1) ? false : true;
        boolean z2 = mediaMetadata.mediaType != null;
        if (z || z2) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (z) {
                bundle.putLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE, convertToExtraBtFolderType(((Integer) Assertions.checkNotNull(mediaMetadata.folderType)).intValue()));
            }
            if (z2) {
                bundle.putLong(MediaConstants.EXTRAS_KEY_MEDIA_TYPE_COMPAT, ((Integer) Assertions.checkNotNull(mediaMetadata.mediaType)).intValue());
            }
        }
        if (!mediaMetadata.supportedCommands.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(mediaMetadata.supportedCommands));
        }
        CharSequence charSequence3 = mediaMetadata.displayTitle;
        if (charSequence3 != null) {
            charSequence = mediaMetadata.subtitle;
            charSequence2 = mediaMetadata.description;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence("androidx.media3.mediadescriptioncompat.title", mediaMetadata.title);
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = MediaMetadataCompat.PREFERRED_DESCRIPTION_ORDER;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence text = getText(strArr[i2], mediaMetadata);
                if (!TextUtils.isEmpty(text)) {
                    charSequenceArr[i] = text;
                    i++;
                }
                i2 = i3;
            }
            charSequence3 = charSequenceArr[0];
            charSequence = charSequenceArr[1];
            charSequence2 = charSequenceArr[2];
        }
        return mediaId.setTitle(charSequence3).setSubtitle(charSequence).setDescription(charSequence2).setIconUri(mediaMetadata.artworkUri).setMediaUri(mediaItem.requestMetadata.mediaUri).setExtras(bundle).build();
    }

    public static MediaItem convertToMediaItem(MediaBrowserCompat.MediaItem mediaItem) {
        return convertToMediaItem(mediaItem.getDescription(), mediaItem.isBrowsable(), mediaItem.isPlayable());
    }

    public static List<MediaItem> convertToMediaItemList(Timeline timeline) {
        ArrayList arrayList = new ArrayList();
        Timeline.Window window = new Timeline.Window();
        for (int i = 0; i < timeline.getWindowCount(); i++) {
            arrayList.add(timeline.getWindow(i, window).mediaItem);
        }
        return arrayList;
    }

    public static MediaMetadata convertToMediaMetadata(@Nullable CharSequence charSequence) {
        return charSequence == null ? MediaMetadata.EMPTY : new MediaMetadata.Builder().setTitle(charSequence).build();
    }

    public static MediaMetadataCompat convertToMediaMetadataCompat(MediaMetadata mediaMetadata, String str, @Nullable Uri uri, long j, @Nullable Bitmap bitmap) {
        Long l;
        MediaMetadataCompat.Builder putString = new MediaMetadataCompat.Builder().putString(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, str);
        CharSequence charSequence = mediaMetadata.title;
        if (charSequence != null) {
            putString.putText(MediaMetadataCompat.METADATA_KEY_TITLE, charSequence);
        }
        CharSequence charSequence2 = mediaMetadata.displayTitle;
        if (charSequence2 != null) {
            putString.putText(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, charSequence2);
        }
        CharSequence charSequence3 = mediaMetadata.subtitle;
        if (charSequence3 != null) {
            putString.putText(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, charSequence3);
        }
        CharSequence charSequence4 = mediaMetadata.description;
        if (charSequence4 != null) {
            putString.putText(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, charSequence4);
        }
        CharSequence charSequence5 = mediaMetadata.artist;
        if (charSequence5 != null) {
            putString.putText(MediaMetadataCompat.METADATA_KEY_ARTIST, charSequence5);
        }
        CharSequence charSequence6 = mediaMetadata.albumTitle;
        if (charSequence6 != null) {
            putString.putText(MediaMetadataCompat.METADATA_KEY_ALBUM, charSequence6);
        }
        CharSequence charSequence7 = mediaMetadata.albumArtist;
        if (charSequence7 != null) {
            putString.putText(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, charSequence7);
        }
        if (mediaMetadata.recordingYear != null) {
            putString.putLong(MediaMetadataCompat.METADATA_KEY_YEAR, r0.intValue());
        }
        if (uri != null) {
            putString.putString(MediaMetadataCompat.METADATA_KEY_MEDIA_URI, uri.toString());
        }
        Uri uri2 = mediaMetadata.artworkUri;
        if (uri2 != null) {
            putString.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, uri2.toString());
            putString.putString(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, mediaMetadata.artworkUri.toString());
            putString.putString(MediaMetadataCompat.METADATA_KEY_ART_URI, mediaMetadata.artworkUri.toString());
        }
        if (bitmap != null) {
            putString.putBitmap(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, bitmap);
            putString.putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap);
        }
        Integer num = mediaMetadata.folderType;
        if (num != null && num.intValue() != -1) {
            putString.putLong(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE, convertToExtraBtFolderType(mediaMetadata.folderType.intValue()));
        }
        if (j == -9223372036854775807L && (l = mediaMetadata.durationMs) != null) {
            j = l.longValue();
        }
        if (j == -9223372036854775807L) {
            j = -1;
        }
        putString.putLong(MediaMetadataCompat.METADATA_KEY_DURATION, j);
        RatingCompat convertToRatingCompat = convertToRatingCompat(mediaMetadata.userRating);
        if (convertToRatingCompat != null) {
            putString.putRating(MediaMetadataCompat.METADATA_KEY_USER_RATING, convertToRatingCompat);
        }
        RatingCompat convertToRatingCompat2 = convertToRatingCompat(mediaMetadata.overallRating);
        if (convertToRatingCompat2 != null) {
            putString.putRating(MediaMetadataCompat.METADATA_KEY_RATING, convertToRatingCompat2);
        }
        if (mediaMetadata.mediaType != null) {
            putString.putLong(MediaConstants.EXTRAS_KEY_MEDIA_TYPE_COMPAT, r5.intValue());
        }
        Bundle bundle = mediaMetadata.extras;
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = mediaMetadata.extras.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    putString.putText(str2, (CharSequence) obj);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    putString.putLong(str2, ((Number) obj).longValue());
                }
            }
        }
        return putString.build();
    }

    public static Timeline.Period convertToPeriod(int i) {
        Timeline.Period period = new Timeline.Period();
        period.set(null, null, i, -9223372036854775807L, 0L, AdPlaybackState.NONE, true);
        return period;
    }

    public static boolean convertToPlayWhenReady(@Nullable PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null) {
            return false;
        }
        switch (playbackStateCompat.getState()) {
        }
        return false;
    }

    @Nullable
    public static PlaybackException convertToPlaybackException(@Nullable PlaybackStateCompat playbackStateCompat, Context context) {
        if (playbackStateCompat == null || playbackStateCompat.getState() != 7) {
            return null;
        }
        CharSequence errorMessage = playbackStateCompat.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = getSessionErrorMessage(convertToSessionErrorCode(playbackStateCompat.getErrorCode()), context);
        }
        Bundle extras = playbackStateCompat.getExtras();
        String charSequence = errorMessage != null ? errorMessage.toString() : null;
        int convertToPlaybackExceptionErrorCode = convertToPlaybackExceptionErrorCode(playbackStateCompat.getErrorCode());
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        return new PlaybackException(charSequence, null, convertToPlaybackExceptionErrorCode, extras);
    }

    private static int convertToPlaybackExceptionErrorCode(int i) {
        int convertToSessionErrorCode = convertToSessionErrorCode(i);
        if (convertToSessionErrorCode == -5) {
            return 2000;
        }
        if (convertToSessionErrorCode != -1) {
            return convertToSessionErrorCode;
        }
        return 1000;
    }

    public static PlaybackParameters convertToPlaybackParameters(@Nullable PlaybackStateCompat playbackStateCompat) {
        return playbackStateCompat == null ? PlaybackParameters.DEFAULT : new PlaybackParameters(playbackStateCompat.getPlaybackSpeed());
    }

    public static int convertToPlaybackState(@Nullable PlaybackStateCompat playbackStateCompat, @Nullable MediaMetadataCompat mediaMetadataCompat, long j) throws ConversionException {
        if (playbackStateCompat == null) {
            return 1;
        }
        boolean convertToIsEnded = convertToIsEnded(playbackStateCompat, mediaMetadataCompat, j);
        switch (playbackStateCompat.getState()) {
            case 1:
                if (convertToIsEnded) {
                    return 4;
                }
            case 0:
            case 7:
            case 8:
                return 1;
            case 2:
                return convertToIsEnded ? 4 : 3;
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
                return 2;
            default:
                throw new ConversionException("Invalid state of PlaybackStateCompat: " + playbackStateCompat.getState());
        }
    }

    public static int convertToPlaybackStateCompatRepeatMode(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                Log.w(TAG, "Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i2;
    }

    public static int convertToPlaybackStateCompatShuffleMode(boolean z) {
        return z ? 1 : 0;
    }

    public static int convertToPlaybackStateCompatState(Player player, boolean z) {
        if (player.getPlayerError() != null) {
            return 7;
        }
        int playbackState = player.getPlaybackState();
        if (playbackState == 1) {
            return 0;
        }
        if (playbackState == 2) {
            return z ? 2 : 6;
        }
        if (playbackState == 3) {
            return z ? 2 : 3;
        }
        if (playbackState == 4) {
            return 1;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(playbackState, "Unrecognized State: "));
    }

    public static Player.Commands convertToPlayerCommands(@Nullable PlaybackStateCompat playbackStateCompat, int i, long j, boolean z) {
        Player.Commands.Builder builder = new Player.Commands.Builder();
        long actions = playbackStateCompat == null ? 0L : playbackStateCompat.getActions();
        boolean convertToPlayWhenReady = convertToPlayWhenReady(playbackStateCompat);
        if ((hasAction(actions, 4L) && !convertToPlayWhenReady) || ((hasAction(actions, 2L) && convertToPlayWhenReady) || hasAction(actions, 512L))) {
            builder.add(1);
        }
        if (hasAction(actions, 16384L)) {
            builder.add(2);
        }
        if ((hasAction(actions, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) && hasAction(actions, 1024L)) || ((hasAction(actions, PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) && hasAction(actions, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) || (hasAction(actions, PlaybackStateCompat.ACTION_PREPARE_FROM_URI) && hasAction(actions, PlaybackStateCompat.ACTION_PLAY_FROM_URI)))) {
            builder.addAll(31, 2);
        }
        if (hasAction(actions, 8L)) {
            builder.add(11);
        }
        if (hasAction(actions, 64L)) {
            builder.add(12);
        }
        if (hasAction(actions, 256L)) {
            builder.addAll(5, 4);
        }
        if (hasAction(actions, 32L)) {
            builder.addAll(9, 8);
        }
        if (hasAction(actions, 16L)) {
            builder.addAll(7, 6);
        }
        if (hasAction(actions, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED)) {
            builder.add(13);
        }
        if (hasAction(actions, 1L)) {
            builder.add(3);
        }
        if (i == 1) {
            builder.addAll(26, 34);
        } else if (i == 2) {
            builder.addAll(26, 34, 25, 33);
        }
        builder.addAll(23, 17, 18, 16, 21, 32);
        if ((j & 4) != 0) {
            builder.add(20);
            if (hasAction(actions, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
                builder.add(10);
            }
        }
        if (z) {
            if (hasAction(actions, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
                builder.add(15);
            }
            if (hasAction(actions, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE)) {
                builder.add(14);
            }
        }
        return builder.build();
    }

    public static MediaSessionCompat.QueueItem convertToQueueItem(MediaItem mediaItem, int i, @Nullable Bitmap bitmap) {
        return new MediaSessionCompat.QueueItem(convertToMediaDescriptionCompat(mediaItem, bitmap), convertToQueueItemId(i));
    }

    public static long convertToQueueItemId(int i) {
        if (i == -1) {
            return -1L;
        }
        return i;
    }

    @Nullable
    public static Rating convertToRating(@Nullable RatingCompat ratingCompat) {
        if (ratingCompat == null) {
            return null;
        }
        switch (ratingCompat.getRatingStyle()) {
            case 1:
                if (!ratingCompat.isRated()) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!ratingCompat.isRated()) {
                    break;
                } else {
                    break;
                }
            case 3:
                if (!ratingCompat.isRated()) {
                    break;
                } else {
                    break;
                }
            case 4:
                if (!ratingCompat.isRated()) {
                    break;
                } else {
                    break;
                }
            case 5:
                if (!ratingCompat.isRated()) {
                    break;
                } else {
                    break;
                }
            case 6:
                if (!ratingCompat.isRated()) {
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    @Nullable
    @SuppressLint({"WrongConstant"})
    public static RatingCompat convertToRatingCompat(@Nullable Rating rating) {
        if (rating == null) {
            return null;
        }
        int ratingCompatStyle = getRatingCompatStyle(rating);
        if (!rating.isRated()) {
            return RatingCompat.newUnratedRating(ratingCompatStyle);
        }
        switch (ratingCompatStyle) {
            case 1:
                return RatingCompat.newHeartRating(((HeartRating) rating).isHeart());
            case 2:
                return RatingCompat.newThumbRating(((ThumbRating) rating).isThumbsUp());
            case 3:
            case 4:
            case 5:
                return RatingCompat.newStarRating(ratingCompatStyle, ((StarRating) rating).getStarRating());
            case 6:
                return RatingCompat.newPercentageRating(((PercentageRating) rating).getPercent());
            default:
                return null;
        }
    }

    public static int convertToRepeatMode(int i) {
        if (i == -1 || i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                Log.w(TAG, "Unrecognized PlaybackStateCompat.RepeatMode: " + i + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i2;
    }

    @Nullable
    public static Bundle convertToRootHints(@Nullable MediaLibraryService.LibraryParams libraryParams) {
        if (libraryParams == null) {
            return null;
        }
        Bundle bundle = new Bundle(libraryParams.extras);
        if (libraryParams.extras.containsKey(MediaConstants.EXTRA_KEY_ROOT_CHILDREN_BROWSABLE_ONLY)) {
            boolean z = libraryParams.extras.getBoolean(MediaConstants.EXTRA_KEY_ROOT_CHILDREN_BROWSABLE_ONLY, false);
            bundle.remove(MediaConstants.EXTRA_KEY_ROOT_CHILDREN_BROWSABLE_ONLY);
            bundle.putInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", z ? 1 : 3);
        }
        bundle.putBoolean("android.service.media.extra.RECENT", libraryParams.isRecent);
        bundle.putBoolean("android.service.media.extra.OFFLINE", libraryParams.isOffline);
        bundle.putBoolean("android.service.media.extra.SUGGESTED", libraryParams.isSuggested);
        return bundle;
    }

    public static SessionCommands convertToSessionCommands(@Nullable PlaybackStateCompat playbackStateCompat, boolean z) {
        SessionCommands.Builder builder = new SessionCommands.Builder();
        builder.addAllSessionCommands();
        if (!z) {
            builder.remove(SessionCommand.COMMAND_CODE_SESSION_SET_RATING);
        }
        if (playbackStateCompat != null) {
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.getCustomActions()) {
                String action = customAction.getAction();
                Bundle extras = customAction.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                builder.add(new SessionCommand(action, extras));
            }
        }
        return builder.build();
    }

    @Nullable
    public static SessionError convertToSessionError(@Nullable PlaybackStateCompat playbackStateCompat, Context context) {
        if (playbackStateCompat == null) {
            return null;
        }
        return convertToSessionError(playbackStateCompat.getState(), playbackStateCompat.getErrorCode(), playbackStateCompat.getErrorMessage(), playbackStateCompat.getExtras(), context);
    }

    private static int convertToSessionErrorCode(int i) {
        switch (i) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case 9:
                return -107;
            case 10:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    public static boolean convertToShuffleModeEnabled(int i) {
        if (i == -1 || i == 0) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(i, "Unrecognized ShuffleMode: "));
    }

    public static long convertToTotalBufferedDurationMs(@Nullable PlaybackStateCompat playbackStateCompat, @Nullable MediaMetadataCompat mediaMetadataCompat, long j) {
        return convertToBufferedPositionMs(playbackStateCompat, mediaMetadataCompat, j) - convertToCurrentPositionMs(playbackStateCompat, mediaMetadataCompat, j);
    }

    public static Timeline.Window convertToWindow(MediaItem mediaItem, int i) {
        Timeline.Window window = new Timeline.Window();
        window.set(0, mediaItem, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, i, i, 0L);
        return window;
    }

    public static int extractMaxCommandsForMediaItemFromRootHints(Bundle bundle) {
        return Math.max(0, bundle.getInt("androidx.media.utils.MediaBrowserCompat.extras.CUSTOM_BROWSER_ACTION_LIMIT", 0));
    }

    private static long getCurrentPosition(PlaybackStateCompat playbackStateCompat, long j) {
        return playbackStateCompat.getCurrentPosition(j == -9223372036854775807L ? null : Long.valueOf(j));
    }

    @Nullable
    private static Bitmap getFirstBitmap(MediaMetadataCompat mediaMetadataCompat, String... strArr) {
        for (String str : strArr) {
            if (mediaMetadataCompat.containsKey(str)) {
                return mediaMetadataCompat.getBitmap(str);
            }
        }
        return null;
    }

    @Nullable
    private static String getFirstString(MediaMetadataCompat mediaMetadataCompat, String... strArr) {
        for (String str : strArr) {
            if (mediaMetadataCompat.containsKey(str)) {
                return mediaMetadataCompat.getString(str);
            }
        }
        return null;
    }

    public static <T> T getFutureResult(Future<T> future, long j) throws ExecutionException, TimeoutException {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j2 = j;
        while (true) {
            try {
                try {
                    return future.get(j2, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    z = true;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (elapsedRealtime2 >= j) {
                        throw new TimeoutException();
                    }
                    j2 = j - elapsedRealtime2;
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static int getLegacyStreamType(AudioAttributes audioAttributes) {
        int legacyStreamType = convertToAudioAttributesCompat(audioAttributes).getLegacyStreamType();
        if (legacyStreamType == Integer.MIN_VALUE) {
            return 3;
        }
        return legacyStreamType;
    }

    public static int getRatingCompatStyle(@Nullable Rating rating) {
        if (rating instanceof HeartRating) {
            return 1;
        }
        if (rating instanceof ThumbRating) {
            return 2;
        }
        if (!(rating instanceof StarRating)) {
            return rating instanceof PercentageRating ? 6 : 0;
        }
        int maxStars = ((StarRating) rating).getMaxStars();
        int i = 3;
        if (maxStars != 3) {
            i = 4;
            if (maxStars != 4) {
                i = 5;
                if (maxStars != 5) {
                    return 0;
                }
            }
        }
        return i;
    }

    private static String getSessionErrorMessage(int i, Context context) {
        if (i == -100) {
            return context.getString(R.string.error_message_disconnected);
        }
        if (i == 1) {
            return context.getString(R.string.error_message_info_cancelled);
        }
        if (i == -6) {
            return context.getString(R.string.error_message_not_supported);
        }
        if (i == -5) {
            return context.getString(R.string.error_message_io);
        }
        if (i == -4) {
            return context.getString(R.string.error_message_permission_denied);
        }
        if (i == -3) {
            return context.getString(R.string.error_message_bad_value);
        }
        if (i == -2) {
            return context.getString(R.string.error_message_invalid_state);
        }
        switch (i) {
            case -110:
                return context.getString(R.string.error_message_content_already_playing);
            case -109:
                return context.getString(R.string.error_message_end_of_playlist);
            case -108:
                return context.getString(R.string.error_message_setup_required);
            case -107:
                return context.getString(R.string.error_message_skip_limit_reached);
            case -106:
                return context.getString(R.string.error_message_not_available_in_region);
            case -105:
                return context.getString(R.string.error_message_parental_control_restricted);
            case -104:
                return context.getString(R.string.error_message_concurrent_stream_limit);
            case -103:
                return context.getString(R.string.error_message_premium_account_required);
            case -102:
                return context.getString(R.string.error_message_authentication_expired);
            default:
                return context.getString(R.string.error_message_fallback);
        }
    }

    @Nullable
    private static CharSequence getText(String str, MediaMetadata mediaMetadata) {
        str.getClass();
        switch (str) {
            case "android.media.metadata.ARTIST":
                return mediaMetadata.artist;
            case "android.media.metadata.WRITER":
                return mediaMetadata.writer;
            case "android.media.metadata.DISPLAY_SUBTITLE":
                return mediaMetadata.subtitle;
            case "android.media.metadata.COMPOSER":
                return mediaMetadata.composer;
            case "android.media.metadata.ALBUM":
                return mediaMetadata.albumTitle;
            case "android.media.metadata.TITLE":
                return mediaMetadata.title;
            case "android.media.metadata.ALBUM_ARTIST":
                return mediaMetadata.albumArtist;
            default:
                return null;
        }
    }

    private static boolean hasAction(long j, long j2) {
        return (j & j2) != 0;
    }

    public static int convertToLegacyErrorCode(PlaybackException playbackException) {
        return convertToLegacyErrorCode(playbackException.errorCode);
    }

    public static MediaItem convertToMediaItem(MediaSessionCompat.QueueItem queueItem) {
        return convertToMediaItem(queueItem.getDescription());
    }

    public static MediaItem convertToMediaItem(MediaDescriptionCompat mediaDescriptionCompat) {
        Assertions.checkNotNull(mediaDescriptionCompat);
        return convertToMediaItem(mediaDescriptionCompat, false, true);
    }

    public static MediaMetadata convertToMediaMetadata(@Nullable MediaDescriptionCompat mediaDescriptionCompat, int i) {
        return convertToMediaMetadata(mediaDescriptionCompat, i, false, true);
    }

    private static MediaMetadata convertToMediaMetadata(@Nullable MediaDescriptionCompat mediaDescriptionCompat, int i, boolean z, boolean z2) {
        byte[] bArr;
        if (mediaDescriptionCompat == null) {
            return MediaMetadata.EMPTY;
        }
        MediaMetadata.Builder builder = new MediaMetadata.Builder();
        builder.setSubtitle(mediaDescriptionCompat.getSubtitle()).setDescription(mediaDescriptionCompat.getDescription()).setArtworkUri(mediaDescriptionCompat.getIconUri()).setUserRating(convertToRating(RatingCompat.newUnratedRating(i)));
        Bitmap iconBitmap = mediaDescriptionCompat.getIconBitmap();
        if (iconBitmap != null) {
            try {
                bArr = convertToByteArray(iconBitmap);
            } catch (IOException e) {
                Log.w(TAG, "Failed to convert iconBitmap to artworkData", e);
                bArr = null;
            }
            builder.setArtworkData(bArr, 3);
        }
        Bundle extras = mediaDescriptionCompat.getExtras();
        Bundle bundle = extras != null ? new Bundle(extras) : null;
        if (bundle != null && bundle.containsKey(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE)) {
            builder.setFolderType(Integer.valueOf(convertToFolderType(bundle.getLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE))));
            bundle.remove(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE);
        }
        builder.setIsBrowsable(Boolean.valueOf(z));
        if (bundle != null && bundle.containsKey(MediaConstants.EXTRAS_KEY_MEDIA_TYPE_COMPAT)) {
            builder.setMediaType(Integer.valueOf((int) bundle.getLong(MediaConstants.EXTRAS_KEY_MEDIA_TYPE_COMPAT)));
            bundle.remove(MediaConstants.EXTRAS_KEY_MEDIA_TYPE_COMPAT);
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            builder.setSupportedCommands(com.google.common.collect.G.j((Collection) Assertions.checkNotNull(bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST"))));
        }
        if (bundle != null && bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            builder.setTitle(bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title"));
            builder.setDisplayTitle(mediaDescriptionCompat.getTitle());
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            builder.setTitle(mediaDescriptionCompat.getTitle());
        }
        if (bundle != null && !bundle.isEmpty()) {
            builder.setExtras(bundle);
        }
        builder.setIsPlayable(Boolean.valueOf(z2));
        return builder.build();
    }

    public static MediaItem convertToMediaItem(MediaMetadataCompat mediaMetadataCompat, int i) {
        return convertToMediaItem(mediaMetadataCompat.getString(MediaMetadataCompat.METADATA_KEY_MEDIA_ID), mediaMetadataCompat, i);
    }

    @Nullable
    @VisibleForTesting
    public static SessionError convertToSessionError(int i, int i2, @Nullable CharSequence charSequence, @Nullable Bundle bundle, Context context) {
        String sessionErrorMessage;
        if (i == 7 || i2 == 0) {
            return null;
        }
        int convertToSessionErrorCode = convertToSessionErrorCode(i2);
        if (charSequence != null) {
            sessionErrorMessage = charSequence.toString();
        } else {
            sessionErrorMessage = getSessionErrorMessage(convertToSessionErrorCode, context);
        }
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new SessionError(convertToSessionErrorCode, sessionErrorMessage, bundle);
    }

    public static AudioAttributes convertToAudioAttributes(@Nullable MediaControllerCompat.PlaybackInfo playbackInfo) {
        if (playbackInfo == null) {
            return AudioAttributes.DEFAULT;
        }
        return convertToAudioAttributes(playbackInfo.getAudioAttributes());
    }

    public static MediaItem convertToMediaItem(@Nullable String str, MediaMetadataCompat mediaMetadataCompat, int i) {
        MediaItem.Builder builder = new MediaItem.Builder();
        if (str != null) {
            builder.setMediaId(str);
        }
        String string = mediaMetadataCompat.getString(MediaMetadataCompat.METADATA_KEY_MEDIA_URI);
        if (string != null) {
            builder.setRequestMetadata(new MediaItem.RequestMetadata.Builder().setMediaUri(Uri.parse(string)).build());
        }
        builder.setMediaMetadata(convertToMediaMetadata(mediaMetadataCompat, i));
        return builder.build();
    }

    private static MediaItem convertToMediaItem(MediaDescriptionCompat mediaDescriptionCompat, boolean z, boolean z2) {
        String mediaId = mediaDescriptionCompat.getMediaId();
        MediaItem.Builder builder = new MediaItem.Builder();
        if (mediaId == null) {
            mediaId = "";
        }
        return builder.setMediaId(mediaId).setRequestMetadata(new MediaItem.RequestMetadata.Builder().setMediaUri(mediaDescriptionCompat.getMediaUri()).build()).setMediaMetadata(convertToMediaMetadata(mediaDescriptionCompat, 0, z, z2)).build();
    }

    public static MediaMetadata convertToMediaMetadata(@Nullable MediaMetadataCompat mediaMetadataCompat, int i) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (mediaMetadataCompat == null) {
            return MediaMetadata.EMPTY;
        }
        MediaMetadata.Builder builder = new MediaMetadata.Builder();
        CharSequence text = mediaMetadataCompat.getText(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
        if (text != null) {
            charSequence2 = mediaMetadataCompat.getText(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE);
            charSequence = mediaMetadataCompat.getText(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION);
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i2 = 0;
            int i3 = 0;
            while (i2 < 3) {
                String[] strArr = MediaMetadataCompat.PREFERRED_DESCRIPTION_ORDER;
                if (i3 >= strArr.length) {
                    break;
                }
                int i4 = i3 + 1;
                CharSequence text2 = mediaMetadataCompat.getText(strArr[i3]);
                if (!TextUtils.isEmpty(text2)) {
                    charSequenceArr[i2] = text2;
                    i2++;
                }
                i3 = i4;
            }
            CharSequence charSequence3 = charSequenceArr[0];
            CharSequence charSequence4 = charSequenceArr[1];
            charSequence = charSequenceArr[2];
            text = charSequence3;
            charSequence2 = charSequence4;
        }
        CharSequence text3 = mediaMetadataCompat.getText(MediaMetadataCompat.METADATA_KEY_TITLE);
        if (text3 == null) {
            text3 = text;
        }
        builder.setTitle(text3).setDisplayTitle(text).setSubtitle(charSequence2).setDescription(charSequence).setArtist(mediaMetadataCompat.getText(MediaMetadataCompat.METADATA_KEY_ARTIST)).setAlbumTitle(mediaMetadataCompat.getText(MediaMetadataCompat.METADATA_KEY_ALBUM)).setAlbumArtist(mediaMetadataCompat.getText(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST)).setOverallRating(convertToRating(mediaMetadataCompat.getRating(MediaMetadataCompat.METADATA_KEY_RATING)));
        if (mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            long j = mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
            if (j >= 0) {
                builder.setDurationMs(Long.valueOf(j));
            }
        }
        Rating convertToRating = convertToRating(mediaMetadataCompat.getRating(MediaMetadataCompat.METADATA_KEY_USER_RATING));
        if (convertToRating != null) {
            builder.setUserRating(convertToRating);
        } else {
            builder.setUserRating(convertToRating(RatingCompat.newUnratedRating(i)));
        }
        if (mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_YEAR)) {
            builder.setRecordingYear(Integer.valueOf((int) mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_YEAR)));
        }
        String firstString = getFirstString(mediaMetadataCompat, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, MediaMetadataCompat.METADATA_KEY_ART_URI);
        if (firstString != null) {
            builder.setArtworkUri(Uri.parse(firstString));
        }
        Bitmap firstBitmap = getFirstBitmap(mediaMetadataCompat, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, MediaMetadataCompat.METADATA_KEY_ALBUM_ART, MediaMetadataCompat.METADATA_KEY_ART);
        if (firstBitmap != null) {
            try {
                builder.setArtworkData(convertToByteArray(firstBitmap), 3);
            } catch (IOException e) {
                Log.w(TAG, "Failed to convert artworkBitmap to artworkData", e);
            }
        }
        boolean containsKey = mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        builder.setIsBrowsable(Boolean.valueOf(containsKey));
        if (containsKey) {
            builder.setFolderType(Integer.valueOf(convertToFolderType(mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE))));
        }
        if (mediaMetadataCompat.containsKey(MediaConstants.EXTRAS_KEY_MEDIA_TYPE_COMPAT)) {
            builder.setMediaType(Integer.valueOf((int) mediaMetadataCompat.getLong(MediaConstants.EXTRAS_KEY_MEDIA_TYPE_COMPAT)));
        }
        builder.setIsPlayable(Boolean.TRUE);
        Bundle bundle = mediaMetadataCompat.getBundle();
        com.google.common.collect.y0<String> it = KNOWN_METADATA_COMPAT_KEYS.iterator();
        while (it.hasNext()) {
            bundle.remove(it.next());
        }
        if (!bundle.isEmpty()) {
            builder.setExtras(bundle);
        }
        return builder.build();
    }
}
