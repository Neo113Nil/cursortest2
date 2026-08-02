package Ye;

import I0.C3173b;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import sf.C9681g;

/* loaded from: classes6.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final InetAddress a(int i11, int i12, String str) {
        int i13;
        byte[] bArr = new byte[16];
        int i14 = i11;
        int i15 = 0;
        int i16 = -1;
        int i17 = -1;
        while (true) {
            if (i14 >= i12) {
                break;
            }
            if (i15 == 16) {
                return null;
            }
            int i18 = i14 + 2;
            if (i18 <= i12 && h.d0(i14, str, "::", false)) {
                if (i16 != -1) {
                    return null;
                }
                i15 += 2;
                i16 = i15;
                if (i18 == i12) {
                    break;
                }
                i17 = i18;
                int i19 = 0;
                i14 = i17;
                while (i14 < i12) {
                }
                i13 = i14 - i17;
                return i13 == 0 ? null : null;
            }
            if (i15 != 0) {
                if (h.d0(i14, str, ProductContainerDTO.RATIO_DELIMITER, false)) {
                    i14++;
                } else {
                    if (!h.d0(i14, str, ".", false)) {
                        return null;
                    }
                    int i21 = i15 - 2;
                    int i22 = i21;
                    while (i17 < i12) {
                        if (i22 == 16) {
                            return null;
                        }
                        if (i22 != i21) {
                            if (str.charAt(i17) != '.') {
                                return null;
                            }
                            i17++;
                        }
                        int i23 = 0;
                        int i24 = i17;
                        while (i24 < i12) {
                            char charAt = str.charAt(i24);
                            if (Intrinsics.i(charAt, 48) < 0 || Intrinsics.i(charAt, 57) > 0) {
                                break;
                            }
                            if ((i23 == 0 && i17 != i24) || ((i23 * 10) + charAt) - 48 > 255) {
                                return null;
                            }
                            i24++;
                        }
                        if (i24 - i17 == 0) {
                            return null;
                        }
                        bArr[i22] = (byte) i23;
                        i22++;
                        i17 = i24;
                    }
                    if (i22 != i15 + 2) {
                        return null;
                    }
                    i15 += 2;
                }
            }
            i17 = i14;
            int i192 = 0;
            i14 = i17;
            while (i14 < i12) {
                int t2 = b.t(str.charAt(i14));
                if (t2 == -1) {
                    break;
                }
                i192 = (i192 << 4) + t2;
                i14++;
            }
            i13 = i14 - i17;
            if (i13 == 0 && i13 <= 4) {
                int i25 = i15 + 1;
                bArr[i15] = (byte) (255 & (i192 >>> 8));
                i15 += 2;
                bArr[i25] = (byte) (i192 & 255);
            }
        }
        if (i15 != 16) {
            if (i16 == -1) {
                return null;
            }
            int i26 = i15 - i16;
            System.arraycopy(bArr, i16, bArr, 16 - i26, i26);
            Arrays.fill(bArr, i16, (16 - i15) + i16, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final String b(@NotNull String toCanonicalHost) {
        int i11;
        Intrinsics.checkNotNullParameter(toCanonicalHost, "$this$toCanonicalHost");
        int i12 = 0;
        int i13 = -1;
        if (!h.t(toCanonicalHost, ProductContainerDTO.RATIO_DELIMITER, false)) {
            try {
                String ascii = IDN.toASCII(toCanonicalHost);
                Intrinsics.checkNotNullExpressionValue(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                if (ascii == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = ascii.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (0; i11 < length; i11 + 1) {
                    char charAt = lowerCase.charAt(i11);
                    i11 = (Intrinsics.i(charAt, 31) > 0 && Intrinsics.i(charAt, 127) < 0 && h.I(charAt, 0, 6, " #%/:?@[\\]") == -1) ? i11 + 1 : 0;
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress a11 = (h.e0(toCanonicalHost, "[", false) && h.A(toCanonicalHost, "]", false)) ? a(1, toCanonicalHost.length() - 1, toCanonicalHost) : a(0, toCanonicalHost.length(), toCanonicalHost);
        if (a11 == null) {
            return null;
        }
        byte[] address = a11.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return a11.getHostAddress();
            }
            throw new AssertionError(C3173b.a('\'', "Invalid IPv6 address: '", toCanonicalHost));
        }
        Intrinsics.checkNotNullExpressionValue(address, "address");
        int i14 = 0;
        int i15 = 0;
        while (i14 < address.length) {
            int i16 = i14;
            while (i16 < 16 && address[i16] == 0 && address[i16 + 1] == 0) {
                i16 += 2;
            }
            int i17 = i16 - i14;
            if (i17 > i15 && i17 >= 4) {
                i13 = i14;
                i15 = i17;
            }
            i14 = i16 + 2;
        }
        C9681g c9681g = new C9681g();
        while (i12 < address.length) {
            if (i12 == i13) {
                c9681g.d0(58);
                i12 += i15;
                if (i12 == 16) {
                    c9681g.d0(58);
                }
            } else {
                if (i12 > 0) {
                    c9681g.d0(58);
                }
                byte b11 = address[i12];
                byte[] bArr = b.f34900a;
                c9681g.o0(((b11 & 255) << 8) | (address[i12 + 1] & 255));
                i12 += 2;
            }
        }
        return c9681g.G0();
    }
}
