package com.chartboost.sdk;

import com.chartboost.sdk.impl.dc;
import io.ktor.sse.ServerSentEventKt;

/* loaded from: classes4.dex */
public class Mediation {
    public final String adapterVersion;
    public final String libraryVersion;
    public final String mediationType;

    public Mediation(String str, String str2, String str3) {
        this.mediationType = a(str);
        this.libraryVersion = str2;
        this.adapterVersion = str3;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace(ServerSentEventKt.SPACE, "_");
        return replace.length() > 50 ? replace.substring(0, 50) : replace;
    }

    public dc toMediationBodyFields() {
        if (this.mediationType == null) {
            return null;
        }
        String str = this.libraryVersion;
        if (str == null) {
            str = "";
        }
        String str2 = this.adapterVersion;
        return new dc(a(), str, str2 != null ? str2 : "", this.mediationType);
    }

    public final String a() {
        String str = this.libraryVersion;
        if (str != null && !str.isEmpty()) {
            return this.mediationType + ServerSentEventKt.SPACE + this.libraryVersion;
        }
        return this.mediationType;
    }
}
