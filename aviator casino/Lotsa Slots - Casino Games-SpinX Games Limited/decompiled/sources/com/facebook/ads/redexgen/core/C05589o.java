package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.9o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05589o {
    public static byte[] A08;
    public static java.lang.String[] A09 = {"634gowWrnODsCbHJW3RM2adSB8UjvpNK", "SJrAWOr70TCHX", "EwIuJu9eGNp0k", "E6EVZDT", "sHeITXs", "FXQ6HdUX", "YL7g5rxYaYN1DF5ZV43is2fGGs0zV37S", "j2oNEgxbTlE4krYsb5twTfwtoUHd8Sk9"};
    public com.facebook.ads.redexgen.core.DC A02;
    public java.lang.String A05;
    public final com.facebook.ads.redexgen.core.C5Y A06;
    public final java.lang.Object A07;
    public com.facebook.ads.redexgen.core.A6 A01 = com.facebook.ads.redexgen.core.A3.A01();
    public com.facebook.ads.redexgen.core.FF A03 = new com.facebook.ads.redexgen.core.C2003n9();
    public int A00 = 1048576;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1754")
    public com.facebook.ads.redexgen.core.InterfaceC1877ku<com.facebook.ads.redexgen.core.InterfaceExecutorC0690Fb> A04 = new com.facebook.ads.redexgen.core.InterfaceC1877ku() { // from class: com.facebook.ads.redexgen.X.nj
        @Override // com.facebook.ads.redexgen.core.InterfaceC1877ku
        public final java.lang.Object get() {
            return com.facebook.ads.redexgen.core.C05589o.A01();
        }
    };

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A09[7].charAt(23) != 't') {
                throw new java.lang.RuntimeException();
            }
            A09[4] = "2gbF6ls";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
            i4++;
        }
    }

    public static void A03() {
        A08 = new byte[]{com.google.common.base.Ascii.DC4, 35, 35, 62, 35, 113, 56, 63, 34, 37, 48, 63, 37, 56, 48, 37, 56, 63, 54, 113, com.google.common.base.Ascii.NAK, 52, 55, 48, 36, kotlin.io.encoding.Base64.padSymbol, 37, com.google.common.base.Ascii.DC4, 41, 37, 35, 48, 50, 37, 62, 35, 34, com.google.common.base.Ascii.ETB, 48, 50, 37, 62, 35, 40, 106, 102, 100, 39, 111, 104, 106, 108, 107, 102, 102, 98, 39, 104, 109, 122, 39, 104, 103, 109, 123, 102, 96, 109, 113, 39, 100, 108, 109, 96, 104, 58, 39, 108, 113, 125, 123, 104, 106, 125, 102, 123, 39, 77, 108, 111, 104, 124, 101, 125, 76, 113, 125, 123, 104, 106, 125, 102, 123, 122, 79, 104, 106, 125, 102, 123, 112};
    }

    static {
        A03();
    }

    public C05589o(com.facebook.ads.redexgen.core.C5Y c5y) {
        this.A06 = c5y;
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.C2050nu A00(com.facebook.ads.redexgen.core.HD hd, com.facebook.ads.redexgen.core.C8O c8o) {
        return new com.facebook.ads.redexgen.core.C2050nu(hd);
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.InterfaceExecutorC0690Fb A01() {
        return null;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Custom reflection logic to avoid loading DefaultExtractorsFactory")
    public final com.facebook.ads.redexgen.core.C05579n A04(android.net.Uri uri) {
        java.lang.String A02 = A02(0, 44, 75);
        if (this.A02 == null) {
            try {
                java.lang.reflect.Constructor<? extends com.facebook.ads.androidx.media3.extractor.ExtractorsFactory> constructor = java.lang.Class.forName(A02(44, 67, 19)).asSubclass(com.facebook.ads.redexgen.core.HD.class).getConstructor(new java.lang.Class[0]);
                final com.facebook.ads.redexgen.core.HD hd = (com.facebook.ads.redexgen.core.HD) constructor.newInstance(new java.lang.Object[0]);
                this.A02 = new com.facebook.ads.redexgen.core.DC() { // from class: com.facebook.ads.redexgen.X.nl
                    @Override // com.facebook.ads.redexgen.core.DC
                    public final com.facebook.ads.redexgen.core.DD A5X(com.facebook.ads.redexgen.core.C8O c8o) {
                        return com.facebook.ads.redexgen.core.C05589o.A00(com.facebook.ads.redexgen.core.HD.this, c8o);
                    }
                };
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.RuntimeException(A02, e);
            } catch (java.lang.IllegalAccessException e2) {
                throw new java.lang.RuntimeException(A02, e2);
            } catch (java.lang.InstantiationException e3) {
                throw new java.lang.RuntimeException(A02, e3);
            } catch (java.lang.NoSuchMethodException e4) {
                throw new java.lang.RuntimeException(A02, e4);
            } catch (java.lang.reflect.InvocationTargetException e5) {
                throw new java.lang.RuntimeException(A02, e5);
            }
        }
        return new com.facebook.ads.redexgen.core.C05579n(new com.facebook.ads.redexgen.core.C03922u().A00(uri).A02(this.A05).A01(this.A07).A05(), this.A06, this.A02, this.A01, this.A03, this.A00, null);
    }
}
