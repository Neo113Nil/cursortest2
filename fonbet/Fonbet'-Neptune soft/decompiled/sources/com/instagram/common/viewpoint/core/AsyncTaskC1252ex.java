package com.instagram.common.viewpoint.core;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.base.Ascii;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC1252ex extends AsyncTask<String, Void, C1253ey> {
    public static byte[] A05;
    public static String[] A06 = {"naFNcZuGe", "C9JAYYW4", "8H9N3VrVfLlJ9IUdYMoO", "YylQBw7bkupjVtNcwFivzoGwGcTau", "utPcy8I9vNMcCezdgtn", "ehhspVm5", "7sb5kaLRz1R8p", "m"};
    public static final String A07;
    public static final Set<String> A08;
    public SQ A00;
    public InterfaceC1231ec A01;
    public InterfaceC1251ew A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C1253ey A00(String... strArr) {
        if (AbstractC0832Vl.A02(this)) {
            return null;
        }
        String[] strArr2 = A06;
        if (strArr2[4].length() == strArr2[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A06;
        strArr3[3] = "OBWBCzNqNMhSgl0vUrcBODbII9DBW";
        strArr3[2] = "nuEeWi2rsMih0JuNdplL";
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String A02 = A02(str);
                if (this.A03 != null && !this.A03.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        A02 = A03(A02, entry.getKey(), entry.getValue());
                    }
                }
                int i = 1;
                while (true) {
                    int i2 = i + 1;
                    if (i > 2) {
                        return null;
                    }
                    if (A06(A02)) {
                        return new C1253ey(this.A01);
                    }
                    i = i2;
                }
            }
            return null;
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
            return null;
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{75, 62, 43, 105, 56, Ascii.SI, Ascii.SI, Ascii.DC2, Ascii.SI, 93, Ascii.DC2, Ascii.CR, Ascii.CAN, 19, Ascii.DC4, 19, Ascii.SUB, 93, 8, Ascii.SI, 17, 71, 93, Ascii.SI, 0, Ascii.SI, 2, 1, 9, 54, 45, 52, 52};
    }

    static {
        A04();
        A07 = AsyncTaskC1252ex.class.getSimpleName();
        A08 = new HashSet();
        A08.add(A01(0, 1, 15));
        A08.add(A01(29, 4, 63));
    }

    public AsyncTaskC1252ex(SQ sq) {
        this(sq, null, null);
    }

    public AsyncTaskC1252ex(SQ sq, Map<String, String> extraData) {
        this(sq, extraData, null);
    }

    public AsyncTaskC1252ex(SQ sq, Map<String, String> extraData, Map<String, String> postData) {
        this.A00 = sq;
        this.A03 = extraData != null ? new HashMap(extraData) : null;
        this.A04 = postData != null ? new HashMap(postData) : null;
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 9), AbstractC0862Wr.A01(this.A00.A04().A6o()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String A01 = A01(3, 1, 49);
        if (str.contains(A01)) {
            A01 = A01(1, 1, 127);
        }
        StringBuilder append = new StringBuilder().append(str).append(A01).append(str2);
        String prepend = A01(2, 1, 113);
        StringBuilder append2 = append.append(prepend);
        String prepend2 = URLEncoder.encode(str3);
        return append2.append(prepend2).toString();
    }

    private final void A05(C1253ey response) {
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.AGS(response);
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }

    private boolean A06(String str) {
        InterfaceC1231ec AGC;
        InterfaceC1232ed A00 = C1250ev.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                AGC = A00.AGC(str, new C1246er());
            } else {
                C1246er params = new C1246er();
                params.A05(this.A04);
                AGC = A00.AGD(str, params.A08());
            }
            this.A01 = AGC;
        } catch (Exception e) {
            Log.e(A07, A01(4, 19, 26) + str, e);
        }
        return this.A01 != null && this.A01.A94() == 200;
    }

    public final void A07(InterfaceC1251ew interfaceC1251ew) {
        this.A02 = interfaceC1251ew;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ C1253ey doInBackground(String[] strArr) {
        if (AbstractC0832Vl.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        if (this.A02 != null) {
            this.A02.AGQ();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(C1253ey c1253ey) {
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            A05(c1253ey);
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
