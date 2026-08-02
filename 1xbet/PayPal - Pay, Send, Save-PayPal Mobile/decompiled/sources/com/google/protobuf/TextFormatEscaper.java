package com.google.protobuf;

/* loaded from: classes9.dex */
final class TextFormatEscaper {

    interface ByteSequence {
        byte byteAt(int i);

        int size();
    }

    private TextFormatEscaper() {
    }

    static java.lang.String escapeBytes(com.google.protobuf.TextFormatEscaper.ByteSequence byteSequence) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(byteSequence.size());
        for (int i = 0; i < byteSequence.size(); i++) {
            byte byteAt = byteSequence.byteAt(i);
            if (byteAt == 34) {
                sb.append("\\\"");
            } else if (byteAt == 39) {
                sb.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
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
                        if (byteAt >= 32 && byteAt <= 126) {
                            sb.append((char) byteAt);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb.append((char) ((byteAt & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static java.lang.String escapeBytes(final com.google.protobuf.ByteString byteString) {
        return escapeBytes(new com.google.protobuf.TextFormatEscaper.ByteSequence() { // from class: com.google.protobuf.TextFormatEscaper.1
            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return com.google.protobuf.ByteString.this.size();
            }

            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int i) {
                return com.google.protobuf.ByteString.this.byteAt(i);
            }
        });
    }

    static java.lang.String escapeBytes(final byte[] bArr) {
        return escapeBytes(new com.google.protobuf.TextFormatEscaper.ByteSequence() { // from class: com.google.protobuf.TextFormatEscaper.2
            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return bArr.length;
            }

            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int i) {
                return bArr[i];
            }
        });
    }

    static java.lang.String escapeText(java.lang.String str) {
        return escapeBytes(com.google.protobuf.ByteString.copyFromUtf8(str));
    }

    static java.lang.String escapeDoubleQuotesAndBackslashes(java.lang.String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}
