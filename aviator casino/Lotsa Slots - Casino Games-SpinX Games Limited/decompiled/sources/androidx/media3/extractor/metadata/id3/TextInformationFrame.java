package androidx.media3.extractor.metadata.id3;

/* loaded from: classes2.dex */
public final class TextInformationFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.TextInformationFrame> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.TextInformationFrame>() { // from class: androidx.media3.extractor.metadata.id3.TextInformationFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.TextInformationFrame createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.id3.TextInformationFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.TextInformationFrame[] newArray(int i) {
            return new androidx.media3.extractor.metadata.id3.TextInformationFrame[i];
        }
    };
    public final java.lang.String description;

    @java.lang.Deprecated
    public final java.lang.String value;
    public final com.google.common.collect.ImmutableList<java.lang.String> values;

    public TextInformationFrame(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list) {
        super(str);
        androidx.media3.common.util.Assertions.checkArgument(!list.isEmpty());
        this.description = str2;
        com.google.common.collect.ImmutableList<java.lang.String> copyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        this.values = copyOf;
        this.value = copyOf.get(0);
    }

    @java.lang.Deprecated
    public TextInformationFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(str, str2, com.google.common.collect.ImmutableList.of(str3));
    }

    private TextInformationFrame(android.os.Parcel parcel) {
        this((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(parcel.readString()), parcel.readString(), com.google.common.collect.ImmutableList.copyOf((java.lang.String[]) androidx.media3.common.util.Assertions.checkNotNull(parcel.createStringArray())));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        java.lang.String str = this.id;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = '\f';
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 16;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 17;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 18;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 19;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 20;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 21;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 22;
                    break;
                }
                break;
        }
        try {
            switch (c) {
                case 0:
                case '\n':
                    builder.setAlbumTitle(this.values.get(0));
                    break;
                case 1:
                case 11:
                    builder.setComposer(this.values.get(0));
                    break;
                case 2:
                case '\r':
                    java.lang.String str2 = this.values.get(0);
                    builder.setRecordingMonth(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2.substring(2, 4)))).setRecordingDay(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    builder.setArtist(this.values.get(0));
                    break;
                case 4:
                case 19:
                    builder.setAlbumArtist(this.values.get(0));
                    break;
                case 5:
                case 20:
                    builder.setConductor(this.values.get(0));
                    break;
                case 6:
                case 21:
                    java.lang.String[] split = androidx.media3.common.util.Util.split(this.values.get(0), com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING);
                    builder.setTrackNumber(java.lang.Integer.valueOf(java.lang.Integer.parseInt(split[0]))).setTotalTrackCount(split.length > 1 ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(split[1])) : null);
                    break;
                case 7:
                case 17:
                    builder.setTitle(this.values.get(0));
                    break;
                case '\b':
                case 16:
                    builder.setWriter(this.values.get(0));
                    break;
                case '\t':
                case 22:
                    builder.setRecordingYear(java.lang.Integer.valueOf(java.lang.Integer.parseInt(this.values.get(0))));
                    break;
                case '\f':
                    java.lang.Integer tryParse = com.google.common.primitives.Ints.tryParse(this.values.get(0));
                    if (tryParse == null) {
                        builder.setGenre(this.values.get(0));
                        break;
                    } else {
                        java.lang.String resolveV1Genre = androidx.media3.extractor.metadata.id3.Id3Util.resolveV1Genre(tryParse.intValue());
                        if (resolveV1Genre != null) {
                            builder.setGenre(resolveV1Genre);
                            break;
                        }
                    }
                    break;
                case 14:
                    java.util.List<java.lang.Integer> parseId3v2point4TimestampFrameForDate = parseId3v2point4TimestampFrameForDate(this.values.get(0));
                    int size = parseId3v2point4TimestampFrameForDate.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                builder.setRecordingDay(parseId3v2point4TimestampFrameForDate.get(2));
                            }
                        }
                        builder.setRecordingMonth(parseId3v2point4TimestampFrameForDate.get(1));
                    }
                    builder.setRecordingYear(parseId3v2point4TimestampFrameForDate.get(0));
                    break;
                case 15:
                    java.util.List<java.lang.Integer> parseId3v2point4TimestampFrameForDate2 = parseId3v2point4TimestampFrameForDate(this.values.get(0));
                    int size2 = parseId3v2point4TimestampFrameForDate2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                builder.setReleaseDay(parseId3v2point4TimestampFrameForDate2.get(2));
                            }
                        }
                        builder.setReleaseMonth(parseId3v2point4TimestampFrameForDate2.get(1));
                    }
                    builder.setReleaseYear(parseId3v2point4TimestampFrameForDate2.get(0));
                    break;
            }
        } catch (java.lang.NumberFormatException | java.lang.StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.id3.TextInformationFrame textInformationFrame = (androidx.media3.extractor.metadata.id3.TextInformationFrame) obj;
        return androidx.media3.common.util.Util.areEqual(this.id, textInformationFrame.id) && androidx.media3.common.util.Util.areEqual(this.description, textInformationFrame.description) && this.values.equals(textInformationFrame.values);
    }

    public int hashCode() {
        int hashCode = (com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.id.hashCode()) * 31;
        java.lang.String str = this.description;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.values.hashCode();
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public java.lang.String toString() {
        return this.id + ": description=" + this.description + ": values=" + this.values;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.description);
        parcel.writeStringArray((java.lang.String[]) this.values.toArray(new java.lang.String[0]));
    }

    private static java.util.List<java.lang.Integer> parseId3v2point4TimestampFrameForDate(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (java.lang.NumberFormatException unused) {
            return new java.util.ArrayList();
        }
    }
}
