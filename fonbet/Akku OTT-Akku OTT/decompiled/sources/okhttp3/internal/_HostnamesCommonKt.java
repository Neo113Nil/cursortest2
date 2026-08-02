package okhttp3.internal;

import androidx.collection.g;
import androidx.compose.runtime.t;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.idn.IdnaMappingTableInstanceKt;
import okhttp3.internal.idn.Punycode;
import okio.C1187b;
import okio.C1190e;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\"\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a0\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0000\u001a\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\bH\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0000\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u0004*\u00020\u0004H\u0000\u001a\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"VERIFY_AS_IP_ADDRESS", "Lkotlin/text/Regex;", "canParseAsIpAddress", "", "", "containsInvalidLabelLengths", "containsInvalidHostnameAsciiCodes", "decodeIpv6", "", "input", "pos", "", "limit", "decodeIpv4Suffix", "address", "addressOffset", "inet6AddressToAscii", "canonicalizeInetAddress", "isMappedIpv4Address", "inet4AddressToAscii", "toCanonicalHost", "idnToAscii", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class _HostnamesCommonKt {
    private static final Regex VERIFY_AS_IP_ADDRESS = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean canParseAsIpAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.matches(str);
    }

    public static final byte[] canonicalizeInetAddress(byte[] address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return isMappedIpv4Address(address) ? ArraysKt.sliceArray(address, RangesKt.until(12, 16)) : address;
    }

    public static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int indexOf$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Intrinsics.compare((int) charAt, 31) <= 0 || Intrinsics.compare((int) charAt, 127) >= 0) {
                return true;
            }
            indexOf$default = StringsKt__StringsKt.indexOf$default(" #%/:?@[\\]", charAt, 0, false, 6, (Object) null);
            if (indexOf$default != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean containsInvalidLabelLengths(String str) {
        int indexOf$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        if (1 <= length && length < 254) {
            int i = 0;
            while (true) {
                indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '.', i, false, 4, (Object) null);
                int length2 = indexOf$default == -1 ? str.length() - i : indexOf$default - i;
                if (1 > length2 || length2 >= 64) {
                    break;
                }
                if (indexOf$default == -1 || indexOf$default == str.length() - 1) {
                    break;
                }
                i = indexOf$default + 1;
            }
            return false;
        }
        return true;
    }

    public static final boolean decodeIpv4Suffix(String input, int i, int i2, byte[] address, int i3) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(address, "address");
        int i4 = i3;
        while (i < i2) {
            if (i4 == address.length) {
                return false;
            }
            if (i4 != i3) {
                if (input.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = input.charAt(i5);
                if (Intrinsics.compare((int) charAt, 48) < 0 || Intrinsics.compare((int) charAt, 57) > 0) {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            address[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte[] decodeIpv6(String input, int i, int i2) {
        boolean startsWith$default;
        boolean startsWith$default2;
        int i3;
        boolean startsWith$default3;
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bArr = new byte[16];
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            if (i >= i2) {
                break;
            }
            if (i4 == 16) {
                return null;
            }
            int i7 = i + 2;
            if (i7 <= i2) {
                startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(input, "::", i, false, 4, null);
                if (startsWith$default3) {
                    if (i5 != -1) {
                        return null;
                    }
                    i4 += 2;
                    i5 = i4;
                    if (i7 == i2) {
                        break;
                    }
                    i6 = i7;
                    int i8 = 0;
                    i = i6;
                    while (i < i2) {
                        int parseHexDigit = _UtilCommonKt.parseHexDigit(input.charAt(i));
                        if (parseHexDigit == -1) {
                            break;
                        }
                        i8 = (i8 << 4) + parseHexDigit;
                        i++;
                    }
                    i3 = i - i6;
                    if (i3 == 0 && i3 <= 4) {
                        int i9 = i4 + 1;
                        bArr[i4] = (byte) ((i8 >>> 8) & 255);
                        i4 += 2;
                        bArr[i9] = (byte) (i8 & 255);
                    }
                }
            }
            if (i4 != 0) {
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(input, ":", i, false, 4, null);
                if (startsWith$default) {
                    i++;
                } else {
                    startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(input, ".", i, false, 4, null);
                    if (!startsWith$default2 || !decodeIpv4Suffix(input, i6, i2, bArr, i4 - 2)) {
                        return null;
                    }
                    i4 += 2;
                }
            }
            i6 = i;
            int i82 = 0;
            i = i6;
            while (i < i2) {
            }
            i3 = i - i6;
            return i3 == 0 ? null : null;
        }
        if (i4 != 16) {
            if (i5 == -1) {
                return null;
            }
            ArraysKt.copyInto(bArr, bArr, 16 - (i4 - i5), i5, i4);
            ArraysKt.fill(bArr, (byte) 0, i5, (16 - i4) + i5);
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:2:0x0012->B:22:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String idnToAscii(String host) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(host, "host");
        C1190e c1190e = new C1190e();
        c1190e.k0(host);
        C1190e c1190e2 = new C1190e();
        while (!c1190e.E()) {
            if (c1190e.b == 0) {
                throw new EOFException();
            }
            byte t = c1190e.t(0L);
            int i4 = 1;
            int i5 = 65533;
            if ((t & ByteCompanionObject.MIN_VALUE) == 0) {
                i = t & ByteCompanionObject.MAX_VALUE;
                i3 = 0;
                i2 = 1;
            } else if ((t & 224) == 192) {
                i = t & 31;
                i2 = 2;
                i3 = 128;
            } else if ((t & 240) == 224) {
                i = t & 15;
                i2 = 3;
                i3 = 2048;
            } else if ((t & 248) == 240) {
                i = t & 7;
                i2 = 4;
                i3 = 65536;
            } else {
                c1190e.skip(1L);
                if (IdnaMappingTableInstanceKt.getIDNA_MAPPING_TABLE().map(i5, c1190e2)) {
                    return null;
                }
            }
            long j = i2;
            if (c1190e.b < j) {
                StringBuilder c = g.c(i2, "size < ", ": ");
                c.append(c1190e.b);
                c.append(" (to read code point prefixed 0x");
                c.append(C1187b.e(t));
                c.append(')');
                throw new EOFException(c.toString());
            }
            while (true) {
                if (i4 < i2) {
                    long j2 = i4;
                    byte t2 = c1190e.t(j2);
                    if ((t2 & 192) != 128) {
                        c1190e.skip(j2);
                        break;
                    }
                    i = (i << 6) | (t2 & 63);
                    i4++;
                } else {
                    c1190e.skip(j);
                    if (i <= 1114111 && ((55296 > i || i >= 57344) && i >= i3)) {
                        i5 = i;
                    }
                }
            }
            if (IdnaMappingTableInstanceKt.getIDNA_MAPPING_TABLE().map(i5, c1190e2)) {
            }
        }
        c1190e.k0(_NormalizeJvmKt.normalizeNfc(c1190e2.Y()));
        Punycode punycode = Punycode.INSTANCE;
        String decode = punycode.decode(c1190e.Y());
        if (decode != null && Intrinsics.areEqual(decode, _NormalizeJvmKt.normalizeNfc(decode))) {
            return punycode.encode(decode);
        }
        return null;
    }

    public static final String inet4AddressToAscii(byte[] address) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (address.length != 4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C1190e c1190e = new C1190e();
        c1190e.d0(_UtilCommonKt.and(address[0], 255));
        c1190e.c0(46);
        c1190e.d0(_UtilCommonKt.and(address[1], 255));
        c1190e.c0(46);
        c1190e.d0(_UtilCommonKt.and(address[2], 255));
        c1190e.c0(46);
        c1190e.d0(_UtilCommonKt.and(address[3], 255));
        return c1190e.Y();
    }

    public static final String inet6AddressToAscii(byte[] address) {
        Intrinsics.checkNotNullParameter(address, "address");
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < address.length) {
            int i5 = i3;
            while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C1190e c1190e = new C1190e();
        while (i2 < address.length) {
            if (i2 == i) {
                c1190e.c0(58);
                i2 += i4;
                if (i2 == 16) {
                    c1190e.c0(58);
                }
            } else {
                if (i2 > 0) {
                    c1190e.c0(58);
                }
                c1190e.e0((_UtilCommonKt.and(address[i2], 255) << 8) | _UtilCommonKt.and(address[i2 + 1], 255));
                i2 += 2;
            }
        }
        return c1190e.Y();
    }

    private static final boolean isMappedIpv4Address(byte[] bArr) {
        if (bArr.length != 16) {
            return false;
        }
        for (int i = 0; i < 10; i++) {
            if (bArr[i] != 0) {
                return false;
            }
        }
        return bArr[10] == -1 && bArr[11] == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String toCanonicalHost(String str) {
        boolean contains$default;
        boolean startsWith$default;
        byte[] decodeIpv6;
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        contains$default = StringsKt__StringsKt.contains$default(str, ":", false, 2, (Object) null);
        if (contains$default) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "[", false, 2, null);
            if (startsWith$default) {
                endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str, "]", false, 2, null);
                if (endsWith$default) {
                    decodeIpv6 = decodeIpv6(str, 1, str.length() - 1);
                    if (decodeIpv6 != null) {
                        byte[] canonicalizeInetAddress = canonicalizeInetAddress(decodeIpv6);
                        if (canonicalizeInetAddress.length == 16) {
                            return inet6AddressToAscii(canonicalizeInetAddress);
                        }
                        if (canonicalizeInetAddress.length == 4) {
                            return inet4AddressToAscii(canonicalizeInetAddress);
                        }
                        throw new AssertionError(t.c("Invalid IPv6 address: '", '\'', str));
                    }
                }
            }
            decodeIpv6 = decodeIpv6(str, 0, str.length());
            if (decodeIpv6 != null) {
            }
        } else {
            String idnToAscii = idnToAscii(str);
            if (idnToAscii != null && idnToAscii.length() != 0 && !containsInvalidHostnameAsciiCodes(idnToAscii) && !containsInvalidLabelLengths(idnToAscii)) {
                return idnToAscii;
            }
        }
        return null;
    }
}
