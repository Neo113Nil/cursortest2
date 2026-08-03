package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class MediaMetadata implements com.google.android.exoplayer2.Bundleable {
    private static final int FIELD_ALBUM_ARTIST = 3;
    private static final int FIELD_ALBUM_TITLE = 2;
    private static final int FIELD_ARTIST = 1;
    private static final int FIELD_ARTWORK_DATA = 10;
    private static final int FIELD_ARTWORK_DATA_TYPE = 29;
    private static final int FIELD_ARTWORK_URI = 11;
    private static final int FIELD_COMPILATION = 28;
    private static final int FIELD_COMPOSER = 23;
    private static final int FIELD_CONDUCTOR = 24;
    private static final int FIELD_DESCRIPTION = 6;
    private static final int FIELD_DISC_NUMBER = 25;
    private static final int FIELD_DISPLAY_TITLE = 4;
    private static final int FIELD_EXTRAS = 1000;
    private static final int FIELD_FOLDER_TYPE = 14;
    private static final int FIELD_GENRE = 27;
    private static final int FIELD_IS_PLAYABLE = 15;
    private static final int FIELD_MEDIA_URI = 7;
    private static final int FIELD_OVERALL_RATING = 9;
    private static final int FIELD_RECORDING_DAY = 18;
    private static final int FIELD_RECORDING_MONTH = 17;
    private static final int FIELD_RECORDING_YEAR = 16;
    private static final int FIELD_RELEASE_DAY = 21;
    private static final int FIELD_RELEASE_MONTH = 20;
    private static final int FIELD_RELEASE_YEAR = 19;
    private static final int FIELD_STATION = 30;
    private static final int FIELD_SUBTITLE = 5;
    private static final int FIELD_TITLE = 0;
    private static final int FIELD_TOTAL_DISC_COUNT = 26;
    private static final int FIELD_TOTAL_TRACK_COUNT = 13;
    private static final int FIELD_TRACK_NUMBER = 12;
    private static final int FIELD_USER_RATING = 8;
    private static final int FIELD_WRITER = 22;
    public static final int FOLDER_TYPE_ALBUMS = 2;
    public static final int FOLDER_TYPE_ARTISTS = 3;
    public static final int FOLDER_TYPE_GENRES = 4;
    public static final int FOLDER_TYPE_MIXED = 0;
    public static final int FOLDER_TYPE_NONE = -1;
    public static final int FOLDER_TYPE_PLAYLISTS = 5;
    public static final int FOLDER_TYPE_TITLES = 1;
    public static final int FOLDER_TYPE_YEARS = 6;
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
    public final android.os.Bundle extras;
    public final java.lang.Integer folderType;
    public final java.lang.CharSequence genre;
    public final java.lang.Boolean isPlayable;
    public final com.google.android.exoplayer2.Rating overallRating;
    public final java.lang.Integer recordingDay;
    public final java.lang.Integer recordingMonth;
    public final java.lang.Integer recordingYear;
    public final java.lang.Integer releaseDay;
    public final java.lang.Integer releaseMonth;
    public final java.lang.Integer releaseYear;
    public final java.lang.CharSequence station;
    public final java.lang.CharSequence subtitle;
    public final java.lang.CharSequence title;
    public final java.lang.Integer totalDiscCount;
    public final java.lang.Integer totalTrackCount;
    public final java.lang.Integer trackNumber;
    public final com.google.android.exoplayer2.Rating userRating;
    public final java.lang.CharSequence writer;

    @java.lang.Deprecated
    public final java.lang.Integer year;
    public static final com.google.android.exoplayer2.MediaMetadata EMPTY = new com.google.android.exoplayer2.MediaMetadata.Builder().build();
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.MediaMetadata> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.MediaMetadata$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            com.google.android.exoplayer2.MediaMetadata fromBundle;
            fromBundle = com.google.android.exoplayer2.MediaMetadata.fromBundle(bundle);
            return fromBundle;
        }
    };

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FolderType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PictureType {
    }

    public static final class Builder {
        private java.lang.CharSequence albumArtist;
        private java.lang.CharSequence albumTitle;
        private java.lang.CharSequence artist;
        private byte[] artworkData;
        private java.lang.Integer artworkDataType;
        private android.net.Uri artworkUri;
        private java.lang.CharSequence compilation;
        private java.lang.CharSequence composer;
        private java.lang.CharSequence conductor;
        private java.lang.CharSequence description;
        private java.lang.Integer discNumber;
        private java.lang.CharSequence displayTitle;
        private android.os.Bundle extras;
        private java.lang.Integer folderType;
        private java.lang.CharSequence genre;
        private java.lang.Boolean isPlayable;
        private com.google.android.exoplayer2.Rating overallRating;
        private java.lang.Integer recordingDay;
        private java.lang.Integer recordingMonth;
        private java.lang.Integer recordingYear;
        private java.lang.Integer releaseDay;
        private java.lang.Integer releaseMonth;
        private java.lang.Integer releaseYear;
        private java.lang.CharSequence station;
        private java.lang.CharSequence subtitle;
        private java.lang.CharSequence title;
        private java.lang.Integer totalDiscCount;
        private java.lang.Integer totalTrackCount;
        private java.lang.Integer trackNumber;
        private com.google.android.exoplayer2.Rating userRating;
        private java.lang.CharSequence writer;

        public Builder() {
        }

        private Builder(com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
            this.title = mediaMetadata.title;
            this.artist = mediaMetadata.artist;
            this.albumTitle = mediaMetadata.albumTitle;
            this.albumArtist = mediaMetadata.albumArtist;
            this.displayTitle = mediaMetadata.displayTitle;
            this.subtitle = mediaMetadata.subtitle;
            this.description = mediaMetadata.description;
            this.userRating = mediaMetadata.userRating;
            this.overallRating = mediaMetadata.overallRating;
            this.artworkData = mediaMetadata.artworkData;
            this.artworkDataType = mediaMetadata.artworkDataType;
            this.artworkUri = mediaMetadata.artworkUri;
            this.trackNumber = mediaMetadata.trackNumber;
            this.totalTrackCount = mediaMetadata.totalTrackCount;
            this.folderType = mediaMetadata.folderType;
            this.isPlayable = mediaMetadata.isPlayable;
            this.recordingYear = mediaMetadata.recordingYear;
            this.recordingMonth = mediaMetadata.recordingMonth;
            this.recordingDay = mediaMetadata.recordingDay;
            this.releaseYear = mediaMetadata.releaseYear;
            this.releaseMonth = mediaMetadata.releaseMonth;
            this.releaseDay = mediaMetadata.releaseDay;
            this.writer = mediaMetadata.writer;
            this.composer = mediaMetadata.composer;
            this.conductor = mediaMetadata.conductor;
            this.discNumber = mediaMetadata.discNumber;
            this.totalDiscCount = mediaMetadata.totalDiscCount;
            this.genre = mediaMetadata.genre;
            this.compilation = mediaMetadata.compilation;
            this.station = mediaMetadata.station;
            this.extras = mediaMetadata.extras;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setTitle(java.lang.CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setArtist(java.lang.CharSequence charSequence) {
            this.artist = charSequence;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setAlbumTitle(java.lang.CharSequence charSequence) {
            this.albumTitle = charSequence;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setAlbumArtist(java.lang.CharSequence charSequence) {
            this.albumArtist = charSequence;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setDisplayTitle(java.lang.CharSequence charSequence) {
            this.displayTitle = charSequence;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setSubtitle(java.lang.CharSequence charSequence) {
            this.subtitle = charSequence;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setDescription(java.lang.CharSequence charSequence) {
            this.description = charSequence;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setUserRating(com.google.android.exoplayer2.Rating rating) {
            this.userRating = rating;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setOverallRating(com.google.android.exoplayer2.Rating rating) {
            this.overallRating = rating;
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaMetadata.Builder setArtworkData(byte[] bArr) {
            return setArtworkData(bArr, null);
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setArtworkData(byte[] bArr, java.lang.Integer num) {
            this.artworkData = bArr == null ? null : (byte[]) bArr.clone();
            this.artworkDataType = num;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder maybeSetArtworkData(byte[] bArr, int i) {
            if (this.artworkData == null || com.google.android.exoplayer2.util.Util.areEqual(java.lang.Integer.valueOf(i), 3) || !com.google.android.exoplayer2.util.Util.areEqual(this.artworkDataType, 3)) {
                this.artworkData = (byte[]) bArr.clone();
                this.artworkDataType = java.lang.Integer.valueOf(i);
            }
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setArtworkUri(android.net.Uri uri) {
            this.artworkUri = uri;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setTrackNumber(java.lang.Integer num) {
            this.trackNumber = num;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setTotalTrackCount(java.lang.Integer num) {
            this.totalTrackCount = num;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setFolderType(java.lang.Integer num) {
            this.folderType = num;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setIsPlayable(java.lang.Boolean bool) {
            this.isPlayable = bool;
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaMetadata.Builder setYear(java.lang.Integer num) {
            return setRecordingYear(num);
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setRecordingYear(java.lang.Integer num) {
            this.recordingYear = num;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setRecordingMonth(java.lang.Integer num) {
            this.recordingMonth = num;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setRecordingDay(java.lang.Integer num) {
            this.recordingDay = num;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setReleaseYear(java.lang.Integer num) {
            this.releaseYear = num;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setReleaseMonth(java.lang.Integer num) {
            this.releaseMonth = num;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setReleaseDay(java.lang.Integer num) {
            this.releaseDay = num;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setWriter(java.lang.CharSequence charSequence) {
            this.writer = charSequence;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setComposer(java.lang.CharSequence charSequence) {
            this.composer = charSequence;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setConductor(java.lang.CharSequence charSequence) {
            this.conductor = charSequence;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setDiscNumber(java.lang.Integer num) {
            this.discNumber = num;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setTotalDiscCount(java.lang.Integer num) {
            this.totalDiscCount = num;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setGenre(java.lang.CharSequence charSequence) {
            this.genre = charSequence;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setCompilation(java.lang.CharSequence charSequence) {
            this.compilation = charSequence;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setStation(java.lang.CharSequence charSequence) {
            this.station = charSequence;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder setExtras(android.os.Bundle bundle) {
            this.extras = bundle;
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder populateFromMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
            for (int i = 0; i < metadata.length(); i++) {
                metadata.get(i).populateMediaMetadata(this);
            }
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder populateFromMetadata(java.util.List<com.google.android.exoplayer2.metadata.Metadata> list) {
            for (int i = 0; i < list.size(); i++) {
                com.google.android.exoplayer2.metadata.Metadata metadata = list.get(i);
                for (int i2 = 0; i2 < metadata.length(); i2++) {
                    metadata.get(i2).populateMediaMetadata(this);
                }
            }
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata.Builder populate(com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
            if (mediaMetadata == null) {
                return this;
            }
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
            if (mediaMetadata.userRating != null) {
                setUserRating(mediaMetadata.userRating);
            }
            if (mediaMetadata.overallRating != null) {
                setOverallRating(mediaMetadata.overallRating);
            }
            if (mediaMetadata.artworkData != null) {
                setArtworkData(mediaMetadata.artworkData, mediaMetadata.artworkDataType);
            }
            if (mediaMetadata.artworkUri != null) {
                setArtworkUri(mediaMetadata.artworkUri);
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
            if (mediaMetadata.extras != null) {
                setExtras(mediaMetadata.extras);
            }
            return this;
        }

        public com.google.android.exoplayer2.MediaMetadata build() {
            return new com.google.android.exoplayer2.MediaMetadata(this);
        }
    }

    private MediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder builder) {
        this.title = builder.title;
        this.artist = builder.artist;
        this.albumTitle = builder.albumTitle;
        this.albumArtist = builder.albumArtist;
        this.displayTitle = builder.displayTitle;
        this.subtitle = builder.subtitle;
        this.description = builder.description;
        this.userRating = builder.userRating;
        this.overallRating = builder.overallRating;
        this.artworkData = builder.artworkData;
        this.artworkDataType = builder.artworkDataType;
        this.artworkUri = builder.artworkUri;
        this.trackNumber = builder.trackNumber;
        this.totalTrackCount = builder.totalTrackCount;
        this.folderType = builder.folderType;
        this.isPlayable = builder.isPlayable;
        this.year = builder.recordingYear;
        this.recordingYear = builder.recordingYear;
        this.recordingMonth = builder.recordingMonth;
        this.recordingDay = builder.recordingDay;
        this.releaseYear = builder.releaseYear;
        this.releaseMonth = builder.releaseMonth;
        this.releaseDay = builder.releaseDay;
        this.writer = builder.writer;
        this.composer = builder.composer;
        this.conductor = builder.conductor;
        this.discNumber = builder.discNumber;
        this.totalDiscCount = builder.totalDiscCount;
        this.genre = builder.genre;
        this.compilation = builder.compilation;
        this.station = builder.station;
        this.extras = builder.extras;
    }

    public com.google.android.exoplayer2.MediaMetadata.Builder buildUpon() {
        return new com.google.android.exoplayer2.MediaMetadata.Builder();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.MediaMetadata mediaMetadata = (com.google.android.exoplayer2.MediaMetadata) obj;
        return com.google.android.exoplayer2.util.Util.areEqual(this.title, mediaMetadata.title) && com.google.android.exoplayer2.util.Util.areEqual(this.artist, mediaMetadata.artist) && com.google.android.exoplayer2.util.Util.areEqual(this.albumTitle, mediaMetadata.albumTitle) && com.google.android.exoplayer2.util.Util.areEqual(this.albumArtist, mediaMetadata.albumArtist) && com.google.android.exoplayer2.util.Util.areEqual(this.displayTitle, mediaMetadata.displayTitle) && com.google.android.exoplayer2.util.Util.areEqual(this.subtitle, mediaMetadata.subtitle) && com.google.android.exoplayer2.util.Util.areEqual(this.description, mediaMetadata.description) && com.google.android.exoplayer2.util.Util.areEqual(this.userRating, mediaMetadata.userRating) && com.google.android.exoplayer2.util.Util.areEqual(this.overallRating, mediaMetadata.overallRating) && java.util.Arrays.equals(this.artworkData, mediaMetadata.artworkData) && com.google.android.exoplayer2.util.Util.areEqual(this.artworkDataType, mediaMetadata.artworkDataType) && com.google.android.exoplayer2.util.Util.areEqual(this.artworkUri, mediaMetadata.artworkUri) && com.google.android.exoplayer2.util.Util.areEqual(this.trackNumber, mediaMetadata.trackNumber) && com.google.android.exoplayer2.util.Util.areEqual(this.totalTrackCount, mediaMetadata.totalTrackCount) && com.google.android.exoplayer2.util.Util.areEqual(this.folderType, mediaMetadata.folderType) && com.google.android.exoplayer2.util.Util.areEqual(this.isPlayable, mediaMetadata.isPlayable) && com.google.android.exoplayer2.util.Util.areEqual(this.recordingYear, mediaMetadata.recordingYear) && com.google.android.exoplayer2.util.Util.areEqual(this.recordingMonth, mediaMetadata.recordingMonth) && com.google.android.exoplayer2.util.Util.areEqual(this.recordingDay, mediaMetadata.recordingDay) && com.google.android.exoplayer2.util.Util.areEqual(this.releaseYear, mediaMetadata.releaseYear) && com.google.android.exoplayer2.util.Util.areEqual(this.releaseMonth, mediaMetadata.releaseMonth) && com.google.android.exoplayer2.util.Util.areEqual(this.releaseDay, mediaMetadata.releaseDay) && com.google.android.exoplayer2.util.Util.areEqual(this.writer, mediaMetadata.writer) && com.google.android.exoplayer2.util.Util.areEqual(this.composer, mediaMetadata.composer) && com.google.android.exoplayer2.util.Util.areEqual(this.conductor, mediaMetadata.conductor) && com.google.android.exoplayer2.util.Util.areEqual(this.discNumber, mediaMetadata.discNumber) && com.google.android.exoplayer2.util.Util.areEqual(this.totalDiscCount, mediaMetadata.totalDiscCount) && com.google.android.exoplayer2.util.Util.areEqual(this.genre, mediaMetadata.genre) && com.google.android.exoplayer2.util.Util.areEqual(this.compilation, mediaMetadata.compilation) && com.google.android.exoplayer2.util.Util.areEqual(this.station, mediaMetadata.station);
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(this.title, this.artist, this.albumTitle, this.albumArtist, this.displayTitle, this.subtitle, this.description, this.userRating, this.overallRating, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.artworkData)), this.artworkDataType, this.artworkUri, this.trackNumber, this.totalTrackCount, this.folderType, this.isPlayable, this.recordingYear, this.recordingMonth, this.recordingDay, this.releaseYear, this.releaseMonth, this.releaseDay, this.writer, this.composer, this.conductor, this.discNumber, this.totalDiscCount, this.genre, this.compilation, this.station);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putCharSequence(keyForField(0), this.title);
        bundle.putCharSequence(keyForField(1), this.artist);
        bundle.putCharSequence(keyForField(2), this.albumTitle);
        bundle.putCharSequence(keyForField(3), this.albumArtist);
        bundle.putCharSequence(keyForField(4), this.displayTitle);
        bundle.putCharSequence(keyForField(5), this.subtitle);
        bundle.putCharSequence(keyForField(6), this.description);
        bundle.putByteArray(keyForField(10), this.artworkData);
        bundle.putParcelable(keyForField(11), this.artworkUri);
        bundle.putCharSequence(keyForField(22), this.writer);
        bundle.putCharSequence(keyForField(23), this.composer);
        bundle.putCharSequence(keyForField(24), this.conductor);
        bundle.putCharSequence(keyForField(27), this.genre);
        bundle.putCharSequence(keyForField(28), this.compilation);
        bundle.putCharSequence(keyForField(30), this.station);
        if (this.userRating != null) {
            bundle.putBundle(keyForField(8), this.userRating.toBundle());
        }
        if (this.overallRating != null) {
            bundle.putBundle(keyForField(9), this.overallRating.toBundle());
        }
        if (this.trackNumber != null) {
            bundle.putInt(keyForField(12), this.trackNumber.intValue());
        }
        if (this.totalTrackCount != null) {
            bundle.putInt(keyForField(13), this.totalTrackCount.intValue());
        }
        if (this.folderType != null) {
            bundle.putInt(keyForField(14), this.folderType.intValue());
        }
        if (this.isPlayable != null) {
            bundle.putBoolean(keyForField(15), this.isPlayable.booleanValue());
        }
        if (this.recordingYear != null) {
            bundle.putInt(keyForField(16), this.recordingYear.intValue());
        }
        if (this.recordingMonth != null) {
            bundle.putInt(keyForField(17), this.recordingMonth.intValue());
        }
        if (this.recordingDay != null) {
            bundle.putInt(keyForField(18), this.recordingDay.intValue());
        }
        if (this.releaseYear != null) {
            bundle.putInt(keyForField(19), this.releaseYear.intValue());
        }
        if (this.releaseMonth != null) {
            bundle.putInt(keyForField(20), this.releaseMonth.intValue());
        }
        if (this.releaseDay != null) {
            bundle.putInt(keyForField(21), this.releaseDay.intValue());
        }
        if (this.discNumber != null) {
            bundle.putInt(keyForField(25), this.discNumber.intValue());
        }
        if (this.totalDiscCount != null) {
            bundle.putInt(keyForField(26), this.totalDiscCount.intValue());
        }
        if (this.artworkDataType != null) {
            bundle.putInt(keyForField(29), this.artworkDataType.intValue());
        }
        if (this.extras != null) {
            bundle.putBundle(keyForField(1000), this.extras);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.MediaMetadata fromBundle(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        android.os.Bundle bundle3;
        com.google.android.exoplayer2.MediaMetadata.Builder builder = new com.google.android.exoplayer2.MediaMetadata.Builder();
        builder.setTitle(bundle.getCharSequence(keyForField(0))).setArtist(bundle.getCharSequence(keyForField(1))).setAlbumTitle(bundle.getCharSequence(keyForField(2))).setAlbumArtist(bundle.getCharSequence(keyForField(3))).setDisplayTitle(bundle.getCharSequence(keyForField(4))).setSubtitle(bundle.getCharSequence(keyForField(5))).setDescription(bundle.getCharSequence(keyForField(6))).setArtworkData(bundle.getByteArray(keyForField(10)), bundle.containsKey(keyForField(29)) ? java.lang.Integer.valueOf(bundle.getInt(keyForField(29))) : null).setArtworkUri((android.net.Uri) bundle.getParcelable(keyForField(11))).setWriter(bundle.getCharSequence(keyForField(22))).setComposer(bundle.getCharSequence(keyForField(23))).setConductor(bundle.getCharSequence(keyForField(24))).setGenre(bundle.getCharSequence(keyForField(27))).setCompilation(bundle.getCharSequence(keyForField(28))).setStation(bundle.getCharSequence(keyForField(30))).setExtras(bundle.getBundle(keyForField(1000)));
        if (bundle.containsKey(keyForField(8)) && (bundle3 = bundle.getBundle(keyForField(8))) != null) {
            builder.setUserRating(com.google.android.exoplayer2.Rating.CREATOR.fromBundle(bundle3));
        }
        if (bundle.containsKey(keyForField(9)) && (bundle2 = bundle.getBundle(keyForField(9))) != null) {
            builder.setOverallRating(com.google.android.exoplayer2.Rating.CREATOR.fromBundle(bundle2));
        }
        if (bundle.containsKey(keyForField(12))) {
            builder.setTrackNumber(java.lang.Integer.valueOf(bundle.getInt(keyForField(12))));
        }
        if (bundle.containsKey(keyForField(13))) {
            builder.setTotalTrackCount(java.lang.Integer.valueOf(bundle.getInt(keyForField(13))));
        }
        if (bundle.containsKey(keyForField(14))) {
            builder.setFolderType(java.lang.Integer.valueOf(bundle.getInt(keyForField(14))));
        }
        if (bundle.containsKey(keyForField(15))) {
            builder.setIsPlayable(java.lang.Boolean.valueOf(bundle.getBoolean(keyForField(15))));
        }
        if (bundle.containsKey(keyForField(16))) {
            builder.setRecordingYear(java.lang.Integer.valueOf(bundle.getInt(keyForField(16))));
        }
        if (bundle.containsKey(keyForField(17))) {
            builder.setRecordingMonth(java.lang.Integer.valueOf(bundle.getInt(keyForField(17))));
        }
        if (bundle.containsKey(keyForField(18))) {
            builder.setRecordingDay(java.lang.Integer.valueOf(bundle.getInt(keyForField(18))));
        }
        if (bundle.containsKey(keyForField(19))) {
            builder.setReleaseYear(java.lang.Integer.valueOf(bundle.getInt(keyForField(19))));
        }
        if (bundle.containsKey(keyForField(20))) {
            builder.setReleaseMonth(java.lang.Integer.valueOf(bundle.getInt(keyForField(20))));
        }
        if (bundle.containsKey(keyForField(21))) {
            builder.setReleaseDay(java.lang.Integer.valueOf(bundle.getInt(keyForField(21))));
        }
        if (bundle.containsKey(keyForField(25))) {
            builder.setDiscNumber(java.lang.Integer.valueOf(bundle.getInt(keyForField(25))));
        }
        if (bundle.containsKey(keyForField(26))) {
            builder.setTotalDiscCount(java.lang.Integer.valueOf(bundle.getInt(keyForField(26))));
        }
        return builder.build();
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
