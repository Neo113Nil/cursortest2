package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* loaded from: classes.dex */
public final class Xt {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f12252a;

    /* renamed from: b, reason: collision with root package name */
    public String f12253b;

    /* renamed from: c, reason: collision with root package name */
    public int f12254c;

    /* renamed from: d, reason: collision with root package name */
    public float f12255d;

    /* renamed from: e, reason: collision with root package name */
    public int f12256e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public byte f12257g;

    public final Yt a() {
        IBinder iBinder;
        if (this.f12257g == 31 && (iBinder = this.f12252a) != null) {
            return new Yt(iBinder, this.f12253b, this.f12254c, this.f12255d, this.f12256e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f12252a == null) {
            sb.append(" windowToken");
        }
        if ((this.f12257g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f12257g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f12257g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f12257g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.f12257g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
