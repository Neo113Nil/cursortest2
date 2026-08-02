package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: com.google.android.gms.internal.ads.ee, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0937ee implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f13317a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0690Td f13318b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13319c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13320d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13321e;
    public float f = 1.0f;

    public C0937ee(Context context, AbstractC0690Td abstractC0690Td) {
        this.f13317a = (AudioManager) context.getSystemService("audio");
        this.f13318b = abstractC0690Td;
    }

    public final void a() {
        boolean z3 = this.f13320d;
        AbstractC0690Td abstractC0690Td = this.f13318b;
        AudioManager audioManager = this.f13317a;
        if (!z3 || this.f13321e || this.f <= 0.0f) {
            if (this.f13319c) {
                if (audioManager != null) {
                    this.f13319c = audioManager.abandonAudioFocus(this) == 0;
                }
                abstractC0690Td.m();
                return;
            }
            return;
        }
        if (this.f13319c) {
            return;
        }
        if (audioManager != null) {
            this.f13319c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        abstractC0690Td.m();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f13319c = i > 0;
        this.f13318b.m();
    }
}
