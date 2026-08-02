package androidx.media3.common;

/* loaded from: classes7.dex */
public final class MediaMetadata {

    @java.lang.Deprecated
    public static final int FOLDER_TYPE_ALBUMS = 2;

    @java.lang.Deprecated
    public static final int FOLDER_TYPE_ARTISTS = 3;

    @java.lang.Deprecated
    public static final int FOLDER_TYPE_GENRES = 4;

    @java.lang.Deprecated
    public static final int FOLDER_TYPE_MIXED = 0;

    @java.lang.Deprecated
    public static final int FOLDER_TYPE_NONE = -1;

    @java.lang.Deprecated
    public static final int FOLDER_TYPE_PLAYLISTS = 5;

    @java.lang.Deprecated
    public static final int FOLDER_TYPE_TITLES = 1;

    @java.lang.Deprecated
    public static final int FOLDER_TYPE_YEARS = 6;
    public static final int MEDIA_TYPE_ALBUM = 10;
    public static final int MEDIA_TYPE_ARTIST = 11;
    public static final int MEDIA_TYPE_AUDIO_BOOK = 15;
    public static final int MEDIA_TYPE_AUDIO_BOOK_CHAPTER = 2;
    public static final int MEDIA_TYPE_FOLDER_ALBUMS = 21;
    public static final int MEDIA_TYPE_FOLDER_ARTISTS = 22;
    public static final int MEDIA_TYPE_FOLDER_AUDIO_BOOKS = 26;
    public static final int MEDIA_TYPE_FOLDER_GENRES = 23;
    public static final int MEDIA_TYPE_FOLDER_MIXED = 20;
    public static final int MEDIA_TYPE_FOLDER_MOVIES = 35;
    public static final int MEDIA_TYPE_FOLDER_NEWS = 32;
    public static final int MEDIA_TYPE_FOLDER_PLAYLISTS = 24;
    public static final int MEDIA_TYPE_FOLDER_PODCASTS = 27;
    public static final int MEDIA_TYPE_FOLDER_RADIO_STATIONS = 31;
    public static final int MEDIA_TYPE_FOLDER_TRAILERS = 34;
    public static final int MEDIA_TYPE_FOLDER_TV_CHANNELS = 28;
    public static final int MEDIA_TYPE_FOLDER_TV_SERIES = 29;
    public static final int MEDIA_TYPE_FOLDER_TV_SHOWS = 30;
    public static final int MEDIA_TYPE_FOLDER_VIDEOS = 33;
    public static final int MEDIA_TYPE_FOLDER_YEARS = 25;
    public static final int MEDIA_TYPE_GENRE = 12;
    public static final int MEDIA_TYPE_MIXED = 0;
    public static final int MEDIA_TYPE_MOVIE = 8;
    public static final int MEDIA_TYPE_MUSIC = 1;
    public static final int MEDIA_TYPE_NEWS = 5;
    public static final int MEDIA_TYPE_PLAYLIST = 13;
    public static final int MEDIA_TYPE_PODCAST = 16;
    public static final int MEDIA_TYPE_PODCAST_EPISODE = 3;
    public static final int MEDIA_TYPE_RADIO_STATION = 4;
    public static final int MEDIA_TYPE_TRAILER = 7;
    public static final int MEDIA_TYPE_TV_CHANNEL = 17;
    public static final int MEDIA_TYPE_TV_SEASON = 19;
    public static final int MEDIA_TYPE_TV_SERIES = 18;
    public static final int MEDIA_TYPE_TV_SHOW = 9;
    public static final int MEDIA_TYPE_VIDEO = 6;
    public static final int MEDIA_TYPE_YEAR = 14;
    public static final int PICTURE_TYPE_ARTIST_PERFORMER = 8;
    public static final int PICTURE_TYPE_A_BRIGHT_COLORED_FISH = 17;
    public static final int PICTURE_TYPE_BACK_COVER = 4;
    public static final int PICTURE_TYPE_BAND_ARTIST_LOGO = 19;
    public static final int PICTURE_TYPE_BAND_ORCHESTRA = 10;
    public static final int PICTURE_TYPE_COMPOSER = 11;
    public static final int PICTURE_TYPE_CONDUCTOR = 9;
    public static final int PICTURE_TYPE_DURING_PERFORMANCE = 15;
    public static final int PICTURE_TYPE_DURING_RECORDING = 14;
    public static final int PICTURE_TYPE_FILE_ICON = 1;
    public static final int PICTURE_TYPE_FILE_ICON_OTHER = 2;
    public static final int PICTURE_TYPE_FRONT_COVER = 3;
    public static final int PICTURE_TYPE_ILLUSTRATION = 18;
    public static final int PICTURE_TYPE_LEAD_ARTIST_PERFORMER = 7;
    public static final int PICTURE_TYPE_LEAFLET_PAGE = 5;
    public static final int PICTURE_TYPE_LYRICIST = 12;
    public static final int PICTURE_TYPE_MEDIA = 6;
    public static final int PICTURE_TYPE_MOVIE_VIDEO_SCREEN_CAPTURE = 16;
    public static final int PICTURE_TYPE_OTHER = 0;
    public static final int PICTURE_TYPE_PUBLISHER_STUDIO_LOGO = 20;
    public static final int PICTURE_TYPE_RECORDING_LOCATION = 13;
    public final java.lang.CharSequence albumArtist;
    public final java.lang.CharSequence albumTitle;
    public final java.lang.CharSequence artist;
    public final byte[] artworkData;
    public final java.lang.Integer artworkDataType;
    public final android.net.Uri artworkUri;
    public final java.lang.CharSequence compilation;
    public final java.lang.CharSequence composer;
    public final java.lang.CharSequence conductor;
    public final java.lang.CharSequence description;
    public final java.lang.Integer discNumber;
    public final java.lang.CharSequence displayTitle;
    public final java.lang.Long durationMs;
    public final android.os.Bundle extras;

    @java.lang.Deprecated
    public final java.lang.Integer folderType;
    public final java.lang.CharSequence genre;
    public final java.lang.Boolean isBrowsable;
    public final java.lang.Boolean isPlayable;
    public final java.lang.Integer mediaType;
    public final androidx.media3.common.Rating overallRating;
    public final java.lang.Integer recordingDay;
    public final java.lang.Integer recordingMonth;
    public final java.lang.Integer recordingYear;
    public final java.lang.Integer releaseDay;
    public final java.lang.Integer releaseMonth;
    public final java.lang.Integer releaseYear;
    public final java.lang.CharSequence station;
    public final java.lang.CharSequence subtitle;
    public final com.google.common.collect.ImmutableList<java.lang.String> supportedCommands;
    public final java.lang.CharSequence title;
    public final java.lang.Integer totalDiscCount;
    public final java.lang.Integer totalTrackCount;
    public final java.lang.Integer trackNumber;
    public final androidx.media3.common.Rating userRating;
    public final java.lang.CharSequence writer;

    @java.lang.Deprecated
    public final java.lang.Integer year;
    public static final androidx.media3.common.MediaMetadata EMPTY = new androidx.media3.common.MediaMetadata.Builder().build();
    private static final java.lang.String _CREATION = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String getOutputStallDuration = androidx.media3.common.util.Util.intToStringMaxRadix(4);

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f2740a = androidx.media3.common.util.Util.intToStringMaxRadix(5);
    private static final java.lang.String getOutputMinFrameDuration = androidx.media3.common.util.Util.intToStringMaxRadix(6);
    private static final java.lang.String init = androidx.media3.common.util.Util.intToStringMaxRadix(8);
    private static final java.lang.String isOutputSupportedFor = androidx.media3.common.util.Util.intToStringMaxRadix(9);
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(10);
    private static final java.lang.String getOutputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(11);
    private static final java.lang.String kernelVersion = androidx.media3.common.util.Util.intToStringMaxRadix(12);
    private static final java.lang.String d = androidx.media3.common.util.Util.intToStringMaxRadix(13);
    private static final java.lang.String getOutputSizes = androidx.media3.common.util.Util.intToStringMaxRadix(14);
    private static final java.lang.String getValidOutputFormatsForInputhNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(15);
    private static final java.lang.String accessartificialFrame = androidx.media3.common.util.Util.intToStringMaxRadix(16);
    private static final java.lang.String coroutineBoundary = androidx.media3.common.util.Util.intToStringMaxRadix(17);
    private static final java.lang.String ArtificialStackFrames = androidx.media3.common.util.Util.intToStringMaxRadix(18);
    private static final java.lang.String _BOUNDARY = androidx.media3.common.util.Util.intToStringMaxRadix(19);
    private static final java.lang.String CoroutineDebuggingKt = androidx.media3.common.util.Util.intToStringMaxRadix(20);
    private static final java.lang.String coroutineCreation = androidx.media3.common.util.Util.intToStringMaxRadix(21);
    private static final java.lang.String c = androidx.media3.common.util.Util.intToStringMaxRadix(22);
    private static final java.lang.String getInputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(23);
    private static final java.lang.String getInputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(24);
    private static final java.lang.String getOutputMinFrameDurationlomOqCM = androidx.media3.common.util.Util.intToStringMaxRadix(25);
    private static final java.lang.String AMEXKernel = androidx.media3.common.util.Util.intToStringMaxRadix(26);
    private static final java.lang.String unwrapAs = androidx.media3.common.util.Util.intToStringMaxRadix(27);
    private static final java.lang.String getHighSpeedVideoSizesFor = androidx.media3.common.util.Util.intToStringMaxRadix(28);
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(29);
    private static final java.lang.String b = androidx.media3.common.util.Util.intToStringMaxRadix(30);
    private static final java.lang.String isOutputSupportedForhNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(31);
    private static final java.lang.String toString = androidx.media3.common.util.Util.intToStringMaxRadix(32);
    private static final java.lang.String getOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(33);
    private static final java.lang.String getARTIFICIAL_FRAME_PACKAGE_NAME = androidx.media3.common.util.Util.intToStringMaxRadix(34);
    private static final java.lang.String getOutputStallDurationlomOqCM = androidx.media3.common.util.Util.intToStringMaxRadix(1000);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.Deprecated
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FolderType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface MediaType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface PictureType {
    }

    /* synthetic */ MediaMetadata(androidx.media3.common.MediaMetadata.Builder builder, byte b2) {
        this(builder);
    }

    public static final class Builder {
        private java.lang.Integer AMEXKernel;
        private java.lang.Integer ArtificialStackFrames;
        private java.lang.CharSequence Camera2StreamConfigurationMap;
        private java.lang.Integer CoroutineDebuggingKt;
        private java.lang.CharSequence _BOUNDARY;
        private java.lang.CharSequence _CREATION;

        /* renamed from: a, reason: collision with root package name */
        private java.lang.CharSequence f2741a;
        private java.lang.Integer accessartificialFrame;
        private java.lang.Integer b;
        private java.lang.CharSequence c;
        private java.lang.Integer coroutineBoundary;
        private java.lang.Integer coroutineCreation;
        private androidx.media3.common.Rating d;
        private com.google.common.collect.ImmutableList<java.lang.String> getARTIFICIAL_FRAME_PACKAGE_NAME;
        private java.lang.Integer getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.CharSequence getHighSpeedVideoFpsRanges;
        private java.lang.CharSequence getHighSpeedVideoFpsRangesFor;
        private byte[] getHighSpeedVideoSizes;
        private android.net.Uri getHighSpeedVideoSizesFor;
        private java.lang.CharSequence getInputFormats;
        private java.lang.CharSequence getInputSizeshNQ4ISI;
        private java.lang.CharSequence getOutputFormats;
        private java.lang.CharSequence getOutputMinFrameDuration;
        private java.lang.CharSequence getOutputMinFrameDurationlomOqCM;
        private java.lang.Long getOutputSizes;
        private android.os.Bundle getOutputSizeshNQ4ISI;
        private java.lang.Integer getOutputStallDuration;
        private java.lang.Integer getOutputStallDurationlomOqCM;
        private java.lang.Boolean getValidOutputFormatsForInputhNQ4ISI;
        private java.lang.Integer init;
        private java.lang.Integer isOutputSupportedFor;
        private java.lang.Boolean isOutputSupportedForhNQ4ISI;
        private java.lang.Integer kernelVersion;
        private androidx.media3.common.Rating toString;
        private java.lang.CharSequence unwrapAs;

        /* synthetic */ Builder(androidx.media3.common.MediaMetadata mediaMetadata, byte b) {
            this(mediaMetadata);
        }

        public Builder() {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = com.google.common.collect.ImmutableList.of();
        }

        private Builder(androidx.media3.common.MediaMetadata mediaMetadata) {
            this.f2741a = mediaMetadata.title;
            this.getHighSpeedVideoFpsRangesFor = mediaMetadata.artist;
            this.Camera2StreamConfigurationMap = mediaMetadata.albumTitle;
            this.getHighSpeedVideoFpsRanges = mediaMetadata.albumArtist;
            this.getOutputMinFrameDurationlomOqCM = mediaMetadata.displayTitle;
            this._BOUNDARY = mediaMetadata.subtitle;
            this.getOutputFormats = mediaMetadata.description;
            this.getOutputSizes = mediaMetadata.durationMs;
            this.d = mediaMetadata.userRating;
            this.toString = mediaMetadata.overallRating;
            this.getHighSpeedVideoSizes = mediaMetadata.artworkData;
            this.getHighResolutionOutputSizeshNQ4ISI = mediaMetadata.artworkDataType;
            this.getHighSpeedVideoSizesFor = mediaMetadata.artworkUri;
            this.AMEXKernel = mediaMetadata.trackNumber;
            this.kernelVersion = mediaMetadata.totalTrackCount;
            this.getOutputStallDuration = mediaMetadata.folderType;
            this.getValidOutputFormatsForInputhNQ4ISI = mediaMetadata.isBrowsable;
            this.isOutputSupportedForhNQ4ISI = mediaMetadata.isPlayable;
            this.accessartificialFrame = mediaMetadata.recordingYear;
            this.coroutineBoundary = mediaMetadata.recordingMonth;
            this.ArtificialStackFrames = mediaMetadata.recordingDay;
            this.b = mediaMetadata.releaseYear;
            this.CoroutineDebuggingKt = mediaMetadata.releaseMonth;
            this.coroutineCreation = mediaMetadata.releaseDay;
            this.c = mediaMetadata.writer;
            this.getOutputMinFrameDuration = mediaMetadata.composer;
            this.getInputFormats = mediaMetadata.conductor;
            this.getOutputStallDurationlomOqCM = mediaMetadata.discNumber;
            this.init = mediaMetadata.totalDiscCount;
            this.unwrapAs = mediaMetadata.genre;
            this.getInputSizeshNQ4ISI = mediaMetadata.compilation;
            this._CREATION = mediaMetadata.station;
            this.isOutputSupportedFor = mediaMetadata.mediaType;
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = mediaMetadata.supportedCommands;
            this.getOutputSizeshNQ4ISI = mediaMetadata.extras;
        }

        public final androidx.media3.common.MediaMetadata.Builder setTitle(java.lang.CharSequence charSequence) {
            this.f2741a = charSequence;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setArtist(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoFpsRangesFor = charSequence;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setAlbumTitle(java.lang.CharSequence charSequence) {
            this.Camera2StreamConfigurationMap = charSequence;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setAlbumArtist(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoFpsRanges = charSequence;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setDisplayTitle(java.lang.CharSequence charSequence) {
            this.getOutputMinFrameDurationlomOqCM = charSequence;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setSubtitle(java.lang.CharSequence charSequence) {
            this._BOUNDARY = charSequence;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setDescription(java.lang.CharSequence charSequence) {
            this.getOutputFormats = charSequence;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setDurationMs(java.lang.Long l) {
            com.google.common.base.Preconditions.checkArgument(l == null || l.longValue() >= 0);
            this.getOutputSizes = l;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setUserRating(androidx.media3.common.Rating rating) {
            this.d = rating;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setOverallRating(androidx.media3.common.Rating rating) {
            this.toString = rating;
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaMetadata.Builder setArtworkData(byte[] bArr) {
            return setArtworkData(bArr, null);
        }

        public final androidx.media3.common.MediaMetadata.Builder setArtworkData(byte[] bArr, java.lang.Integer num) {
            this.getHighSpeedVideoSizes = bArr == null ? null : (byte[]) bArr.clone();
            this.getHighResolutionOutputSizeshNQ4ISI = num;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder maybeSetArtworkData(byte[] bArr, int i) {
            if (this.getHighSpeedVideoSizes != null && i != 3 && java.util.Objects.equals(this.getHighResolutionOutputSizeshNQ4ISI, 3)) {
                return this;
            }
            this.getHighSpeedVideoSizes = (byte[]) bArr.clone();
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Integer.valueOf(i);
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setArtworkUri(android.net.Uri uri) {
            this.getHighSpeedVideoSizesFor = uri;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setTrackNumber(java.lang.Integer num) {
            this.AMEXKernel = num;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setTotalTrackCount(java.lang.Integer num) {
            this.kernelVersion = num;
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaMetadata.Builder setFolderType(java.lang.Integer num) {
            this.getOutputStallDuration = num;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setIsBrowsable(java.lang.Boolean bool) {
            this.getValidOutputFormatsForInputhNQ4ISI = bool;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setIsPlayable(java.lang.Boolean bool) {
            this.isOutputSupportedForhNQ4ISI = bool;
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaMetadata.Builder setYear(java.lang.Integer num) {
            return setRecordingYear(num);
        }

        public final androidx.media3.common.MediaMetadata.Builder setRecordingYear(java.lang.Integer num) {
            this.accessartificialFrame = num;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setRecordingMonth(java.lang.Integer num) {
            this.coroutineBoundary = num;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setRecordingDay(java.lang.Integer num) {
            this.ArtificialStackFrames = num;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setReleaseYear(java.lang.Integer num) {
            this.b = num;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setReleaseMonth(java.lang.Integer num) {
            this.CoroutineDebuggingKt = num;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setReleaseDay(java.lang.Integer num) {
            this.coroutineCreation = num;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setWriter(java.lang.CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setComposer(java.lang.CharSequence charSequence) {
            this.getOutputMinFrameDuration = charSequence;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setConductor(java.lang.CharSequence charSequence) {
            this.getInputFormats = charSequence;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setDiscNumber(java.lang.Integer num) {
            this.getOutputStallDurationlomOqCM = num;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setTotalDiscCount(java.lang.Integer num) {
            this.init = num;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setGenre(java.lang.CharSequence charSequence) {
            this.unwrapAs = charSequence;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setCompilation(java.lang.CharSequence charSequence) {
            this.getInputSizeshNQ4ISI = charSequence;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setStation(java.lang.CharSequence charSequence) {
            this._CREATION = charSequence;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setMediaType(java.lang.Integer num) {
            this.isOutputSupportedFor = num;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setExtras(android.os.Bundle bundle) {
            this.getOutputSizeshNQ4ISI = bundle;
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder setSupportedCommands(java.util.List<java.lang.String> list) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder populateFromMetadata(androidx.media3.common.Metadata metadata) {
            for (int i = 0; i < metadata.length(); i++) {
                metadata.get(i).populateMediaMetadata(this);
            }
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder populateFromMetadata(java.util.List<androidx.media3.common.Metadata> list) {
            for (int i = 0; i < list.size(); i++) {
                androidx.media3.common.Metadata metadata = list.get(i);
                for (int i2 = 0; i2 < metadata.length(); i2++) {
                    metadata.get(i2).populateMediaMetadata(this);
                }
            }
            return this;
        }

        public final androidx.media3.common.MediaMetadata.Builder populate(androidx.media3.common.MediaMetadata mediaMetadata) {
            if (mediaMetadata != null) {
                if (mediaMetadata.title != null) {
                    setTitle(mediaMetadata.title);
                }
                if (mediaMetadata.artist != null) {
                    setArtist(mediaMetadata.artist);
                }
                if (mediaMetadata.albumTitle != null) {
                    setAlbumTitle(mediaMetadata.albumTitle);
                }
                if (mediaMetadata.albumArtist != null) {
                    setAlbumArtist(mediaMetadata.albumArtist);
                }
                if (mediaMetadata.displayTitle != null) {
                    setDisplayTitle(mediaMetadata.displayTitle);
                }
                if (mediaMetadata.subtitle != null) {
                    setSubtitle(mediaMetadata.subtitle);
                }
                if (mediaMetadata.description != null) {
                    setDescription(mediaMetadata.description);
                }
                if (mediaMetadata.durationMs != null) {
                    setDurationMs(mediaMetadata.durationMs);
                }
                if (mediaMetadata.userRating != null) {
                    setUserRating(mediaMetadata.userRating);
                }
                if (mediaMetadata.overallRating != null) {
                    setOverallRating(mediaMetadata.overallRating);
                }
                if (mediaMetadata.artworkUri != null || mediaMetadata.artworkData != null) {
                    setArtworkUri(mediaMetadata.artworkUri);
                    setArtworkData(mediaMetadata.artworkData, mediaMetadata.artworkDataType);
                }
                if (mediaMetadata.trackNumber != null) {
                    setTrackNumber(mediaMetadata.trackNumber);
                }
                if (mediaMetadata.totalTrackCount != null) {
                    setTotalTrackCount(mediaMetadata.totalTrackCount);
                }
                if (mediaMetadata.folderType != null) {
                    setFolderType(mediaMetadata.folderType);
                }
                if (mediaMetadata.isBrowsable != null) {
                    setIsBrowsable(mediaMetadata.isBrowsable);
                }
                if (mediaMetadata.isPlayable != null) {
                    setIsPlayable(mediaMetadata.isPlayable);
                }
                if (mediaMetadata.year != null) {
                    setRecordingYear(mediaMetadata.year);
                }
                if (mediaMetadata.recordingYear != null) {
                    setRecordingYear(mediaMetadata.recordingYear);
                }
                if (mediaMetadata.recordingMonth != null) {
                    setRecordingMonth(mediaMetadata.recordingMonth);
                }
                if (mediaMetadata.recordingDay != null) {
                    setRecordingDay(mediaMetadata.recordingDay);
                }
                if (mediaMetadata.releaseYear != null) {
                    setReleaseYear(mediaMetadata.releaseYear);
                }
                if (mediaMetadata.releaseMonth != null) {
                    setReleaseMonth(mediaMetadata.releaseMonth);
                }
                if (mediaMetadata.releaseDay != null) {
                    setReleaseDay(mediaMetadata.releaseDay);
                }
                if (mediaMetadata.writer != null) {
                    setWriter(mediaMetadata.writer);
                }
                if (mediaMetadata.composer != null) {
                    setComposer(mediaMetadata.composer);
                }
                if (mediaMetadata.conductor != null) {
                    setConductor(mediaMetadata.conductor);
                }
                if (mediaMetadata.discNumber != null) {
                    setDiscNumber(mediaMetadata.discNumber);
                }
                if (mediaMetadata.totalDiscCount != null) {
                    setTotalDiscCount(mediaMetadata.totalDiscCount);
                }
                if (mediaMetadata.genre != null) {
                    setGenre(mediaMetadata.genre);
                }
                if (mediaMetadata.compilation != null) {
                    setCompilation(mediaMetadata.compilation);
                }
                if (mediaMetadata.station != null) {
                    setStation(mediaMetadata.station);
                }
                if (mediaMetadata.mediaType != null) {
                    setMediaType(mediaMetadata.mediaType);
                }
                if (mediaMetadata.extras != null) {
                    setExtras(mediaMetadata.extras);
                }
                if (!mediaMetadata.supportedCommands.isEmpty()) {
                    setSupportedCommands(mediaMetadata.supportedCommands);
                }
            }
            return this;
        }

        public final androidx.media3.common.MediaMetadata build() {
            return new androidx.media3.common.MediaMetadata(this, (byte) 0);
        }
    }

    private MediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        java.lang.Boolean bool = builder.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Integer num = builder.getOutputStallDuration;
        java.lang.Integer num2 = builder.isOutputSupportedFor;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                num = java.lang.Integer.valueOf(i2);
            }
        } else if (num != null) {
            bool = java.lang.Boolean.valueOf(num.intValue() != -1);
            if (bool.booleanValue() && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = java.lang.Integer.valueOf(i2);
            }
        }
        this.title = builder.f2741a;
        this.artist = builder.getHighSpeedVideoFpsRangesFor;
        this.albumTitle = builder.Camera2StreamConfigurationMap;
        this.albumArtist = builder.getHighSpeedVideoFpsRanges;
        this.displayTitle = builder.getOutputMinFrameDurationlomOqCM;
        this.subtitle = builder._BOUNDARY;
        this.description = builder.getOutputFormats;
        this.durationMs = builder.getOutputSizes;
        this.userRating = builder.d;
        this.overallRating = builder.toString;
        this.artworkData = builder.getHighSpeedVideoSizes;
        this.artworkDataType = builder.getHighResolutionOutputSizeshNQ4ISI;
        this.artworkUri = builder.getHighSpeedVideoSizesFor;
        this.trackNumber = builder.AMEXKernel;
        this.totalTrackCount = builder.kernelVersion;
        this.folderType = num;
        this.isBrowsable = bool;
        this.isPlayable = builder.isOutputSupportedForhNQ4ISI;
        this.year = builder.accessartificialFrame;
        this.recordingYear = builder.accessartificialFrame;
        this.recordingMonth = builder.coroutineBoundary;
        this.recordingDay = builder.ArtificialStackFrames;
        this.releaseYear = builder.b;
        this.releaseMonth = builder.CoroutineDebuggingKt;
        this.releaseDay = builder.coroutineCreation;
        this.writer = builder.c;
        this.composer = builder.getOutputMinFrameDuration;
        this.conductor = builder.getInputFormats;
        this.discNumber = builder.getOutputStallDurationlomOqCM;
        this.totalDiscCount = builder.init;
        this.genre = builder.unwrapAs;
        this.compilation = builder.getInputSizeshNQ4ISI;
        this.station = builder._CREATION;
        this.mediaType = num2;
        this.supportedCommands = builder.getARTIFICIAL_FRAME_PACKAGE_NAME;
        this.extras = builder.getOutputSizeshNQ4ISI;
    }

    public final androidx.media3.common.MediaMetadata.Builder buildUpon() {
        return new androidx.media3.common.MediaMetadata.Builder(this, (byte) 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            androidx.media3.common.MediaMetadata mediaMetadata = (androidx.media3.common.MediaMetadata) obj;
            if (java.util.Objects.equals(this.title, mediaMetadata.title) && java.util.Objects.equals(this.artist, mediaMetadata.artist) && java.util.Objects.equals(this.albumTitle, mediaMetadata.albumTitle) && java.util.Objects.equals(this.albumArtist, mediaMetadata.albumArtist) && java.util.Objects.equals(this.displayTitle, mediaMetadata.displayTitle) && java.util.Objects.equals(this.subtitle, mediaMetadata.subtitle) && java.util.Objects.equals(this.description, mediaMetadata.description) && java.util.Objects.equals(this.durationMs, mediaMetadata.durationMs) && java.util.Objects.equals(this.userRating, mediaMetadata.userRating) && java.util.Objects.equals(this.overallRating, mediaMetadata.overallRating) && java.util.Arrays.equals(this.artworkData, mediaMetadata.artworkData) && java.util.Objects.equals(this.artworkDataType, mediaMetadata.artworkDataType) && java.util.Objects.equals(this.artworkUri, mediaMetadata.artworkUri) && java.util.Objects.equals(this.trackNumber, mediaMetadata.trackNumber) && java.util.Objects.equals(this.totalTrackCount, mediaMetadata.totalTrackCount) && java.util.Objects.equals(this.folderType, mediaMetadata.folderType) && java.util.Objects.equals(this.isBrowsable, mediaMetadata.isBrowsable) && java.util.Objects.equals(this.isPlayable, mediaMetadata.isPlayable) && java.util.Objects.equals(this.recordingYear, mediaMetadata.recordingYear) && java.util.Objects.equals(this.recordingMonth, mediaMetadata.recordingMonth) && java.util.Objects.equals(this.recordingDay, mediaMetadata.recordingDay) && java.util.Objects.equals(this.releaseYear, mediaMetadata.releaseYear) && java.util.Objects.equals(this.releaseMonth, mediaMetadata.releaseMonth) && java.util.Objects.equals(this.releaseDay, mediaMetadata.releaseDay) && java.util.Objects.equals(this.writer, mediaMetadata.writer) && java.util.Objects.equals(this.composer, mediaMetadata.composer) && java.util.Objects.equals(this.conductor, mediaMetadata.conductor) && java.util.Objects.equals(this.discNumber, mediaMetadata.discNumber) && java.util.Objects.equals(this.totalDiscCount, mediaMetadata.totalDiscCount) && java.util.Objects.equals(this.genre, mediaMetadata.genre) && java.util.Objects.equals(this.compilation, mediaMetadata.compilation) && java.util.Objects.equals(this.station, mediaMetadata.station) && java.util.Objects.equals(this.mediaType, mediaMetadata.mediaType) && java.util.Objects.equals(this.supportedCommands, mediaMetadata.supportedCommands)) {
                if ((this.extras == null) == (mediaMetadata.extras == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.CharSequence charSequence = this.title;
        java.lang.CharSequence charSequence2 = this.artist;
        java.lang.CharSequence charSequence3 = this.albumTitle;
        java.lang.CharSequence charSequence4 = this.albumArtist;
        java.lang.CharSequence charSequence5 = this.displayTitle;
        java.lang.CharSequence charSequence6 = this.subtitle;
        java.lang.CharSequence charSequence7 = this.description;
        java.lang.Long l = this.durationMs;
        androidx.media3.common.Rating rating = this.userRating;
        androidx.media3.common.Rating rating2 = this.overallRating;
        int hashCode = java.util.Arrays.hashCode(this.artworkData);
        return java.util.Objects.hash(charSequence, charSequence2, charSequence3, charSequence4, charSequence5, charSequence6, charSequence7, l, rating, rating2, java.lang.Integer.valueOf(hashCode), this.artworkDataType, this.artworkUri, this.trackNumber, this.totalTrackCount, this.folderType, this.isBrowsable, this.isPlayable, this.recordingYear, this.recordingMonth, this.recordingDay, this.releaseYear, this.releaseMonth, this.releaseDay, this.writer, this.composer, this.conductor, this.discNumber, this.totalDiscCount, this.genre, this.compilation, this.station, this.mediaType, java.lang.Boolean.valueOf(this.extras == null), this.supportedCommands);
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.CharSequence charSequence = this.title;
        if (charSequence != null) {
            bundle.putCharSequence(_CREATION, charSequence);
        }
        java.lang.CharSequence charSequence2 = this.artist;
        if (charSequence2 != null) {
            bundle.putCharSequence(getHighSpeedVideoSizes, charSequence2);
        }
        java.lang.CharSequence charSequence3 = this.albumTitle;
        if (charSequence3 != null) {
            bundle.putCharSequence(Camera2StreamConfigurationMap, charSequence3);
        }
        java.lang.CharSequence charSequence4 = this.albumArtist;
        if (charSequence4 != null) {
            bundle.putCharSequence(getHighSpeedVideoFpsRanges, charSequence4);
        }
        java.lang.CharSequence charSequence5 = this.displayTitle;
        if (charSequence5 != null) {
            bundle.putCharSequence(getOutputStallDuration, charSequence5);
        }
        java.lang.CharSequence charSequence6 = this.subtitle;
        if (charSequence6 != null) {
            bundle.putCharSequence(f2740a, charSequence6);
        }
        java.lang.CharSequence charSequence7 = this.description;
        if (charSequence7 != null) {
            bundle.putCharSequence(getOutputMinFrameDuration, charSequence7);
        }
        java.lang.Long l = this.durationMs;
        if (l != null) {
            bundle.putLong(getOutputSizeshNQ4ISI, l.longValue());
        }
        byte[] bArr = this.artworkData;
        if (bArr != null) {
            bundle.putByteArray(getHighSpeedVideoFpsRangesFor, bArr);
        }
        android.net.Uri uri = this.artworkUri;
        if (uri != null) {
            bundle.putParcelable(getOutputFormats, uri);
        }
        java.lang.CharSequence charSequence8 = this.writer;
        if (charSequence8 != null) {
            bundle.putCharSequence(c, charSequence8);
        }
        java.lang.CharSequence charSequence9 = this.composer;
        if (charSequence9 != null) {
            bundle.putCharSequence(getInputFormats, charSequence9);
        }
        java.lang.CharSequence charSequence10 = this.conductor;
        if (charSequence10 != null) {
            bundle.putCharSequence(getInputSizeshNQ4ISI, charSequence10);
        }
        java.lang.CharSequence charSequence11 = this.genre;
        if (charSequence11 != null) {
            bundle.putCharSequence(unwrapAs, charSequence11);
        }
        java.lang.CharSequence charSequence12 = this.compilation;
        if (charSequence12 != null) {
            bundle.putCharSequence(getHighSpeedVideoSizesFor, charSequence12);
        }
        java.lang.CharSequence charSequence13 = this.station;
        if (charSequence13 != null) {
            bundle.putCharSequence(b, charSequence13);
        }
        androidx.media3.common.Rating rating = this.userRating;
        if (rating != null) {
            bundle.putBundle(init, rating.toBundle());
        }
        androidx.media3.common.Rating rating2 = this.overallRating;
        if (rating2 != null) {
            bundle.putBundle(isOutputSupportedFor, rating2.toBundle());
        }
        java.lang.Integer num = this.trackNumber;
        if (num != null) {
            bundle.putInt(kernelVersion, num.intValue());
        }
        java.lang.Integer num2 = this.totalTrackCount;
        if (num2 != null) {
            bundle.putInt(d, num2.intValue());
        }
        java.lang.Integer num3 = this.folderType;
        if (num3 != null) {
            bundle.putInt(getOutputSizes, num3.intValue());
        }
        java.lang.Boolean bool = this.isBrowsable;
        if (bool != null) {
            bundle.putBoolean(toString, bool.booleanValue());
        }
        java.lang.Boolean bool2 = this.isPlayable;
        if (bool2 != null) {
            bundle.putBoolean(getValidOutputFormatsForInputhNQ4ISI, bool2.booleanValue());
        }
        java.lang.Integer num4 = this.recordingYear;
        if (num4 != null) {
            bundle.putInt(accessartificialFrame, num4.intValue());
        }
        java.lang.Integer num5 = this.recordingMonth;
        if (num5 != null) {
            bundle.putInt(coroutineBoundary, num5.intValue());
        }
        java.lang.Integer num6 = this.recordingDay;
        if (num6 != null) {
            bundle.putInt(ArtificialStackFrames, num6.intValue());
        }
        java.lang.Integer num7 = this.releaseYear;
        if (num7 != null) {
            bundle.putInt(_BOUNDARY, num7.intValue());
        }
        java.lang.Integer num8 = this.releaseMonth;
        if (num8 != null) {
            bundle.putInt(CoroutineDebuggingKt, num8.intValue());
        }
        java.lang.Integer num9 = this.releaseDay;
        if (num9 != null) {
            bundle.putInt(coroutineCreation, num9.intValue());
        }
        java.lang.Integer num10 = this.discNumber;
        if (num10 != null) {
            bundle.putInt(getOutputMinFrameDurationlomOqCM, num10.intValue());
        }
        java.lang.Integer num11 = this.totalDiscCount;
        if (num11 != null) {
            bundle.putInt(AMEXKernel, num11.intValue());
        }
        java.lang.Integer num12 = this.artworkDataType;
        if (num12 != null) {
            bundle.putInt(getHighResolutionOutputSizeshNQ4ISI, num12.intValue());
        }
        java.lang.Integer num13 = this.mediaType;
        if (num13 != null) {
            bundle.putInt(isOutputSupportedForhNQ4ISI, num13.intValue());
        }
        if (!this.supportedCommands.isEmpty()) {
            bundle.putStringArrayList(getARTIFICIAL_FRAME_PACKAGE_NAME, new java.util.ArrayList<>(this.supportedCommands));
        }
        android.os.Bundle bundle2 = this.extras;
        if (bundle2 != null) {
            bundle.putBundle(getOutputStallDurationlomOqCM, bundle2);
        }
        return bundle;
    }

    public static androidx.media3.common.MediaMetadata fromBundle(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        android.os.Bundle bundle3;
        androidx.media3.common.MediaMetadata.Builder builder = new androidx.media3.common.MediaMetadata.Builder();
        androidx.media3.common.MediaMetadata.Builder description = builder.setTitle(bundle.getCharSequence(_CREATION)).setArtist(bundle.getCharSequence(getHighSpeedVideoSizes)).setAlbumTitle(bundle.getCharSequence(Camera2StreamConfigurationMap)).setAlbumArtist(bundle.getCharSequence(getHighSpeedVideoFpsRanges)).setDisplayTitle(bundle.getCharSequence(getOutputStallDuration)).setSubtitle(bundle.getCharSequence(f2740a)).setDescription(bundle.getCharSequence(getOutputMinFrameDuration));
        byte[] byteArray = bundle.getByteArray(getHighSpeedVideoFpsRangesFor);
        java.lang.String str = getHighResolutionOutputSizeshNQ4ISI;
        description.setArtworkData(byteArray, bundle.containsKey(str) ? java.lang.Integer.valueOf(bundle.getInt(str)) : null).setArtworkUri((android.net.Uri) bundle.getParcelable(getOutputFormats)).setWriter(bundle.getCharSequence(c)).setComposer(bundle.getCharSequence(getInputFormats)).setConductor(bundle.getCharSequence(getInputSizeshNQ4ISI)).setGenre(bundle.getCharSequence(unwrapAs)).setCompilation(bundle.getCharSequence(getHighSpeedVideoSizesFor)).setStation(bundle.getCharSequence(b)).setExtras(bundle.getBundle(getOutputStallDurationlomOqCM));
        java.lang.String str2 = init;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            builder.setUserRating(androidx.media3.common.Rating.fromBundle(bundle3));
        }
        java.lang.String str3 = isOutputSupportedFor;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            builder.setOverallRating(androidx.media3.common.Rating.fromBundle(bundle2));
        }
        java.lang.String str4 = getOutputSizeshNQ4ISI;
        if (bundle.containsKey(str4)) {
            builder.setDurationMs(java.lang.Long.valueOf(bundle.getLong(str4)));
        }
        java.lang.String str5 = kernelVersion;
        if (bundle.containsKey(str5)) {
            builder.setTrackNumber(java.lang.Integer.valueOf(bundle.getInt(str5)));
        }
        java.lang.String str6 = d;
        if (bundle.containsKey(str6)) {
            builder.setTotalTrackCount(java.lang.Integer.valueOf(bundle.getInt(str6)));
        }
        java.lang.String str7 = getOutputSizes;
        if (bundle.containsKey(str7)) {
            builder.setFolderType(java.lang.Integer.valueOf(bundle.getInt(str7)));
        }
        java.lang.String str8 = toString;
        if (bundle.containsKey(str8)) {
            builder.setIsBrowsable(java.lang.Boolean.valueOf(bundle.getBoolean(str8)));
        }
        java.lang.String str9 = getValidOutputFormatsForInputhNQ4ISI;
        if (bundle.containsKey(str9)) {
            builder.setIsPlayable(java.lang.Boolean.valueOf(bundle.getBoolean(str9)));
        }
        java.lang.String str10 = accessartificialFrame;
        if (bundle.containsKey(str10)) {
            builder.setRecordingYear(java.lang.Integer.valueOf(bundle.getInt(str10)));
        }
        java.lang.String str11 = coroutineBoundary;
        if (bundle.containsKey(str11)) {
            builder.setRecordingMonth(java.lang.Integer.valueOf(bundle.getInt(str11)));
        }
        java.lang.String str12 = ArtificialStackFrames;
        if (bundle.containsKey(str12)) {
            builder.setRecordingDay(java.lang.Integer.valueOf(bundle.getInt(str12)));
        }
        java.lang.String str13 = _BOUNDARY;
        if (bundle.containsKey(str13)) {
            builder.setReleaseYear(java.lang.Integer.valueOf(bundle.getInt(str13)));
        }
        java.lang.String str14 = CoroutineDebuggingKt;
        if (bundle.containsKey(str14)) {
            builder.setReleaseMonth(java.lang.Integer.valueOf(bundle.getInt(str14)));
        }
        java.lang.String str15 = coroutineCreation;
        if (bundle.containsKey(str15)) {
            builder.setReleaseDay(java.lang.Integer.valueOf(bundle.getInt(str15)));
        }
        java.lang.String str16 = getOutputMinFrameDurationlomOqCM;
        if (bundle.containsKey(str16)) {
            builder.setDiscNumber(java.lang.Integer.valueOf(bundle.getInt(str16)));
        }
        java.lang.String str17 = AMEXKernel;
        if (bundle.containsKey(str17)) {
            builder.setTotalDiscCount(java.lang.Integer.valueOf(bundle.getInt(str17)));
        }
        java.lang.String str18 = isOutputSupportedForhNQ4ISI;
        if (bundle.containsKey(str18)) {
            builder.setMediaType(java.lang.Integer.valueOf(bundle.getInt(str18)));
        }
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(getARTIFICIAL_FRAME_PACKAGE_NAME);
        if (stringArrayList != null) {
            builder.setSupportedCommands(stringArrayList);
        }
        return builder.build();
    }
}
