package com.startapp.sdk.adsbase.apppresence;

import java.io.Serializable;

/* loaded from: classes.dex */
public class AppPresenceDetails implements Serializable {
    private static final long serialVersionUID = -6732887070965278910L;
    private int adAttempt;
    private int minAppVersion;
    private String packageName;
    private String trackingUrl;
    private boolean isShown = true;
    private boolean appPresence = false;

    public AppPresenceDetails(int i3, int i4, String str, String str2) {
        this.trackingUrl = str;
        this.packageName = str2;
        this.adAttempt = i3;
        this.minAppVersion = i4;
    }

    public final void a(String str) {
        this.trackingUrl = str;
    }

    public final String b() {
        return this.packageName;
    }

    public final String c() {
        return this.trackingUrl;
    }

    public final boolean d() {
        return this.appPresence;
    }

    public final boolean e() {
        return this.isShown;
    }

    public final void a(boolean z3) {
        this.appPresence = z3;
    }

    public final void b(boolean z3) {
        this.isShown = z3;
    }

    public final int a() {
        return this.minAppVersion;
    }
}
