package com.google.android.exoplayer2.extractor.mp4;

/* loaded from: classes3.dex */
final class MetadataUtil {
    private static final int PICTURE_TYPE_FRONT_COVER = 3;
    private static final int SHORT_TYPE_ALBUM = 6384738;
    private static final int SHORT_TYPE_ARTIST = 4280916;
    private static final int SHORT_TYPE_COMMENT = 6516084;
    private static final int SHORT_TYPE_COMPOSER_1 = 6516589;
    private static final int SHORT_TYPE_COMPOSER_2 = 7828084;
    private static final int SHORT_TYPE_ENCODER = 7630703;
    private static final int SHORT_TYPE_GENRE = 6776174;
    private static final int SHORT_TYPE_LYRICS = 7108978;
    private static final int SHORT_TYPE_NAME_1 = 7233901;
    private static final int SHORT_TYPE_NAME_2 = 7631467;
    private static final int SHORT_TYPE_YEAR = 6578553;
    static final java.lang.String[] STANDARD_GENRES = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", com.google.common.net.HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    private static final java.lang.String TAG = "MetadataUtil";
    private static final int TYPE_ALBUM_ARTIST = 1631670868;
    private static final int TYPE_COMPILATION = 1668311404;
    private static final int TYPE_COVER_ART = 1668249202;
    private static final int TYPE_DISK_NUMBER = 1684632427;
    private static final int TYPE_GAPLESS_ALBUM = 1885823344;
    private static final int TYPE_GENRE = 1735291493;
    private static final int TYPE_GROUPING = 6779504;
    private static final int TYPE_INTERNAL = 757935405;
    private static final int TYPE_RATING = 1920233063;
    private static final int TYPE_SORT_ALBUM = 1936679276;
    private static final int TYPE_SORT_ALBUM_ARTIST = 1936679265;
    private static final int TYPE_SORT_ARTIST = 1936679282;
    private static final int TYPE_SORT_COMPOSER = 1936679791;
    private static final int TYPE_SORT_TRACK_NAME = 1936682605;
    private static final int TYPE_TEMPO = 1953329263;
    private static final int TYPE_TOP_BYTE_COPYRIGHT = 169;
    private static final int TYPE_TOP_BYTE_REPLACEMENT = 253;
    private static final int TYPE_TRACK_NUMBER = 1953655662;
    private static final int TYPE_TV_SHOW = 1953919848;
    private static final int TYPE_TV_SORT_SHOW = 1936683886;

    private MetadataUtil() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r6 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void setFormatMetadata(int i, com.google.android.exoplayer2.metadata.Metadata metadata, com.google.android.exoplayer2.metadata.Metadata metadata2, com.google.android.exoplayer2.Format.Builder builder, com.google.android.exoplayer2.metadata.Metadata... metadataArr) {
        com.google.android.exoplayer2.metadata.Metadata metadata3 = new com.google.android.exoplayer2.metadata.Metadata(new com.google.android.exoplayer2.metadata.Metadata.Entry[0]);
        if (i != 1) {
            if (i == 2 && metadata2 != null) {
                for (int i2 = 0; i2 < metadata2.length(); i2++) {
                    com.google.android.exoplayer2.metadata.Metadata.Entry entry = metadata2.get(i2);
                    if (entry instanceof com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry) {
                        com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry mdtaMetadataEntry = (com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry) entry;
                        if ("com.android.capture.fps".equals(mdtaMetadataEntry.key)) {
                            metadata = new com.google.android.exoplayer2.metadata.Metadata(mdtaMetadataEntry);
                            break;
                        }
                    }
                }
            }
            metadata = metadata3;
        }
        for (com.google.android.exoplayer2.metadata.Metadata metadata4 : metadataArr) {
            metadata = metadata.copyWithAppendedEntriesFrom(metadata4);
        }
        if (metadata.length() > 0) {
            builder.setMetadata(metadata);
        }
    }

    public static void setFormatGaplessInfo(int i, com.google.android.exoplayer2.extractor.GaplessInfoHolder gaplessInfoHolder, com.google.android.exoplayer2.Format.Builder builder) {
        if (i == 1 && gaplessInfoHolder.hasGaplessInfo()) {
            builder.setEncoderDelay(gaplessInfoHolder.encoderDelay).setEncoderPadding(gaplessInfoHolder.encoderPadding);
        }
    }

    public static com.google.android.exoplayer2.metadata.Metadata.Entry parseIlstElement(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition() + parsableByteArray.readInt();
        int readInt = parsableByteArray.readInt();
        int i = (readInt >> 24) & 255;
        try {
            if (i == TYPE_TOP_BYTE_COPYRIGHT || i == TYPE_TOP_BYTE_REPLACEMENT) {
                int i2 = 16777215 & readInt;
                if (i2 == SHORT_TYPE_COMMENT) {
                    return parseCommentAttribute(readInt, parsableByteArray);
                }
                if (i2 == SHORT_TYPE_NAME_1 || i2 == SHORT_TYPE_NAME_2) {
                    return parseTextAttribute(readInt, "TIT2", parsableByteArray);
                }
                if (i2 == SHORT_TYPE_COMPOSER_1 || i2 == SHORT_TYPE_COMPOSER_2) {
                    return parseTextAttribute(readInt, "TCOM", parsableByteArray);
                }
                if (i2 == SHORT_TYPE_YEAR) {
                    return parseTextAttribute(readInt, "TDRC", parsableByteArray);
                }
                if (i2 == SHORT_TYPE_ARTIST) {
                    return parseTextAttribute(readInt, "TPE1", parsableByteArray);
                }
                if (i2 == SHORT_TYPE_ENCODER) {
                    return parseTextAttribute(readInt, "TSSE", parsableByteArray);
                }
                if (i2 == SHORT_TYPE_ALBUM) {
                    return parseTextAttribute(readInt, "TALB", parsableByteArray);
                }
                if (i2 == SHORT_TYPE_LYRICS) {
                    return parseTextAttribute(readInt, "USLT", parsableByteArray);
                }
                if (i2 == SHORT_TYPE_GENRE) {
                    return parseTextAttribute(readInt, "TCON", parsableByteArray);
                }
                if (i2 == TYPE_GROUPING) {
                    return parseTextAttribute(readInt, "TIT1", parsableByteArray);
                }
            } else {
                if (readInt == TYPE_GENRE) {
                    return parseStandardGenreAttribute(parsableByteArray);
                }
                if (readInt == TYPE_DISK_NUMBER) {
                    return parseIndexAndCountAttribute(readInt, "TPOS", parsableByteArray);
                }
                if (readInt == TYPE_TRACK_NUMBER) {
                    return parseIndexAndCountAttribute(readInt, "TRCK", parsableByteArray);
                }
                if (readInt == TYPE_TEMPO) {
                    return parseUint8Attribute(readInt, "TBPM", parsableByteArray, true, false);
                }
                if (readInt == TYPE_COMPILATION) {
                    return parseUint8Attribute(readInt, "TCMP", parsableByteArray, true, true);
                }
                if (readInt == TYPE_COVER_ART) {
                    return parseCoverArt(parsableByteArray);
                }
                if (readInt == TYPE_ALBUM_ARTIST) {
                    return parseTextAttribute(readInt, "TPE2", parsableByteArray);
                }
                if (readInt == TYPE_SORT_TRACK_NAME) {
                    return parseTextAttribute(readInt, "TSOT", parsableByteArray);
                }
                if (readInt == TYPE_SORT_ALBUM) {
                    return parseTextAttribute(readInt, "TSO2", parsableByteArray);
                }
                if (readInt == TYPE_SORT_ARTIST) {
                    return parseTextAttribute(readInt, "TSOA", parsableByteArray);
                }
                if (readInt == TYPE_SORT_ALBUM_ARTIST) {
                    return parseTextAttribute(readInt, "TSOP", parsableByteArray);
                }
                if (readInt == TYPE_SORT_COMPOSER) {
                    return parseTextAttribute(readInt, "TSOC", parsableByteArray);
                }
                if (readInt == TYPE_RATING) {
                    return parseUint8Attribute(readInt, "ITUNESADVISORY", parsableByteArray, false, false);
                }
                if (readInt == TYPE_GAPLESS_ALBUM) {
                    return parseUint8Attribute(readInt, "ITUNESGAPLESS", parsableByteArray, false, true);
                }
                if (readInt == TYPE_TV_SORT_SHOW) {
                    return parseTextAttribute(readInt, "TVSHOWSORT", parsableByteArray);
                }
                if (readInt == TYPE_TV_SHOW) {
                    return parseTextAttribute(readInt, "TVSHOW", parsableByteArray);
                }
                if (readInt == TYPE_INTERNAL) {
                    return parseInternalAttribute(parsableByteArray, position);
                }
            }
            com.google.android.exoplayer2.util.Log.d(TAG, "Skipped unknown metadata entry: " + com.google.android.exoplayer2.extractor.mp4.Atom.getAtomTypeString(readInt));
            parsableByteArray.setPosition(position);
            return null;
        } finally {
            parsableByteArray.setPosition(position);
        }
    }

    public static com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry parseMdtaMetadataEntryFromIlst(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i, java.lang.String str) {
        while (true) {
            int position = parsableByteArray.getPosition();
            if (position >= i) {
                return null;
            }
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1684108385) {
                int readInt2 = parsableByteArray.readInt();
                int readInt3 = parsableByteArray.readInt();
                int i2 = readInt - 16;
                byte[] bArr = new byte[i2];
                parsableByteArray.readBytes(bArr, 0, i2);
                return new com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry(str, bArr, readInt3, readInt2);
            }
            parsableByteArray.setPosition(position + readInt);
        }
    }

    private static com.google.android.exoplayer2.metadata.id3.TextInformationFrame parseTextAttribute(int i, java.lang.String str, com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            return new com.google.android.exoplayer2.metadata.id3.TextInformationFrame(str, null, parsableByteArray.readNullTerminatedString(readInt - 16));
        }
        com.google.android.exoplayer2.util.Log.w(TAG, "Failed to parse text attribute: " + com.google.android.exoplayer2.extractor.mp4.Atom.getAtomTypeString(i));
        return null;
    }

    private static com.google.android.exoplayer2.metadata.id3.CommentFrame parseCommentAttribute(int i, com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            java.lang.String readNullTerminatedString = parsableByteArray.readNullTerminatedString(readInt - 16);
            return new com.google.android.exoplayer2.metadata.id3.CommentFrame("und", readNullTerminatedString, readNullTerminatedString);
        }
        com.google.android.exoplayer2.util.Log.w(TAG, "Failed to parse comment attribute: " + com.google.android.exoplayer2.extractor.mp4.Atom.getAtomTypeString(i));
        return null;
    }

    private static com.google.android.exoplayer2.metadata.id3.Id3Frame parseUint8Attribute(int i, java.lang.String str, com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, boolean z, boolean z2) {
        int parseUint8AttributeValue = parseUint8AttributeValue(parsableByteArray);
        if (z2) {
            parseUint8AttributeValue = java.lang.Math.min(1, parseUint8AttributeValue);
        }
        if (parseUint8AttributeValue >= 0) {
            if (z) {
                return new com.google.android.exoplayer2.metadata.id3.TextInformationFrame(str, null, java.lang.Integer.toString(parseUint8AttributeValue));
            }
            return new com.google.android.exoplayer2.metadata.id3.CommentFrame("und", str, java.lang.Integer.toString(parseUint8AttributeValue));
        }
        com.google.android.exoplayer2.util.Log.w(TAG, "Failed to parse uint8 attribute: " + com.google.android.exoplayer2.extractor.mp4.Atom.getAtomTypeString(i));
        return null;
    }

    private static com.google.android.exoplayer2.metadata.id3.TextInformationFrame parseIndexAndCountAttribute(int i, java.lang.String str, com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385 && readInt >= 22) {
            parsableByteArray.skipBytes(10);
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            if (readUnsignedShort > 0) {
                java.lang.String str2 = "" + readUnsignedShort;
                int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                if (readUnsignedShort2 > 0) {
                    str2 = str2 + com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING + readUnsignedShort2;
                }
                return new com.google.android.exoplayer2.metadata.id3.TextInformationFrame(str, null, str2);
            }
        }
        com.google.android.exoplayer2.util.Log.w(TAG, "Failed to parse index/count attribute: " + com.google.android.exoplayer2.extractor.mp4.Atom.getAtomTypeString(i));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.google.android.exoplayer2.metadata.id3.TextInformationFrame parseStandardGenreAttribute(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        java.lang.String str;
        int parseUint8AttributeValue = parseUint8AttributeValue(parsableByteArray);
        if (parseUint8AttributeValue > 0) {
            java.lang.String[] strArr = STANDARD_GENRES;
            if (parseUint8AttributeValue <= strArr.length) {
                str = strArr[parseUint8AttributeValue - 1];
                if (str == null) {
                    return new com.google.android.exoplayer2.metadata.id3.TextInformationFrame("TCON", null, str);
                }
                com.google.android.exoplayer2.util.Log.w(TAG, "Failed to parse standard genre code");
                return null;
            }
        }
        str = null;
        if (str == null) {
        }
    }

    private static com.google.android.exoplayer2.metadata.id3.ApicFrame parseCoverArt(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        java.lang.String str;
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() != 1684108385) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Failed to parse cover art attribute");
            return null;
        }
        int parseFullAtomFlags = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomFlags(parsableByteArray.readInt());
        if (parseFullAtomFlags == 13) {
            str = "image/jpeg";
        } else {
            str = parseFullAtomFlags == 14 ? androidx.media3.common.MimeTypes.IMAGE_PNG : null;
        }
        if (str == null) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Unrecognized cover art flags: " + parseFullAtomFlags);
            return null;
        }
        parsableByteArray.skipBytes(4);
        int i = readInt - 16;
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new com.google.android.exoplayer2.metadata.id3.ApicFrame(str, null, 3, bArr);
    }

    private static com.google.android.exoplayer2.metadata.id3.Id3Frame parseInternalAttribute(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i) {
        java.lang.String str = null;
        java.lang.String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            if (readInt2 == 1835360622) {
                str = parsableByteArray.readNullTerminatedString(readInt - 12);
            } else if (readInt2 == 1851878757) {
                str2 = parsableByteArray.readNullTerminatedString(readInt - 12);
            } else {
                if (readInt2 == 1684108385) {
                    i2 = position;
                    i3 = readInt;
                }
                parsableByteArray.skipBytes(readInt - 12);
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        parsableByteArray.setPosition(i2);
        parsableByteArray.skipBytes(16);
        return new com.google.android.exoplayer2.metadata.id3.InternalFrame(str, str2, parsableByteArray.readNullTerminatedString(i3 - 16));
    }

    private static int parseUint8AttributeValue(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            return parsableByteArray.readUnsignedByte();
        }
        com.google.android.exoplayer2.util.Log.w(TAG, "Failed to parse uint8 attribute value");
        return -1;
    }
}
