package com.instagram.common.viewpoint.core;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.d7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2709d7 extends WebChromeClient {
    public static byte[] A01;
    public static String[] A02 = {"hD342XNQVEXChvJ41FuJYkzzL30E7V8C", "VFqqxEswv4BXF4BUDT4NnG4IAUyY785", "G3ZSvK9EmqC1e5u7Ivg7hdOkIQzdfa68", "vFWJ81dDNXk", "PGv8G8TosU31EXJAVb0WhvumqcSTUHDE", "JPUBUdUfGKDjW9Qe8mrAO5frWlzvQ1oz", "qcwfoFOZSGXVTY97XWLRaEh5jd9GG5ia", "FIykCHI4yyfel4YrSgGCK0Zn6vKmeZ"};
    public final /* synthetic */ C2714dC A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{SignedBytes.MAX_POWER_OF_TWO, 69, 66, 73, 98, 89, 65, 78, 73, 94, 39, 47, 57, 57, 43, 45, 47, 118, 106, 112, 119, 102, 96, 76, 97};
    }

    static {
        A01();
    }

    public C2709d7(C2714dC c2714dC) {
        this.A00 = c2714dC;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        VI vi;
        C2701cz c2701cz;
        C2930gi c2930gi;
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(10, 7, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), consoleMessage.message());
                jSONObject.put(A00(0, 10, 26), consoleMessage.lineNumber());
                jSONObject.put(A00(17, 8, 51), consoleMessage.sourceId());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            vi = this.A00.A0D;
            vi.A04(VH.A0N, null);
            c2701cz = this.A00.A0E;
            c2701cz.A04(AbstractC2342Td.A14, jSONObject2);
            c2930gi = this.A00.A0B;
            c2930gi.A0F().A69(jSONObject2);
        }
        boolean onConsoleMessage = super.onConsoleMessage(consoleMessage);
        if (A02[5].charAt(17) == '8') {
            throw new RuntimeException();
        }
        A02[3] = "bhT1kVUsfNz";
        return onConsoleMessage;
    }
}
