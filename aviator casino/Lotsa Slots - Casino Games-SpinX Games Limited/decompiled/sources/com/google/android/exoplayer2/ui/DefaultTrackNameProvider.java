package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
public class DefaultTrackNameProvider implements com.google.android.exoplayer2.ui.TrackNameProvider {
    private final android.content.res.Resources resources;

    public DefaultTrackNameProvider(android.content.res.Resources resources) {
        this.resources = (android.content.res.Resources) com.google.android.exoplayer2.util.Assertions.checkNotNull(resources);
    }

    @Override // com.google.android.exoplayer2.ui.TrackNameProvider
    public java.lang.String getTrackName(com.google.android.exoplayer2.Format format) {
        java.lang.String buildLanguageOrLabelString;
        int inferPrimaryTrackType = inferPrimaryTrackType(format);
        if (inferPrimaryTrackType == 2) {
            buildLanguageOrLabelString = joinWithSeparator(buildRoleString(format), buildResolutionString(format), buildBitrateString(format));
        } else if (inferPrimaryTrackType == 1) {
            buildLanguageOrLabelString = joinWithSeparator(buildLanguageOrLabelString(format), buildAudioChannelString(format), buildBitrateString(format));
        } else {
            buildLanguageOrLabelString = buildLanguageOrLabelString(format);
        }
        return buildLanguageOrLabelString.length() == 0 ? this.resources.getString(com.google.android.exoplayer2.ui.R.string.exo_track_unknown) : buildLanguageOrLabelString;
    }

    private java.lang.String buildResolutionString(com.google.android.exoplayer2.Format format) {
        int i = format.width;
        int i2 = format.height;
        return (i == -1 || i2 == -1) ? "" : this.resources.getString(com.google.android.exoplayer2.ui.R.string.exo_track_resolution, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
    }

    private java.lang.String buildBitrateString(com.google.android.exoplayer2.Format format) {
        int i = format.bitrate;
        return i == -1 ? "" : this.resources.getString(com.google.android.exoplayer2.ui.R.string.exo_track_bitrate, java.lang.Float.valueOf(i / 1000000.0f));
    }

    private java.lang.String buildAudioChannelString(com.google.android.exoplayer2.Format format) {
        int i = format.channelCount;
        if (i == -1 || i < 1) {
            return "";
        }
        if (i == 1) {
            return this.resources.getString(com.google.android.exoplayer2.ui.R.string.exo_track_mono);
        }
        if (i == 2) {
            return this.resources.getString(com.google.android.exoplayer2.ui.R.string.exo_track_stereo);
        }
        if (i == 6 || i == 7) {
            return this.resources.getString(com.google.android.exoplayer2.ui.R.string.exo_track_surround_5_point_1);
        }
        if (i == 8) {
            return this.resources.getString(com.google.android.exoplayer2.ui.R.string.exo_track_surround_7_point_1);
        }
        return this.resources.getString(com.google.android.exoplayer2.ui.R.string.exo_track_surround);
    }

    private java.lang.String buildLanguageOrLabelString(com.google.android.exoplayer2.Format format) {
        java.lang.String joinWithSeparator = joinWithSeparator(buildLanguageString(format), buildRoleString(format));
        return android.text.TextUtils.isEmpty(joinWithSeparator) ? buildLabelString(format) : joinWithSeparator;
    }

    private java.lang.String buildLabelString(com.google.android.exoplayer2.Format format) {
        return android.text.TextUtils.isEmpty(format.label) ? "" : format.label;
    }

    private java.lang.String buildLanguageString(com.google.android.exoplayer2.Format format) {
        java.lang.String str = format.language;
        if (android.text.TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        java.util.Locale forLanguageTag = com.google.android.exoplayer2.util.Util.SDK_INT >= 21 ? java.util.Locale.forLanguageTag(str) : new java.util.Locale(str);
        java.util.Locale defaultDisplayLocale = com.google.android.exoplayer2.util.Util.getDefaultDisplayLocale();
        java.lang.String displayName = forLanguageTag.getDisplayName(defaultDisplayLocale);
        if (android.text.TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, offsetByCodePoints).toUpperCase(defaultDisplayLocale) + displayName.substring(offsetByCodePoints);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private java.lang.String buildRoleString(com.google.android.exoplayer2.Format format) {
        java.lang.String str;
        if ((format.roleFlags & 2) == 0) {
            str = "";
        } else {
            str = this.resources.getString(com.google.android.exoplayer2.ui.R.string.exo_track_role_alternate);
        }
        if ((format.roleFlags & 4) != 0) {
            str = joinWithSeparator(str, this.resources.getString(com.google.android.exoplayer2.ui.R.string.exo_track_role_supplementary));
        }
        if ((format.roleFlags & 8) != 0) {
            str = joinWithSeparator(str, this.resources.getString(com.google.android.exoplayer2.ui.R.string.exo_track_role_commentary));
        }
        return (format.roleFlags & 1088) != 0 ? joinWithSeparator(str, this.resources.getString(com.google.android.exoplayer2.ui.R.string.exo_track_role_closed_captions)) : str;
    }

    private java.lang.String joinWithSeparator(java.lang.String... strArr) {
        java.lang.String str = "";
        for (java.lang.String str2 : strArr) {
            if (str2.length() > 0) {
                str = android.text.TextUtils.isEmpty(str) ? str2 : this.resources.getString(com.google.android.exoplayer2.ui.R.string.exo_item_list, str, str2);
            }
        }
        return str;
    }

    private static int inferPrimaryTrackType(com.google.android.exoplayer2.Format format) {
        int trackType = com.google.android.exoplayer2.util.MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != -1) {
            return trackType;
        }
        if (com.google.android.exoplayer2.util.MimeTypes.getVideoMediaMimeType(format.codecs) != null) {
            return 2;
        }
        if (com.google.android.exoplayer2.util.MimeTypes.getAudioMediaMimeType(format.codecs) != null) {
            return 1;
        }
        if (format.width == -1 && format.height == -1) {
            return (format.channelCount == -1 && format.sampleRate == -1) ? -1 : 1;
        }
        return 2;
    }
}
