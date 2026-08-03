package com.google.protobuf;

/* loaded from: classes4.dex */
final class TextFormatEscaper {

    private interface ByteSequence {
        byte byteAt(int offset);

        int size();
    }

    private TextFormatEscaper() {
    }

    static java.lang.String escapeBytes(com.google.protobuf.TextFormatEscaper.ByteSequence input) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(input.size());
        for (int i = 0; i < input.size(); i++) {
            byte byteAt = input.byteAt(i);
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

    static java.lang.String escapeBytes(final com.google.protobuf.ByteString input) {
        return escapeBytes(new com.google.protobuf.TextFormatEscaper.ByteSequence() { // from class: com.google.protobuf.TextFormatEscaper.1
            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return com.google.protobuf.ByteString.this.size();
            }

            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int offset) {
                return com.google.protobuf.ByteString.this.byteAt(offset);
            }
        });
    }

    static java.lang.String escapeBytes(final byte[] input) {
        return escapeBytes(new com.google.protobuf.TextFormatEscaper.ByteSequence() { // from class: com.google.protobuf.TextFormatEscaper.2
            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return input.length;
            }

            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int offset) {
                return input[offset];
            }
        });
    }

    static java.lang.String escapeText(java.lang.String input) {
        return escapeBytes(com.google.protobuf.ByteString.copyFromUtf8(input));
    }

    static java.lang.String escapeDoubleQuotesAndBackslashes(java.lang.String input) {
        return input.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}
