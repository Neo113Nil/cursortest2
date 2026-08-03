package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.oM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2077oM implements com.facebook.ads.redexgen.core.InterfaceC05478z {
    public static boolean A0v;
    public static int A0w;
    public static java.util.concurrent.ExecutorService A0x;
    public static byte[] A0y;
    public static java.lang.String[] A0z = {"a2KSouRkY2EeYPYlRPuQP1BMARpp6f9O", "Gy", "Dq9VRycV95bIzONst7U9W8VcH5OAT2ac", "T381mgHUGlQbTRbVURm4ZuRF6EOi2D8f", "KkGB0jhfpK5IC", "ogTnlK5ViGnrQ4kTUDUA61bIZynBq2mv", "CJ3ZuNqxaIjwSiQAD7ytgom2H57haWJk", "spWmv2H5WGO5MG6CASCqBbohd0yqIF8X"};
    public static final java.lang.Object A10;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D23918943: Monitor the audio track usage")
    public static final java.util.concurrent.atomic.AtomicInteger A11;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public android.media.AudioTrack A0D;
    public com.facebook.ads.redexgen.core.C2202qQ A0E;
    public com.facebook.ads.redexgen.core.AnonymousClass21 A0F;
    public com.facebook.ads.redexgen.core.C2175px A0G;
    public com.facebook.ads.redexgen.core.C8O A0H;
    public com.facebook.ads.redexgen.core.InterfaceC05448v A0I;
    public com.facebook.ads.redexgen.core.C9E A0J;
    public com.facebook.ads.redexgen.core.C9H A0K;
    public com.facebook.ads.redexgen.core.C9H A0L;
    public com.facebook.ads.redexgen.core.C9J A0M;
    public com.facebook.ads.redexgen.core.C9J A0N;
    public com.facebook.ads.redexgen.core.C9P A0O;
    public java.nio.ByteBuffer A0P;
    public java.nio.ByteBuffer A0Q;
    public java.nio.ByteBuffer A0R;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D45157249: Retry Audio Track Init failure with less Audio track allocation sizes")
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public byte[] A0c;
    public com.facebook.ads.redexgen.core.InterfaceC04063k[] A0d;
    public java.nio.ByteBuffer[] A0e;
    public final int A0f;
    public final com.facebook.ads.redexgen.core.InterfaceC04073l A0g;
    public final com.facebook.ads.redexgen.core.AnonymousClass48 A0h;
    public final com.facebook.ads.redexgen.core.C6W A0i;
    public final com.facebook.ads.redexgen.core.C8R A0j;
    public final com.facebook.ads.redexgen.core.AnonymousClass95 A0k;
    public final com.facebook.ads.redexgen.core.A7 A0l;
    public final com.facebook.ads.redexgen.core.C9F A0m;
    public final com.facebook.ads.redexgen.core.C9M<com.facebook.ads.redexgen.core.C05438t> A0n;
    public final com.facebook.ads.redexgen.core.C9M<com.facebook.ads.redexgen.core.C05468y> A0o;
    public final com.facebook.ads.redexgen.core.C9x A0p;
    public final java.util.ArrayDeque<com.facebook.ads.redexgen.core.C9J> A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final com.facebook.ads.redexgen.core.InterfaceC04063k[] A0t;
    public final com.facebook.ads.redexgen.core.InterfaceC04063k[] A0u;

    public static java.lang.String A0L(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0y, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 56);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0T() {
        A0y = new byte[]{99, 106, 44, 37, 56, 112, 106, 107, 74, 73, 78, 90, 67, 91, 110, 90, 75, 70, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 124, 70, 65, 68, 104, 85, 66, 125, 65, 76, 84, 72, 95, com.google.common.base.Ascii.ETB, 108, 88, 73, 68, 66, 121, 95, 76, 78, 70, Byte.MAX_VALUE, 72, 65, 72, 76, 94, 72, 121, 69, 95, 72, 76, 73, 39, 0, 8, com.google.common.base.Ascii.CR, 4, 5, 65, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SO, 65, com.google.common.base.Ascii.DC2, 4, com.google.common.base.Ascii.NAK, 65, 17, com.google.common.base.Ascii.CR, 0, com.google.common.base.Ascii.CAN, 3, 0, 2, 10, 65, 17, 0, 19, 0, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DC2, 121, 94, 70, 81, 92, 89, 84, com.google.common.base.Ascii.DLE, 96, 115, 125, com.google.common.base.Ascii.DLE, 85, 94, 83, 95, 84, 89, 94, 87, 10, com.google.common.base.Ascii.DLE, 73, 110, 118, 97, 108, 105, 100, 32, 111, 117, 116, 112, 117, 116, 32, 99, 104, 97, 110, 110, 101, 108, 32, 99, 111, 110, 102, 105, 103, 32, 40, 109, 111, 100, 101, kotlin.io.encoding.Base64.padSymbol, 57, com.google.common.base.Ascii.RS, 6, 17, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, 80, com.google.common.base.Ascii.US, 5, 4, 0, 5, 4, 80, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.RS, 19, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ETB, 80, 88, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, 77, 33, com.google.common.base.Ascii.CAN, 9, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.GS, 104, 95, 73, 95, 78, 78, 83, 84, 93, com.google.common.base.Ascii.SUB, 73, 78, 91, 86, 86, 95, 94, com.google.common.base.Ascii.SUB, 91, 79, 94, 83, 85, com.google.common.base.Ascii.SUB, 78, 72, 91, 89, 81, 117, 78, 65, 66, 76, 69, 0, 84, 79, 0, 67, 79, 78, 70, 73, 71, 85, 82, 69, 0, 80, 65, 83, 83, 84, 72, 82, 79, 85, 71, 72, 0, 70, 79, 82, com.google.common.base.Ascii.SUB, 0, 124, 71, 76, 81, 89, 76, 74, 93, 76, 77, 9, 72, 92, 77, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 70, 9, 76, 71, 74, 70, 77, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 71, 78, 19, 9, com.google.common.base.Ascii.US, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, 17, 81, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.US, 9};
    }

    static {
        A0T();
        A0v = false;
        A10 = new java.lang.Object();
        A11 = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    @java.lang.Deprecated
    public C2077oM(com.facebook.ads.redexgen.core.C8R c8r, com.facebook.ads.redexgen.core.InterfaceC04063k[] interfaceC04063kArr) {
        this(new com.facebook.ads.redexgen.core.C9G().A06((com.facebook.ads.redexgen.core.C8R) com.facebook.ads.redexgen.core.AbstractC1859ka.A00(c8r, com.facebook.ads.redexgen.core.C8R.A04)).A07(interfaceC04063kArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.audioProcessorChain"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2077oM(com.facebook.ads.redexgen.core.C9G c9g) {
        com.facebook.ads.redexgen.core.C8R c8r;
        com.facebook.ads.redexgen.core.InterfaceC04073l interfaceC04073l;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        c8r = c9g.A03;
        this.A0j = c8r;
        interfaceC04073l = c9g.A02;
        this.A0g = interfaceC04073l;
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 21) {
            z4 = c9g.A05;
            if (z4) {
                z = true;
                this.A0s = z;
                if (com.facebook.ads.redexgen.core.C5C.A02 >= 23) {
                    z3 = c9g.A04;
                    if (z3) {
                        z2 = true;
                        this.A0r = z2;
                        if (com.facebook.ads.redexgen.core.C5C.A02 >= 29) {
                            i = c9g.A01;
                        } else {
                            i = 0;
                        }
                        this.A0f = i;
                        this.A0m = c9g.A00;
                        this.A0h = new com.facebook.ads.redexgen.core.AnonymousClass48(com.facebook.ads.redexgen.core.AnonymousClass45.A00);
                        this.A0h.A04();
                        this.A0k = new com.facebook.ads.redexgen.core.AnonymousClass95(new com.facebook.ads.redexgen.core.C2080oP(this));
                        this.A0l = new com.facebook.ads.redexgen.core.A7();
                        this.A0p = new com.facebook.ads.redexgen.core.C9x();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.Collections.addAll(arrayList, new com.facebook.ads.redexgen.core.AbstractC2081oQ() { // from class: com.facebook.ads.redexgen.X.9z
                            public static java.lang.String[] A00 = {"xDq4aPrtB4VOa6dWWLPhCvkNe2Vl9lis", "EsfqB3zUW", "UtEiT2kwdPvCqjHQhdRb9TlQndFxkub5", "Wgbe7hD6UIy", "xb", "RmqoPGkQn7vPyUpVU7ZkSehlX2jVBNRl", "20c7QZBscERNsZTH", "LeRFFk0E0DkpEnw35dU8lGRVd8w5nI17"};

                            @Override // com.facebook.ads.redexgen.core.AbstractC2081oQ
                            public final com.facebook.ads.redexgen.core.C04043i A09(com.facebook.ads.redexgen.core.C04043i c04043i) throws com.facebook.ads.redexgen.core.C04053j {
                                int i2 = c04043i.A02;
                                if (i2 != 3 && i2 != 2) {
                                    if (A00[2].charAt(30) != 'b') {
                                        throw new java.lang.RuntimeException();
                                    }
                                    A00[3] = "ty1ASCrQyl5";
                                    if (i2 != 268435456 && i2 != 536870912 && i2 != 805306368 && i2 != 4) {
                                        throw new com.facebook.ads.redexgen.core.C04053j(c04043i);
                                    }
                                }
                                if (i2 != 2) {
                                    return new com.facebook.ads.redexgen.core.C04043i(c04043i.A03, c04043i.A01, 2);
                                }
                                return com.facebook.ads.redexgen.core.C04043i.A05;
                            }

                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
                            @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void AHH(java.nio.ByteBuffer byteBuffer) {
                                int resampledSize = byteBuffer.position();
                                int size = byteBuffer.limit();
                                int limit = size - resampledSize;
                                int position = this.A05.A02;
                                switch (position) {
                                    case 3:
                                        limit *= 2;
                                        break;
                                    case 4:
                                    case 805306368:
                                        limit /= 2;
                                        break;
                                    case 268435456:
                                        break;
                                    case 536870912:
                                        int position2 = limit / 3;
                                        limit = position2 * 2;
                                        break;
                                    default:
                                        throw new java.lang.IllegalStateException();
                                }
                                java.nio.ByteBuffer buffer = A00(limit);
                                int position3 = this.A05.A02;
                                switch (position3) {
                                    case 3:
                                        while (resampledSize < size) {
                                            buffer.put((byte) 0);
                                            int position4 = byteBuffer.get(resampledSize);
                                            buffer.put((byte) ((position4 & 255) - 128));
                                            resampledSize++;
                                        }
                                        int resampledSize2 = byteBuffer.limit();
                                        if (A00[7].charAt(16) != 53) {
                                            throw new java.lang.RuntimeException();
                                        }
                                        A00[5] = "iqTXYqAhTQO7Wpg5y1SXfPoSIsa3UBxa";
                                        byteBuffer.position(resampledSize2);
                                        buffer.flip();
                                        return;
                                    case 4:
                                        while (resampledSize < size) {
                                            int position5 = (int) (32767.0f * com.facebook.ads.redexgen.core.C5C.A00(byteBuffer.getFloat(resampledSize), -1.0f, 1.0f));
                                            int limit2 = (short) position5;
                                            int position6 = limit2 & 255;
                                            buffer.put((byte) position6);
                                            int position7 = limit2 >> 8;
                                            buffer.put((byte) (position7 & 255));
                                            resampledSize += 4;
                                        }
                                        int resampledSize22 = byteBuffer.limit();
                                        if (A00[7].charAt(16) != 53) {
                                        }
                                        break;
                                    case 268435456:
                                        while (resampledSize < size) {
                                            int position8 = resampledSize + 1;
                                            buffer.put(byteBuffer.get(position8));
                                            buffer.put(byteBuffer.get(resampledSize));
                                            resampledSize += 2;
                                        }
                                        int resampledSize222 = byteBuffer.limit();
                                        if (A00[7].charAt(16) != 53) {
                                        }
                                        break;
                                    case 536870912:
                                        while (resampledSize < size) {
                                            int position9 = resampledSize + 1;
                                            buffer.put(byteBuffer.get(position9));
                                            int position10 = resampledSize + 2;
                                            buffer.put(byteBuffer.get(position10));
                                            resampledSize += 3;
                                        }
                                        int resampledSize2222 = byteBuffer.limit();
                                        if (A00[7].charAt(16) != 53) {
                                        }
                                        break;
                                    case 805306368:
                                        while (resampledSize < size) {
                                            int position11 = resampledSize + 2;
                                            buffer.put(byteBuffer.get(position11));
                                            int position12 = resampledSize + 3;
                                            buffer.put(byteBuffer.get(position12));
                                            resampledSize += 4;
                                        }
                                        int resampledSize22222 = byteBuffer.limit();
                                        if (A00[7].charAt(16) != 53) {
                                        }
                                        break;
                                    default:
                                        throw new java.lang.IllegalStateException();
                                }
                            }
                        }, this.A0l, this.A0p);
                        java.util.Collections.addAll(arrayList, this.A0g.A6z());
                        this.A0u = (com.facebook.ads.redexgen.core.InterfaceC04063k[]) arrayList.toArray(new com.facebook.ads.redexgen.core.InterfaceC04063k[0]);
                        this.A0t = new com.facebook.ads.redexgen.core.InterfaceC04063k[]{new com.facebook.ads.redexgen.core.A0()};
                        this.A00 = 1.0f;
                        this.A0E = com.facebook.ads.redexgen.core.C2202qQ.A07;
                        this.A01 = 0;
                        this.A0F = new com.facebook.ads.redexgen.core.AnonymousClass21(0, 0.0f);
                        this.A0N = new com.facebook.ads.redexgen.core.C9J(com.facebook.ads.redexgen.core.C2175px.A06, false, 0L, 0L);
                        this.A0G = com.facebook.ads.redexgen.core.C2175px.A06;
                        this.A03 = -1;
                        this.A0d = new com.facebook.ads.redexgen.core.InterfaceC04063k[0];
                        this.A0e = new java.nio.ByteBuffer[0];
                        this.A0q = new java.util.ArrayDeque<>();
                        this.A0n = new com.facebook.ads.redexgen.core.C9M<>(100L);
                        this.A0o = new com.facebook.ads.redexgen.core.C9M<>(100L);
                        this.A0i = null;
                    }
                }
                z2 = false;
                this.A0r = z2;
                if (com.facebook.ads.redexgen.core.C5C.A02 >= 29) {
                }
                this.A0f = i;
                this.A0m = c9g.A00;
                this.A0h = new com.facebook.ads.redexgen.core.AnonymousClass48(com.facebook.ads.redexgen.core.AnonymousClass45.A00);
                this.A0h.A04();
                this.A0k = new com.facebook.ads.redexgen.core.AnonymousClass95(new com.facebook.ads.redexgen.core.C2080oP(this));
                this.A0l = new com.facebook.ads.redexgen.core.A7();
                this.A0p = new com.facebook.ads.redexgen.core.C9x();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Collections.addAll(arrayList2, new com.facebook.ads.redexgen.core.AbstractC2081oQ() { // from class: com.facebook.ads.redexgen.X.9z
                    public static java.lang.String[] A00 = {"xDq4aPrtB4VOa6dWWLPhCvkNe2Vl9lis", "EsfqB3zUW", "UtEiT2kwdPvCqjHQhdRb9TlQndFxkub5", "Wgbe7hD6UIy", "xb", "RmqoPGkQn7vPyUpVU7ZkSehlX2jVBNRl", "20c7QZBscERNsZTH", "LeRFFk0E0DkpEnw35dU8lGRVd8w5nI17"};

                    @Override // com.facebook.ads.redexgen.core.AbstractC2081oQ
                    public final com.facebook.ads.redexgen.core.C04043i A09(com.facebook.ads.redexgen.core.C04043i c04043i) throws com.facebook.ads.redexgen.core.C04053j {
                        int i2 = c04043i.A02;
                        if (i2 != 3 && i2 != 2) {
                            if (A00[2].charAt(30) != 'b') {
                                throw new java.lang.RuntimeException();
                            }
                            A00[3] = "ty1ASCrQyl5";
                            if (i2 != 268435456 && i2 != 536870912 && i2 != 805306368 && i2 != 4) {
                                throw new com.facebook.ads.redexgen.core.C04053j(c04043i);
                            }
                        }
                        if (i2 != 2) {
                            return new com.facebook.ads.redexgen.core.C04043i(c04043i.A03, c04043i.A01, 2);
                        }
                        return com.facebook.ads.redexgen.core.C04043i.A05;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
                    @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void AHH(java.nio.ByteBuffer byteBuffer) {
                        int resampledSize = byteBuffer.position();
                        int size = byteBuffer.limit();
                        int limit = size - resampledSize;
                        int position = this.A05.A02;
                        switch (position) {
                            case 3:
                                limit *= 2;
                                break;
                            case 4:
                            case 805306368:
                                limit /= 2;
                                break;
                            case 268435456:
                                break;
                            case 536870912:
                                int position2 = limit / 3;
                                limit = position2 * 2;
                                break;
                            default:
                                throw new java.lang.IllegalStateException();
                        }
                        java.nio.ByteBuffer buffer = A00(limit);
                        int position3 = this.A05.A02;
                        switch (position3) {
                            case 3:
                                while (resampledSize < size) {
                                    buffer.put((byte) 0);
                                    int position4 = byteBuffer.get(resampledSize);
                                    buffer.put((byte) ((position4 & 255) - 128));
                                    resampledSize++;
                                }
                                int resampledSize22222 = byteBuffer.limit();
                                if (A00[7].charAt(16) != 53) {
                                    throw new java.lang.RuntimeException();
                                }
                                A00[5] = "iqTXYqAhTQO7Wpg5y1SXfPoSIsa3UBxa";
                                byteBuffer.position(resampledSize22222);
                                buffer.flip();
                                return;
                            case 4:
                                while (resampledSize < size) {
                                    int position5 = (int) (32767.0f * com.facebook.ads.redexgen.core.C5C.A00(byteBuffer.getFloat(resampledSize), -1.0f, 1.0f));
                                    int limit2 = (short) position5;
                                    int position6 = limit2 & 255;
                                    buffer.put((byte) position6);
                                    int position7 = limit2 >> 8;
                                    buffer.put((byte) (position7 & 255));
                                    resampledSize += 4;
                                }
                                int resampledSize222222 = byteBuffer.limit();
                                if (A00[7].charAt(16) != 53) {
                                }
                                break;
                            case 268435456:
                                while (resampledSize < size) {
                                    int position8 = resampledSize + 1;
                                    buffer.put(byteBuffer.get(position8));
                                    buffer.put(byteBuffer.get(resampledSize));
                                    resampledSize += 2;
                                }
                                int resampledSize2222222 = byteBuffer.limit();
                                if (A00[7].charAt(16) != 53) {
                                }
                                break;
                            case 536870912:
                                while (resampledSize < size) {
                                    int position9 = resampledSize + 1;
                                    buffer.put(byteBuffer.get(position9));
                                    int position10 = resampledSize + 2;
                                    buffer.put(byteBuffer.get(position10));
                                    resampledSize += 3;
                                }
                                int resampledSize22222222 = byteBuffer.limit();
                                if (A00[7].charAt(16) != 53) {
                                }
                                break;
                            case 805306368:
                                while (resampledSize < size) {
                                    int position11 = resampledSize + 2;
                                    buffer.put(byteBuffer.get(position11));
                                    int position12 = resampledSize + 3;
                                    buffer.put(byteBuffer.get(position12));
                                    resampledSize += 4;
                                }
                                int resampledSize222222222 = byteBuffer.limit();
                                if (A00[7].charAt(16) != 53) {
                                }
                                break;
                            default:
                                throw new java.lang.IllegalStateException();
                        }
                    }
                }, this.A0l, this.A0p);
                java.util.Collections.addAll(arrayList2, this.A0g.A6z());
                this.A0u = (com.facebook.ads.redexgen.core.InterfaceC04063k[]) arrayList2.toArray(new com.facebook.ads.redexgen.core.InterfaceC04063k[0]);
                this.A0t = new com.facebook.ads.redexgen.core.InterfaceC04063k[]{new com.facebook.ads.redexgen.core.A0()};
                this.A00 = 1.0f;
                this.A0E = com.facebook.ads.redexgen.core.C2202qQ.A07;
                this.A01 = 0;
                this.A0F = new com.facebook.ads.redexgen.core.AnonymousClass21(0, 0.0f);
                this.A0N = new com.facebook.ads.redexgen.core.C9J(com.facebook.ads.redexgen.core.C2175px.A06, false, 0L, 0L);
                this.A0G = com.facebook.ads.redexgen.core.C2175px.A06;
                this.A03 = -1;
                this.A0d = new com.facebook.ads.redexgen.core.InterfaceC04063k[0];
                this.A0e = new java.nio.ByteBuffer[0];
                this.A0q = new java.util.ArrayDeque<>();
                this.A0n = new com.facebook.ads.redexgen.core.C9M<>(100L);
                this.A0o = new com.facebook.ads.redexgen.core.C9M<>(100L);
                this.A0i = null;
            }
        }
        z = false;
        this.A0s = z;
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 23) {
        }
        z2 = false;
        this.A0r = z2;
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 29) {
        }
        this.A0f = i;
        this.A0m = c9g.A00;
        this.A0h = new com.facebook.ads.redexgen.core.AnonymousClass48(com.facebook.ads.redexgen.core.AnonymousClass45.A00);
        this.A0h.A04();
        this.A0k = new com.facebook.ads.redexgen.core.AnonymousClass95(new com.facebook.ads.redexgen.core.C2080oP(this));
        this.A0l = new com.facebook.ads.redexgen.core.A7();
        this.A0p = new com.facebook.ads.redexgen.core.C9x();
        java.util.ArrayList arrayList22 = new java.util.ArrayList();
        java.util.Collections.addAll(arrayList22, new com.facebook.ads.redexgen.core.AbstractC2081oQ() { // from class: com.facebook.ads.redexgen.X.9z
            public static java.lang.String[] A00 = {"xDq4aPrtB4VOa6dWWLPhCvkNe2Vl9lis", "EsfqB3zUW", "UtEiT2kwdPvCqjHQhdRb9TlQndFxkub5", "Wgbe7hD6UIy", "xb", "RmqoPGkQn7vPyUpVU7ZkSehlX2jVBNRl", "20c7QZBscERNsZTH", "LeRFFk0E0DkpEnw35dU8lGRVd8w5nI17"};

            @Override // com.facebook.ads.redexgen.core.AbstractC2081oQ
            public final com.facebook.ads.redexgen.core.C04043i A09(com.facebook.ads.redexgen.core.C04043i c04043i) throws com.facebook.ads.redexgen.core.C04053j {
                int i2 = c04043i.A02;
                if (i2 != 3 && i2 != 2) {
                    if (A00[2].charAt(30) != 'b') {
                        throw new java.lang.RuntimeException();
                    }
                    A00[3] = "ty1ASCrQyl5";
                    if (i2 != 268435456 && i2 != 536870912 && i2 != 805306368 && i2 != 4) {
                        throw new com.facebook.ads.redexgen.core.C04053j(c04043i);
                    }
                }
                if (i2 != 2) {
                    return new com.facebook.ads.redexgen.core.C04043i(c04043i.A03, c04043i.A01, 2);
                }
                return com.facebook.ads.redexgen.core.C04043i.A05;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
            @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void AHH(java.nio.ByteBuffer byteBuffer) {
                int resampledSize = byteBuffer.position();
                int size = byteBuffer.limit();
                int limit = size - resampledSize;
                int position = this.A05.A02;
                switch (position) {
                    case 3:
                        limit *= 2;
                        break;
                    case 4:
                    case 805306368:
                        limit /= 2;
                        break;
                    case 268435456:
                        break;
                    case 536870912:
                        int position2 = limit / 3;
                        limit = position2 * 2;
                        break;
                    default:
                        throw new java.lang.IllegalStateException();
                }
                java.nio.ByteBuffer buffer = A00(limit);
                int position3 = this.A05.A02;
                switch (position3) {
                    case 3:
                        while (resampledSize < size) {
                            buffer.put((byte) 0);
                            int position4 = byteBuffer.get(resampledSize);
                            buffer.put((byte) ((position4 & 255) - 128));
                            resampledSize++;
                        }
                        int resampledSize222222222 = byteBuffer.limit();
                        if (A00[7].charAt(16) != 53) {
                            throw new java.lang.RuntimeException();
                        }
                        A00[5] = "iqTXYqAhTQO7Wpg5y1SXfPoSIsa3UBxa";
                        byteBuffer.position(resampledSize222222222);
                        buffer.flip();
                        return;
                    case 4:
                        while (resampledSize < size) {
                            int position5 = (int) (32767.0f * com.facebook.ads.redexgen.core.C5C.A00(byteBuffer.getFloat(resampledSize), -1.0f, 1.0f));
                            int limit2 = (short) position5;
                            int position6 = limit2 & 255;
                            buffer.put((byte) position6);
                            int position7 = limit2 >> 8;
                            buffer.put((byte) (position7 & 255));
                            resampledSize += 4;
                        }
                        int resampledSize2222222222 = byteBuffer.limit();
                        if (A00[7].charAt(16) != 53) {
                        }
                        break;
                    case 268435456:
                        while (resampledSize < size) {
                            int position8 = resampledSize + 1;
                            buffer.put(byteBuffer.get(position8));
                            buffer.put(byteBuffer.get(resampledSize));
                            resampledSize += 2;
                        }
                        int resampledSize22222222222 = byteBuffer.limit();
                        if (A00[7].charAt(16) != 53) {
                        }
                        break;
                    case 536870912:
                        while (resampledSize < size) {
                            int position9 = resampledSize + 1;
                            buffer.put(byteBuffer.get(position9));
                            int position10 = resampledSize + 2;
                            buffer.put(byteBuffer.get(position10));
                            resampledSize += 3;
                        }
                        int resampledSize222222222222 = byteBuffer.limit();
                        if (A00[7].charAt(16) != 53) {
                        }
                        break;
                    case 805306368:
                        while (resampledSize < size) {
                            int position11 = resampledSize + 2;
                            buffer.put(byteBuffer.get(position11));
                            int position12 = resampledSize + 3;
                            buffer.put(byteBuffer.get(position12));
                            resampledSize += 4;
                        }
                        int resampledSize2222222222222 = byteBuffer.limit();
                        if (A00[7].charAt(16) != 53) {
                        }
                        break;
                    default:
                        throw new java.lang.IllegalStateException();
                }
            }
        }, this.A0l, this.A0p);
        java.util.Collections.addAll(arrayList22, this.A0g.A6z());
        this.A0u = (com.facebook.ads.redexgen.core.InterfaceC04063k[]) arrayList22.toArray(new com.facebook.ads.redexgen.core.InterfaceC04063k[0]);
        this.A0t = new com.facebook.ads.redexgen.core.InterfaceC04063k[]{new com.facebook.ads.redexgen.core.A0()};
        this.A00 = 1.0f;
        this.A0E = com.facebook.ads.redexgen.core.C2202qQ.A07;
        this.A01 = 0;
        this.A0F = new com.facebook.ads.redexgen.core.AnonymousClass21(0, 0.0f);
        this.A0N = new com.facebook.ads.redexgen.core.C9J(com.facebook.ads.redexgen.core.C2175px.A06, false, 0L, 0L);
        this.A0G = com.facebook.ads.redexgen.core.C2175px.A06;
        this.A03 = -1;
        this.A0d = new com.facebook.ads.redexgen.core.InterfaceC04063k[0];
        this.A0e = new java.nio.ByteBuffer[0];
        this.A0q = new java.util.ArrayDeque<>();
        this.A0n = new com.facebook.ads.redexgen.core.C9M<>(100L);
        this.A0o = new com.facebook.ads.redexgen.core.C9M<>(100L);
        this.A0i = null;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"MERGED"}, value = "D58560720: customized audio track retry logic. Feature is available upstream already")
    private int A00() {
        if (com.facebook.ads.redexgen.core.MetaExoPlayerUpgradeConfig.A03(com.facebook.ads.redexgen.core.EnumC1796jX.A1m)) {
            return A01(this.A0K.A06, this.A0K.A02, this.A0K.A03);
        }
        return 1000000;
    }

    public static int A01(int i, int i2, int i3) {
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(i, i2, i3);
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(minBufferSize != -2);
        return minBufferSize;
    }

    public static int A02(int i, java.nio.ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return com.facebook.ads.redexgen.core.AbstractC0731Gr.A03(byteBuffer);
            case 7:
            case 8:
                int headerDataInBigEndian = com.facebook.ads.redexgen.core.H7.A00(byteBuffer);
                return headerDataInBigEndian;
            case 9:
                int headerDataInBigEndian2 = com.facebook.ads.redexgen.core.C5C.A0F(byteBuffer, byteBuffer.position());
                int headerDataInBigEndian3 = com.facebook.ads.redexgen.core.HO.A01(headerDataInBigEndian2);
                if (headerDataInBigEndian3 != -1) {
                    return headerDataInBigEndian3;
                }
                throw new java.lang.IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            case 19:
            default:
                throw new java.lang.IllegalStateException(A0L(244, 27, 17) + i);
            case 14:
                int syncframeOffset = com.facebook.ads.redexgen.core.AbstractC0731Gr.A02(byteBuffer);
                if (syncframeOffset == -1) {
                    return 0;
                }
                return com.facebook.ads.redexgen.core.AbstractC0731Gr.A04(byteBuffer, syncframeOffset) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return com.facebook.ads.redexgen.core.AbstractC0734Gu.A01(byteBuffer);
            case 20:
                return com.facebook.ads.redexgen.core.HT.A00(byteBuffer);
        }
    }

    private int A03(android.media.AudioFormat audioFormat, android.media.AudioAttributes audioAttributes) {
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 31) {
            return android.media.AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (!android.media.AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return 0;
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 != 30) {
            return 1;
        }
        java.lang.String str = com.facebook.ads.redexgen.core.C5C.A06;
        java.lang.String[] strArr = A0z;
        if (strArr[2].charAt(24) != strArr[6].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        A0z[7] = "3tkRuQxdBcZlCTwsgu7cjpWlPYr81dQa";
        if (!str.startsWith(A0L(173, 5, 73))) {
            return 1;
        }
        if (A0z[7].length() != 32) {
            return 2;
        }
        A0z[7] = "7yaDe65lYY86qlvGhmsANLPH6jvNYU2p";
        return 2;
    }

    public static int A04(android.media.AudioTrack audioTrack, java.nio.ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private int A05(android.media.AudioTrack audioTrack, java.nio.ByteBuffer byteBuffer, int i, long j) {
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.A0P == null) {
            this.A0P = java.nio.ByteBuffer.allocate(16);
            this.A0P.order(java.nio.ByteOrder.BIG_ENDIAN);
            this.A0P.putInt(1431633921);
        }
        if (this.A02 == 0) {
            this.A0P.putInt(4, i);
            this.A0P.putLong(8, 1000 * j);
            this.A0P.position(0);
            this.A02 = i;
        }
        int result = this.A0P.remaining();
        if (result > 0) {
            int avSyncHeaderBytesRemaining = audioTrack.write(this.A0P, result, 1);
            if (avSyncHeaderBytesRemaining < 0) {
                this.A02 = 0;
                return avSyncHeaderBytesRemaining;
            }
            if (avSyncHeaderBytesRemaining < result) {
                return 0;
            }
        }
        int A04 = A04(audioTrack, byteBuffer, i);
        if (A04 < 0) {
            this.A02 = 0;
            return A04;
        }
        int i2 = this.A02 - A04;
        java.lang.String[] strArr = A0z;
        if (strArr[0].charAt(31) == strArr[3].charAt(31)) {
            throw new java.lang.RuntimeException();
        }
        A0z[7] = "dZEIQVBMkpJ01dOsE3P3AYpi9pP3UgAn";
        this.A02 = i2;
        return A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A06() {
        if (this.A0K.A04 == 0) {
            long j = this.A0A;
            if (A0z[1].length() != 2) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0z;
            strArr[2] = "fKroUyDCoriQZ27MdWvBeynNHxXh31S0";
            strArr[6] = "V2Tsqcz9Ivj1DWTn2T33JaE9HhmQCs1A";
            return j / this.A0K.A01;
        }
        return this.A09;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A07() {
        if (this.A0K.A04 == 0) {
            return this.A0C / this.A0K.A05;
        }
        return this.A0B;
    }

    private long A08(long j) {
        while (!this.A0q.isEmpty() && j >= this.A0q.getFirst().A00) {
            com.facebook.ads.redexgen.core.C9J remove = this.A0q.remove();
            java.lang.String[] strArr = A0z;
            if (strArr[0].charAt(31) == strArr[3].charAt(31)) {
                throw new java.lang.RuntimeException();
            }
            A0z[7] = "uS5QwbhdMNBXkjn1i9eeeV7Jy2FKd79B";
            this.A0N = remove;
        }
        long j2 = j - this.A0N.A00;
        if (this.A0N.A02.equals(com.facebook.ads.redexgen.core.C2175px.A06)) {
            return this.A0N.A01 + j2;
        }
        if (this.A0q.isEmpty()) {
            long mediaDurationSinceLastCheckpointUs = this.A0g.A8U(j2);
            long playoutDurationSinceLastCheckpointUs = this.A0N.A01;
            return playoutDurationSinceLastCheckpointUs + mediaDurationSinceLastCheckpointUs;
        }
        com.facebook.ads.redexgen.core.C9J first = this.A0q.getFirst();
        long A0Q = com.facebook.ads.redexgen.core.C5C.A0Q(first.A00 - j, this.A0N.A02.A01);
        long playoutDurationSinceLastCheckpointUs2 = first.A01;
        return playoutDurationSinceLastCheckpointUs2 - A0Q;
    }

    private long A09(long j) {
        return this.A0K.A08(this.A0g.A98()) + j;
    }

    public static android.media.AudioFormat A0D(int i, int i2, int i3) {
        return new android.media.AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    private android.media.AudioTrack A0F() throws com.facebook.ads.redexgen.core.C05438t {
        try {
            return A0G((com.facebook.ads.redexgen.core.C9H) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A0K));
        } catch (com.facebook.ads.redexgen.core.C05438t e) {
            int retryBufferSize = A00();
            if (this.A0K.A00 > retryBufferSize) {
                com.facebook.ads.redexgen.core.C9H A0C = this.A0K.A0C(retryBufferSize);
                try {
                    android.media.AudioTrack A0G = A0G(A0C);
                    this.A0K = A0C;
                    return A0G;
                } catch (com.facebook.ads.redexgen.core.C05438t initialFailure) {
                    e.addSuppressed(initialFailure);
                    A0O();
                    throw e;
                }
            }
            A0O();
            throw e;
        }
    }

    private android.media.AudioTrack A0G(com.facebook.ads.redexgen.core.C9H c9h) throws com.facebook.ads.redexgen.core.C05438t {
        try {
            android.media.AudioTrack A0A = c9h.A0A(this.A0b, this.A0E, this.A01);
            if (0 != 0) {
                A0l(A0A);
            }
            return A0A;
        } catch (com.facebook.ads.redexgen.core.C05438t e) {
            if (this.A0I != null) {
                this.A0I.AD6(e);
            }
            throw e;
        }
    }

    private com.facebook.ads.redexgen.core.C2175px A0I() {
        return A0K().A02;
    }

    private com.facebook.ads.redexgen.core.C9J A0K() {
        if (this.A0M != null) {
            return this.A0M;
        }
        if (!this.A0q.isEmpty()) {
            return this.A0q.getLast();
        }
        return this.A0N;
    }

    public static /* synthetic */ java.util.concurrent.atomic.AtomicInteger A0M() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = A11;
        if (A0z[4].length() == 6) {
            throw new java.lang.RuntimeException();
        }
        A0z[7] = "bxvwh9PGR3JBxYGaTMYcQ8NcsphLXH3B";
        return atomicInteger;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0N() {
        for (int i = 0; i < i; i++) {
            com.facebook.ads.redexgen.core.InterfaceC04063k interfaceC04063k = this.A0d[i];
            interfaceC04063k.flush();
            this.A0e[i] = interfaceC04063k.A8d();
        }
    }

    private void A0O() {
        if (this.A0K.A0D()) {
            if (A0z[1].length() != 2) {
                throw new java.lang.RuntimeException();
            }
            A0z[5] = "ac1bNzRzCepoXog5xkGE2UP5sVZPG6ZN";
            this.A0W = true;
        }
    }

    private void A0P() {
        if (!this.A0a) {
            this.A0a = true;
            this.A0k.A0H(A07());
            this.A0D.stop();
            this.A02 = 0;
        }
    }

    private void A0Q() {
        this.A0A = 0L;
        this.A09 = 0L;
        this.A0C = 0L;
        this.A0B = 0L;
        this.A0V = false;
        this.A04 = 0;
        this.A0N = new com.facebook.ads.redexgen.core.C9J(A0I(), A0p(), 0L, 0L);
        this.A08 = 0L;
        this.A0M = null;
        this.A0q.clear();
        this.A0Q = null;
        this.A05 = 0;
        this.A0R = null;
        this.A0a = false;
        this.A0U = false;
        this.A03 = -1;
        this.A0P = null;
        this.A02 = 0;
        this.A0p.A0D();
        A0N();
    }

    private void A0R() {
        if (!A0h()) {
            return;
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 21) {
            A0X(this.A0D, this.A00);
        } else {
            A0Y(this.A0D, this.A00);
        }
    }

    private void A0S() {
        com.facebook.ads.redexgen.core.InterfaceC04063k[] interfaceC04063kArr = this.A0K.A09;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.facebook.ads.redexgen.core.InterfaceC04063k interfaceC04063k : interfaceC04063kArr) {
            if (interfaceC04063k.AAL()) {
                arrayList.add(interfaceC04063k);
            } else {
                interfaceC04063k.flush();
            }
        }
        int size = arrayList.size();
        com.facebook.ads.redexgen.core.InterfaceC04063k[] audioProcessors = new com.facebook.ads.redexgen.core.InterfaceC04063k[size];
        this.A0d = (com.facebook.ads.redexgen.core.InterfaceC04063k[]) arrayList.toArray(audioProcessors);
        this.A0e = new java.nio.ByteBuffer[size];
        A0N();
    }

    private void A0U(long j) {
        com.facebook.ads.redexgen.core.C2175px c2175px;
        boolean z;
        if (A0i()) {
            c2175px = this.A0g.A4F(A0I());
        } else {
            c2175px = com.facebook.ads.redexgen.core.C2175px.A06;
            if (A0z[7].length() != 32) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0z;
            strArr[0] = "I2oaxDVd9h4oXXSjJqrHfFArwnmkYbuU";
            strArr[3] = "djNSsSrQ9W3py9jFqud3MNGsNXIKPv6H";
        }
        if (A0i()) {
            z = this.A0g.A4G(A0p());
        } else {
            z = false;
        }
        this.A0q.add(new com.facebook.ads.redexgen.core.C9J(c2175px, z, java.lang.Math.max(0L, j), this.A0K.A08(A07())));
        A0S();
        if (this.A0I != null) {
            this.A0I.AFy(z);
        }
    }

    private void A0V(long j) throws com.facebook.ads.redexgen.core.C05468y {
        java.nio.ByteBuffer byteBuffer;
        int length = this.A0d.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                java.nio.ByteBuffer[] byteBufferArr = this.A0e;
                int i2 = i - 1;
                java.lang.String[] strArr = A0z;
                java.lang.String str = strArr[0];
                java.lang.String str2 = strArr[3];
                int index = str.charAt(31);
                int count = str2.charAt(31);
                if (index == count) {
                    throw new java.lang.RuntimeException();
                }
                A0z[1] = "0P";
                byteBuffer = byteBufferArr[i2];
            } else {
                byteBuffer = this.A0Q != null ? this.A0Q : com.facebook.ads.redexgen.core.InterfaceC04063k.A00;
            }
            if (i == length) {
                A0e(byteBuffer, j);
            } else {
                com.facebook.ads.redexgen.core.InterfaceC04063k interfaceC04063k = this.A0d[i];
                int index2 = this.A03;
                if (i > index2) {
                    interfaceC04063k.AHH(byteBuffer);
                }
                java.nio.ByteBuffer A8d = interfaceC04063k.A8d();
                this.A0e[i] = A8d;
                if (A8d.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    private void A0W(android.media.AudioTrack audioTrack) {
        if (this.A0O == null) {
            this.A0O = new com.facebook.ads.redexgen.core.C9P(this);
        }
        com.facebook.ads.redexgen.core.C9P c9p = this.A0O;
        java.lang.String[] strArr = A0z;
        if (strArr[2].charAt(24) != strArr[6].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        A0z[7] = "8t8nFWsxRl9HTQxqXeO3m9pm7diLrI9Q";
        c9p.A00(audioTrack);
    }

    public static void A0X(android.media.AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    public static void A0Y(android.media.AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    private void A0Z(final android.media.AudioTrack audioTrack, final com.facebook.ads.redexgen.core.AnonymousClass48 anonymousClass48, final com.facebook.ads.redexgen.core.InterfaceC05448v interfaceC05448v, final com.facebook.ads.redexgen.core.C05418r c05418r) {
        anonymousClass48.A02();
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.myLooper());
        synchronized (A10) {
            if (A0x == null) {
                A0x = com.facebook.ads.redexgen.core.C5C.A0u(A0L(23, 33, 21));
            }
            A0w++;
            A0x.execute(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.9A
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.C2077oM.A0a(audioTrack, interfaceC05448v, handler, c05418r, anonymousClass48);
                }
            });
        }
    }

    public static /* synthetic */ void A0a(android.media.AudioTrack audioTrack, final com.facebook.ads.redexgen.core.InterfaceC05448v interfaceC05448v, android.os.Handler handler, final com.facebook.ads.redexgen.core.C05418r c05418r, com.facebook.ads.redexgen.core.AnonymousClass48 anonymousClass48) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (interfaceC05448v != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.99
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.ads.redexgen.core.InterfaceC05448v.this.AD8(c05418r);
                    }
                });
            }
            anonymousClass48.A04();
            synchronized (A10) {
                A0w--;
                if (A0w == 0) {
                    A0x.shutdown();
                    A0x = null;
                }
            }
        } catch (java.lang.Throwable th) {
            if (interfaceC05448v != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.99
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.ads.redexgen.core.InterfaceC05448v.this.AD8(c05418r);
                    }
                });
            }
            anonymousClass48.A04();
            synchronized (A10) {
                A0w--;
                if (A0w == 0) {
                    A0x.shutdown();
                    A0x = null;
                }
                throw th;
            }
        }
    }

    private void A0b(com.facebook.ads.redexgen.core.C2175px c2175px) {
        if (A0h()) {
            try {
                this.A0D.setPlaybackParams(new android.media.PlaybackParams().allowDefaults().setSpeed(c2175px.A01).setPitch(c2175px.A00).setAudioFallbackMode(2));
            } catch (java.lang.IllegalArgumentException e) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A0A(A0L(7, 16, 23), A0L(56, 29, 89), e);
            }
            android.media.PlaybackParams playbackParams = this.A0D.getPlaybackParams();
            float speed = playbackParams.getSpeed();
            android.media.PlaybackParams playbackParams2 = this.A0D.getPlaybackParams();
            c2175px = new com.facebook.ads.redexgen.core.C2175px(speed, playbackParams2.getPitch());
            this.A0k.A0G(c2175px.A01);
        }
        this.A0G = c2175px;
    }

    private void A0c(com.facebook.ads.redexgen.core.C2175px c2175px, boolean z) {
        com.facebook.ads.redexgen.core.C9J A0K = A0K();
        if (!c2175px.equals(A0K.A02) || z != A0K.A03) {
            com.facebook.ads.redexgen.core.C9J mediaPositionParameters = new com.facebook.ads.redexgen.core.C9J(c2175px, z, -9223372036854775807L, -9223372036854775807L);
            if (A0h()) {
                this.A0M = mediaPositionParameters;
            } else {
                this.A0N = mediaPositionParameters;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e8, code lost:
    
        if (r0 < r2) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0e(java.nio.ByteBuffer byteBuffer, long j) throws com.facebook.ads.redexgen.core.C05468y {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        if (this.A0R != null) {
            com.facebook.ads.redexgen.core.AbstractC04203y.A07(this.A0R == byteBuffer);
        } else {
            this.A0R = byteBuffer;
            if (com.facebook.ads.redexgen.core.C5C.A02 < 21) {
                int remaining = byteBuffer.remaining();
                if (this.A0c != null) {
                    int bytesRemaining = this.A0c.length;
                }
                this.A0c = new byte[remaining];
                int error = byteBuffer.position();
                byteBuffer.get(this.A0c, 0, remaining);
                byteBuffer.position(error);
                this.A06 = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        java.lang.String[] strArr = A0z;
        if (strArr[0].charAt(31) != strArr[3].charAt(31)) {
            java.lang.String[] strArr2 = A0z;
            strArr2[0] = "3eWYirSbyPmDL1bYCzZXBxfzFZ0IdKrC";
            strArr2[3] = "GyxGkXW2OhP0jBJSoZP6T4LL67dzWnKX";
            int i = 0;
            if (com.facebook.ads.redexgen.core.C5C.A02 < 21) {
                int A0C = this.A0k.A0C(this.A0C);
                if (A0C > 0) {
                    i = this.A0D.write(this.A0c, this.A06, java.lang.Math.min(remaining2, A0C));
                    if (i > 0) {
                        this.A06 += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                }
            } else {
                boolean z = this.A0b;
                int error2 = A0z[5].charAt(7);
                if (error2 != 67) {
                    A0z[7] = "ZkKj9ZygtLpdvIDMWffq04xWvvg8fJzl";
                    if (!z) {
                        i = A04(this.A0D, byteBuffer, remaining2);
                    } else {
                        com.facebook.ads.redexgen.core.AbstractC04203y.A08(j != -9223372036854775807L);
                        i = A05(this.A0D, byteBuffer, remaining2, j);
                    }
                }
            }
            this.A07 = android.os.SystemClock.elapsedRealtime();
            if (i < 0) {
                com.facebook.ads.redexgen.core.C05468y c05468y = new com.facebook.ads.redexgen.core.C05468y(i, this.A0K.A07, A0k(i) && this.A0B > 0);
                if (this.A0I != null) {
                    this.A0I.AD6(c05468y);
                }
                if (!c05468y.A02) {
                    this.A0o.A01(c05468y);
                    return;
                }
                throw c05468y;
            }
            this.A0o.A00();
            if (A0l(this.A0D)) {
                if (this.A0B > 0) {
                    this.A0V = false;
                }
                if (this.A0X && this.A0I != null && i < remaining2 && !this.A0V) {
                    this.A0I.AF3();
                }
            }
            int bytesRemaining2 = this.A0K.A04;
            if (bytesRemaining2 == 0) {
                this.A0C += i;
            }
            if (i == remaining2) {
                int bytesRemaining3 = this.A0K.A04;
                if (bytesRemaining3 != 0) {
                    com.facebook.ads.redexgen.core.AbstractC04203y.A08(byteBuffer == this.A0Q);
                    long j2 = this.A0B;
                    int bytesRemaining4 = this.A04;
                    long j3 = bytesRemaining4;
                    int bytesRemaining5 = this.A05;
                    this.A0B = j2 + (j3 * bytesRemaining5);
                }
                this.A0R = null;
                return;
            }
            return;
        }
        throw new java.lang.RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r8.A0R != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r8.A0R != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0f() throws com.facebook.ads.redexgen.core.C05468y {
        boolean z = false;
        if (this.A03 == -1) {
            this.A03 = 0;
            z = true;
        }
        while (this.A03 < this.A0d.length) {
            com.facebook.ads.redexgen.core.InterfaceC04063k interfaceC04063k = this.A0d[this.A03];
            if (z) {
                interfaceC04063k.AHG();
            }
            A0V(-9223372036854775807L);
            boolean AAP = interfaceC04063k.AAP();
            java.lang.String[] strArr = A0z;
            if (strArr[0].charAt(31) == strArr[3].charAt(31)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0z;
            strArr2[0] = "SZlzkFrjT9RrDQln4ds2mG9At4QQTsjU";
            strArr2[3] = "7YjBVNvSPjH845plY2W9SI0PPB4m8Pgz";
            if (!AAP) {
                return false;
            }
            z = true;
            this.A03++;
        }
        if (this.A0R != null) {
            A0e(this.A0R, -9223372036854775807L);
            java.lang.String[] strArr3 = A0z;
            if (strArr3[2].charAt(24) == strArr3[6].charAt(24)) {
                A0z[1] = "ih";
            }
        }
        this.A03 = -1;
        return true;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"MERGED"}, value = "D45157249: Retry Audio Track Init failure with less Audio track allocation sizes; Upstream has this feature")
    private boolean A0g() throws com.facebook.ads.redexgen.core.C05438t {
        if (!this.A0h.A03()) {
            return false;
        }
        this.A0D = this.A0S ? A0F() : A0G(this.A0K);
        java.lang.String[] strArr = A0z;
        if (strArr[2].charAt(24) != strArr[6].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0z;
        strArr2[2] = "dWhjJD4ryPYmrGCHimoCOlqhHDAwt6Vc";
        strArr2[6] = "fifoJCnFOIc3PbrGHGLYECSFH4AKcCFA";
        if (A0l(this.A0D)) {
            A0W(this.A0D);
            if (this.A0f != 3) {
                this.A0D.setOffloadDelayPadding(this.A0K.A07.A08, this.A0K.A07.A09);
            }
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 31 && this.A0H != null) {
            com.facebook.ads.redexgen.core.C9D.A00(this.A0D, this.A0H);
        }
        this.A01 = this.A0D.getAudioSessionId();
        this.A0k.A0I(this.A0D, this.A0K.A04 == 2, this.A0K.A03, this.A0K.A05, this.A0K.A00);
        A0R();
        if (this.A0F.A01 != 0) {
            this.A0D.attachAuxEffect(this.A0F.A01);
            android.media.AudioTrack audioTrack = this.A0D;
            com.facebook.ads.redexgen.core.AnonymousClass21 anonymousClass21 = this.A0F;
            if (A0z[7].length() != 32) {
                audioTrack.setAuxEffectSendLevel(anonymousClass21.A00);
            } else {
                A0z[7] = "RIRRfrrRSIs4t73WNQ17weV6jTByi7uZ";
                audioTrack.setAuxEffectSendLevel(anonymousClass21.A00);
            }
        }
        if (this.A0J != null && com.facebook.ads.redexgen.core.C5C.A02 >= 23) {
            com.facebook.ads.redexgen.core.C9C.A00(this.A0D, this.A0J);
        }
        this.A0Y = true;
        if (this.A0I != null) {
            this.A0I.AD7(this.A0K.A0B());
        }
        return true;
    }

    private boolean A0h() {
        return this.A0D != null;
    }

    private boolean A0i() {
        if (!this.A0b) {
            if (A0L(271, 9, 70).equals(this.A0K.A07.A0W) && !A0j(this.A0K.A07.A0C)) {
                return true;
            }
        }
        return false;
    }

    private boolean A0j(int i) {
        return this.A0s && com.facebook.ads.redexgen.core.C5C.A14(i);
    }

    public static boolean A0k(int i) {
        return (com.facebook.ads.redexgen.core.C5C.A02 >= 24 && i == -6) || i == -32;
    }

    public static boolean A0l(android.media.AudioTrack audioTrack) {
        return com.facebook.ads.redexgen.core.C5C.A02 >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0m(com.facebook.ads.redexgen.core.C2196qI c2196qI, com.facebook.ads.redexgen.core.C2202qQ c2202qQ) {
        int A03;
        int channelConfig;
        if (com.facebook.ads.redexgen.core.C5C.A02 < 29 || this.A0f == 0 || (A03 = com.facebook.ads.redexgen.core.C3J.A03((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c2196qI.A0W), c2196qI.A0R)) == 0) {
            return false;
        }
        int encoding = c2196qI.A06;
        int channelConfig2 = com.facebook.ads.redexgen.core.C5C.A01(encoding);
        if (channelConfig2 == 0) {
            return false;
        }
        int encoding2 = c2196qI.A0G;
        switch (A03(A0D(encoding2, channelConfig2, A03), c2202qQ.A01().A00)) {
            case 0:
                return false;
            case 1:
                int encoding3 = c2196qI.A08;
                if (encoding3 == 0) {
                    int encoding4 = c2196qI.A09;
                    if (encoding4 == 0) {
                        channelConfig = 0;
                        int encoding5 = this.A0f;
                        int encoding6 = encoding5 != 1 ? 1 : 0;
                        return channelConfig != 0 || encoding6 == 0;
                    }
                }
                channelConfig = 1;
                int encoding52 = this.A0f;
                if (encoding52 != 1) {
                }
                if (channelConfig != 0) {
                }
            case 2:
                return true;
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    public final int A0o(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        if (!A0L(271, 9, 70).equals(c2196qI.A0W)) {
            return ((this.A0W || !A0m(c2196qI, this.A0E)) && !this.A0j.A0B(c2196qI)) ? 0 : 2;
        }
        if (!com.facebook.ads.redexgen.core.C5C.A15(c2196qI.A0C)) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0L(7, 16, 23), A0L(85, 22, 8) + c2196qI.A0C);
            return 0;
        }
        int i = c2196qI.A0C;
        if (A0z[7].length() != 32) {
            throw new java.lang.RuntimeException();
        }
        A0z[1] = "pL";
        return (i == 2 || (this.A0s && c2196qI.A0C == 4)) ? 2 : 1;
    }

    public final boolean A0p() {
        return A0K().A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void A59(com.facebook.ads.redexgen.core.C2196qI c2196qI, int i, int[] iArr) throws com.facebook.ads.redexgen.core.C05428s {
        int outputSampleRate;
        com.facebook.ads.redexgen.core.InterfaceC04063k[] interfaceC04063kArr;
        int outputSampleRate2;
        int outputPcmFrameSize;
        int outputChannelConfig;
        int intValue;
        int outputEncoding;
        int outputMode = i;
        int[] iArr2 = iArr;
        if (A0L(271, 9, 70).equals(c2196qI.A0W)) {
            com.facebook.ads.redexgen.core.AbstractC04203y.A07(com.facebook.ads.redexgen.core.C5C.A15(c2196qI.A0C));
            outputSampleRate = com.facebook.ads.redexgen.core.C5C.A06(c2196qI.A0C, c2196qI.A06);
            if (A0j(c2196qI.A0C)) {
                interfaceC04063kArr = this.A0t;
            } else {
                interfaceC04063kArr = this.A0u;
            }
            com.facebook.ads.redexgen.core.C9x c9x = this.A0p;
            int inputPcmFrameSize = c2196qI.A08;
            c9x.A0E(inputPcmFrameSize, c2196qI.A09);
            int inputPcmFrameSize2 = com.facebook.ads.redexgen.core.C5C.A02;
            if (inputPcmFrameSize2 < 21) {
                int inputPcmFrameSize3 = c2196qI.A06;
                if (inputPcmFrameSize3 == 8 && iArr2 == null) {
                    iArr2 = new int[6];
                    for (int inputPcmFrameSize4 = 0; inputPcmFrameSize4 < iArr2.length; inputPcmFrameSize4++) {
                        iArr2[inputPcmFrameSize4] = inputPcmFrameSize4;
                    }
                }
            }
            this.A0l.A0C(iArr2);
            int i2 = c2196qI.A0G;
            int inputPcmFrameSize5 = c2196qI.A06;
            com.facebook.ads.redexgen.core.C04043i c04043i = new com.facebook.ads.redexgen.core.C04043i(i2, inputPcmFrameSize5, c2196qI.A0C);
            for (com.facebook.ads.redexgen.core.InterfaceC04063k interfaceC04063k : interfaceC04063kArr) {
                try {
                    com.facebook.ads.redexgen.core.C04043i A57 = interfaceC04063k.A57(c04043i);
                    if (interfaceC04063k.AAL()) {
                        c04043i = A57;
                    }
                } catch (com.facebook.ads.redexgen.core.C04053j e) {
                    throw new com.facebook.ads.redexgen.core.C05428s(e, c2196qI);
                }
            }
            outputChannelConfig = 0;
            intValue = c04043i.A02;
            outputSampleRate2 = c04043i.A03;
            outputEncoding = com.facebook.ads.redexgen.core.C5C.A01(c04043i.A01);
            outputPcmFrameSize = com.facebook.ads.redexgen.core.C5C.A06(intValue, c04043i.A01);
        } else {
            outputSampleRate = -1;
            interfaceC04063kArr = new com.facebook.ads.redexgen.core.InterfaceC04063k[0];
            outputSampleRate2 = c2196qI.A0G;
            outputPcmFrameSize = -1;
            if (A0m(c2196qI, this.A0E)) {
                outputChannelConfig = 1;
                intValue = com.facebook.ads.redexgen.core.C3J.A03((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c2196qI.A0W), c2196qI.A0R);
                outputEncoding = com.facebook.ads.redexgen.core.C5C.A01(c2196qI.A06);
            } else {
                outputChannelConfig = 2;
                if (A0z[1].length() == 2) {
                    A0z[5] = "lAbqtU1Up8pAGeHbeXVy9OX5EzAUCGx9";
                    android.util.Pair<java.lang.Integer, java.lang.Integer> A09 = this.A0j.A09(c2196qI);
                    if (A09 != null) {
                        intValue = ((java.lang.Integer) A09.first).intValue();
                        outputEncoding = ((java.lang.Integer) A09.second).intValue();
                        if (A0z[7].length() == 32) {
                            A0z[1] = "Lw";
                        }
                    } else {
                        throw new com.facebook.ads.redexgen.core.C05428s(A0L(207, 37, 24) + c2196qI, c2196qI);
                    }
                }
                throw new java.lang.RuntimeException();
            }
        }
        java.lang.String A0L = A0L(0, 7, 114);
        if (intValue != 0) {
            if (outputEncoding != 0) {
                if (outputMode == 0) {
                    com.facebook.ads.redexgen.core.C9F c9f = this.A0m;
                    int A01 = A01(outputSampleRate2, outputEncoding, intValue);
                    int outputChannelConfig2 = outputPcmFrameSize != -1 ? outputPcmFrameSize : 1;
                    outputMode = c9f.A75(A01, intValue, outputChannelConfig, outputChannelConfig2, outputSampleRate2, c2196qI.A05, this.A0r ? 8.0d : 1.0d);
                }
                this.A0W = false;
                com.facebook.ads.redexgen.core.C9H c9h = new com.facebook.ads.redexgen.core.C9H(c2196qI, outputSampleRate, outputChannelConfig, outputPcmFrameSize, outputSampleRate2, outputEncoding, intValue, outputMode, interfaceC04063kArr, this.A0b);
                if (A0h()) {
                    this.A0L = c9h;
                    return;
                } else {
                    this.A0K = c9h;
                    return;
                }
            }
            throw new com.facebook.ads.redexgen.core.C05428s(A0L(107, 36, 56) + outputChannelConfig + A0L + c2196qI, c2196qI);
        }
        throw new com.facebook.ads.redexgen.core.C05428s(A0L(143, 30, 72) + outputChannelConfig + A0L + c2196qI, c2196qI);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void A5z() {
        if (this.A0b) {
            this.A0b = false;
            flush();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void A6M() {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(com.facebook.ads.redexgen.core.C5C.A02 >= 21);
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A0T);
        if (!this.A0b) {
            this.A0b = true;
            flush();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void A6T() {
        if (com.facebook.ads.redexgen.core.C5C.A02 < 25) {
            flush();
            return;
        }
        this.A0o.A00();
        this.A0n.A00();
        if (!A0h()) {
            return;
        }
        A0Q();
        if (this.A0k.A0J()) {
            this.A0D.pause();
        }
        this.A0D.flush();
        this.A0k.A0E();
        this.A0k.A0I(this.A0D, this.A0K.A04 == 2, this.A0K.A03, this.A0K.A05, this.A0K.A00);
        this.A0Y = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final long A7f(boolean z) {
        if (!A0h() || this.A0Y) {
            return Long.MIN_VALUE;
        }
        long A0D = this.A0k.A0D(z);
        com.facebook.ads.redexgen.core.C9H c9h = this.A0K;
        long positionUs = A07();
        return A09(A08(java.lang.Math.min(A0D, c9h.A08(positionUs))));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final com.facebook.ads.redexgen.core.C2175px A8m() {
        if (this.A0r) {
            return this.A0G;
        }
        return A0I();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final boolean A9e(java.nio.ByteBuffer byteBuffer, final long adjustmentUs, int i) throws com.facebook.ads.redexgen.core.C05438t, com.facebook.ads.redexgen.core.C05468y {
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(this.A0Q == null || byteBuffer == this.A0Q);
        if (this.A0L != null) {
            if (!A0f()) {
                return false;
            }
            if (this.A0L.A0E(this.A0K)) {
                this.A0K = this.A0L;
                this.A0L = null;
                if (A0l(this.A0D) && this.A0f != 3) {
                    if (this.A0D.getPlayState() == 3) {
                        this.A0D.setOffloadEndOfStream();
                    }
                    android.media.AudioTrack audioTrack = this.A0D;
                    int i2 = this.A0K.A07.A08;
                    java.lang.String[] strArr = A0z;
                    if (strArr[0].charAt(31) != strArr[3].charAt(31)) {
                        java.lang.String[] strArr2 = A0z;
                        strArr2[0] = "jzTmuhmcT6oYK5lhq8C6QOSyUXF7wdwQ";
                        strArr2[3] = "cWMrj79Gd0zdSeVIzQJ8siz7G3nSjdgD";
                        audioTrack.setOffloadDelayPadding(i2, this.A0K.A07.A09);
                        this.A0V = true;
                    } else {
                        throw new java.lang.RuntimeException();
                    }
                }
            } else {
                A0P();
                if (A9o()) {
                    return false;
                }
                flush();
            }
            A0U(adjustmentUs);
        }
        if (!A0h()) {
            try {
                if (!A0g()) {
                    return false;
                }
            } catch (com.facebook.ads.redexgen.core.C05438t e) {
                if (!e.A02) {
                    this.A0n.A01(e);
                    return false;
                }
                throw e;
            }
        }
        this.A0n.A00();
        if (this.A0Y) {
            this.A08 = java.lang.Math.max(0L, adjustmentUs);
            this.A0Z = false;
            this.A0Y = false;
            if (this.A0r && com.facebook.ads.redexgen.core.C5C.A02 >= 23) {
                A0b(this.A0G);
            }
            A0U(adjustmentUs);
            if (this.A0X) {
                AH0();
            }
        }
        if (!this.A0k.A0N(A07())) {
            return false;
        }
        if (this.A0Q == null) {
            com.facebook.ads.redexgen.core.AbstractC04203y.A07(byteBuffer.order() == java.nio.ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.A0K.A04 != 0 && this.A04 == 0) {
                this.A04 = A02(this.A0K.A03, byteBuffer);
                if (this.A04 == 0) {
                    return true;
                }
            }
            if (this.A0M != null) {
                if (!A0f()) {
                    return false;
                }
                A0U(adjustmentUs);
                this.A0M = null;
            }
            final long A09 = this.A08 + this.A0K.A09(A06() - this.A0p.A0C());
            if (!this.A0Z && java.lang.Math.abs(A09 - adjustmentUs) > 200000) {
                if (this.A0I != null) {
                    this.A0I.AD6(new java.lang.Exception(adjustmentUs, A09) { // from class: com.facebook.ads.redexgen.X.8x
                        public static byte[] A02;
                        public final long A00;
                        public final long A01;

                        static {
                            A01();
                        }

                        public static java.lang.String A00(int i3, int i4, int i5) {
                            byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i3, i3 + i4);
                            for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                                copyOfRange[i6] = (byte) ((copyOfRange[i6] - i5) + androidx.media3.common.PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION);
                            }
                            return new java.lang.String(copyOfRange);
                        }

                        public static void A01() {
                            A02 = new byte[]{-20, -32, 39, 47, 52, -32, com.google.common.base.Ascii.GS, 54, 45, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 56, 45, 43, 60, 45, 44, -24, 41, kotlin.io.encoding.Base64.padSymbol, 44, 49, 55, -24, 60, 58, 41, 43, 51, -24, 60, 49, 53, 45, 59, 60, 41, 53, 56, -24, 44, 49, 59, 43, 55, 54, 60, 49, 54, kotlin.io.encoding.Base64.padSymbol, 49, 60, 65, 2, -24, 45, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 56, 45, 43, 60, 45, 44, -24};
                        }

                        {
                            super(A00(6, 57, 94) + A09 + A00(0, 6, 86) + adjustmentUs);
                            this.A00 = adjustmentUs;
                            this.A01 = A09;
                        }
                    });
                }
                this.A0Z = true;
            }
            if (this.A0Z) {
                if (!A0f()) {
                    return false;
                }
                long j = adjustmentUs - A09;
                this.A08 += j;
                this.A0Z = false;
                A0U(adjustmentUs);
                if (this.A0I != null && j != 0) {
                    this.A0I.AFO();
                }
            }
            if (this.A0K.A04 == 0) {
                this.A0A += byteBuffer.remaining();
            } else {
                this.A09 += this.A04 * i;
            }
            this.A0Q = byteBuffer;
            this.A05 = i;
        }
        A0V(adjustmentUs);
        if (!this.A0Q.hasRemaining()) {
            this.A0Q = null;
            this.A05 = 0;
            return true;
        }
        if (this.A0k.A0M(A07())) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0L(7, 16, 23), A0L(178, 29, 2));
            flush();
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void A9h() {
        this.A0Z = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final boolean A9o() {
        return A0h() && this.A0k.A0L(A07());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final boolean AAP() {
        return !A0h() || (this.A0U && !A9o());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void AH0() {
        this.A0X = true;
        if (A0h()) {
            this.A0k.A0F();
            this.A0D.play();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void AH2() throws com.facebook.ads.redexgen.core.C05468y {
        if (!this.A0U && A0h() && A0f()) {
            A0P();
            this.A0U = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void AJG(com.facebook.ads.redexgen.core.C2202qQ c2202qQ) {
        if (this.A0E.equals(c2202qQ)) {
            return;
        }
        this.A0E = c2202qQ;
        if (this.A0b) {
            return;
        }
        flush();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void AJH(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            this.A0T = i != 0;
            flush();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void AJI(com.facebook.ads.redexgen.core.AnonymousClass21 anonymousClass21) {
        if (this.A0F.equals(anonymousClass21)) {
            return;
        }
        int i = anonymousClass21.A01;
        float f = anonymousClass21.A00;
        if (this.A0D != null) {
            int effectId = this.A0F.A01;
            if (effectId != i) {
                android.media.AudioTrack audioTrack = this.A0D;
                if (A0z[7].length() != 32) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0z;
                strArr[0] = "ejzMDVkCKjmiTtIYDMlHFxA2dL6L7Th4";
                strArr[3] = "3op87oKeQBz5MvPCbX5N1e1cWqib6LOP";
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.A0D.setAuxEffectSendLevel(f);
            }
        }
        this.A0F = anonymousClass21;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D45157249: Retry Audio Track Init failure with less Audio track allocation sizes")
    public final void AJQ(boolean z) {
        this.A0S = z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void AJV(com.facebook.ads.redexgen.core.InterfaceC05448v interfaceC05448v) {
        this.A0I = interfaceC05448v;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void AJd(com.facebook.ads.redexgen.core.C2175px c2175px) {
        com.facebook.ads.redexgen.core.C2175px c2175px2 = new com.facebook.ads.redexgen.core.C2175px(com.facebook.ads.redexgen.core.C5C.A00(c2175px.A01, 0.1f, 8.0f), com.facebook.ads.redexgen.core.C5C.A00(c2175px.A00, 0.1f, 8.0f));
        if (this.A0r) {
            int i = com.facebook.ads.redexgen.core.C5C.A02;
            java.lang.String[] strArr = A0z;
            if (strArr[2].charAt(24) != strArr[6].charAt(24)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0z;
            strArr2[0] = "mNkMATimN2JlCwGmoqKrFKrIOPJhoNaC";
            strArr2[3] = "5L3Fdp27ixuu2nNAlcGmWXwucnCjA2b5";
            if (i >= 23) {
                A0b(c2175px2);
                return;
            }
        }
        A0c(c2175px2, A0p());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void AJg(com.facebook.ads.redexgen.core.C8O c8o) {
        this.A0H = c8o;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void AJi(android.media.AudioDeviceInfo audioDeviceInfo) {
        this.A0J = audioDeviceInfo == null ? null : new com.facebook.ads.redexgen.core.C9E(audioDeviceInfo);
        java.lang.String[] strArr = A0z;
        if (strArr[2].charAt(24) != strArr[6].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0z;
        strArr2[0] = "fdceU7wc4F7eltehFDuXboaWNHZsjBbo";
        strArr2[3] = "ndF9ePFUZlaV1XmuWN8y5PTJytJgMa2t";
        if (this.A0D != null) {
            com.facebook.ads.redexgen.core.C9C.A00(this.A0D, this.A0J);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void AJo(boolean z) {
        A0c(A0I(), z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final boolean AKN(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        return A0o(c2196qI) != 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    public final boolean AKP(int i, int i2) {
        return com.facebook.ads.redexgen.core.C5C.A15(i2) ? i2 != 4 || com.facebook.ads.redexgen.core.C5C.A02 >= 21 : this.A0j != null && this.A0j.A0A(i2) && (i == -1 || i <= this.A0j.A08());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void flush() {
        if (A0h()) {
            A0Q();
            if (this.A0k.A0J()) {
                this.A0D.pause();
            }
            boolean A0l = A0l(this.A0D);
            if (A0z[4].length() == 6) {
                throw new java.lang.RuntimeException();
            }
            A0z[5] = "i9Rinuw5ztOihCbMK36CN4CjOXT3DfRT";
            if (A0l) {
                com.facebook.ads.redexgen.core.C9P c9p = this.A0O;
                if (A0z[7].length() != 32) {
                    throw new java.lang.RuntimeException();
                }
                A0z[7] = "H3Tn5qbfAuT8Q6Ln8VWJEFxZf5lTeqqt";
                ((com.facebook.ads.redexgen.core.C9P) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c9p)).A01(this.A0D);
            }
            if (com.facebook.ads.redexgen.core.C5C.A02 < 21 && !this.A0T) {
                this.A01 = 0;
            }
            com.facebook.ads.redexgen.core.C05418r A0B = this.A0K.A0B();
            if (this.A0L != null) {
                this.A0K = this.A0L;
                this.A0L = null;
            }
            this.A0k.A0E();
            A0Z(this.A0D, this.A0h, this.A0I, A0B);
            this.A0D = null;
        }
        this.A0o.A00();
        this.A0n.A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void pause() {
        this.A0X = false;
        if (A0h() && this.A0k.A0K()) {
            this.A0D.pause();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05478z
    public final void setVolume(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            java.lang.String[] strArr = A0z;
            if (strArr[0].charAt(31) == strArr[3].charAt(31)) {
                throw new java.lang.RuntimeException();
            }
            A0z[5] = "E1Te023wTVVNappUuQixsG3bphOCE2I8";
            A0R();
        }
    }
}
