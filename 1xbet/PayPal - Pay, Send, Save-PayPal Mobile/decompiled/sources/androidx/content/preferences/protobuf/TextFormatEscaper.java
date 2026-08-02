package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
final class TextFormatEscaper {

    interface ByteSequence {
        byte getHighResolutionOutputSizeshNQ4ISI(int i);

        int getHighSpeedVideoSizes();
    }

    private TextFormatEscaper() {
    }

    static java.lang.String Camera2StreamConfigurationMap(final androidx.content.preferences.protobuf.ByteString byteString) {
        androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence byteSequence = new androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence() { // from class: androidx.datastore.preferences.protobuf.TextFormatEscaper.1
            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public final int getHighSpeedVideoSizes() {
                return androidx.content.preferences.protobuf.ByteString.this.size();
            }

            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public final byte getHighResolutionOutputSizeshNQ4ISI(int i) {
                return androidx.content.preferences.protobuf.ByteString.this.byteAt(i);
            }
        };
        java.lang.StringBuilder sb = new java.lang.StringBuilder(byteSequence.getHighSpeedVideoSizes());
        for (int i = 0; i < byteSequence.getHighSpeedVideoSizes(); i++) {
            byte highResolutionOutputSizeshNQ4ISI = byteSequence.getHighResolutionOutputSizeshNQ4ISI(i);
            if (highResolutionOutputSizeshNQ4ISI == 34) {
                sb.append("\\\"");
            } else if (highResolutionOutputSizeshNQ4ISI == 39) {
                sb.append("\\'");
            } else if (highResolutionOutputSizeshNQ4ISI != 92) {
                switch (highResolutionOutputSizeshNQ4ISI) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (highResolutionOutputSizeshNQ4ISI >= 32 && highResolutionOutputSizeshNQ4ISI <= 126) {
                            sb.append((char) highResolutionOutputSizeshNQ4ISI);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((highResolutionOutputSizeshNQ4ISI >>> 6) & 3) + 48));
                            sb.append((char) (((highResolutionOutputSizeshNQ4ISI >>> 3) & 7) + 48));
                            sb.append((char) ((highResolutionOutputSizeshNQ4ISI & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.TextFormatEscaper$2, reason: invalid class name */
    class AnonymousClass2 implements androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence {
        final /* synthetic */ byte[] getHighSpeedVideoFpsRangesFor;

        @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
        public final int getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoFpsRangesFor.length;
        }

        @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
        public final byte getHighResolutionOutputSizeshNQ4ISI(int i) {
            return this.getHighSpeedVideoFpsRangesFor[i];
        }
    }

    static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        return Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.ByteString.copyFromUtf8(str));
    }
}
