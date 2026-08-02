package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.m3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1276m3 {

    /* renamed from: a, reason: collision with root package name */
    public long f14465a;

    /* renamed from: b, reason: collision with root package name */
    public long f14466b;

    /* renamed from: c, reason: collision with root package name */
    public long f14467c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14468d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14469e;

    public /* synthetic */ C1276m3(ByteBuffer byteBuffer, long j5, long j6, long j7, ByteBuffer byteBuffer2) {
        this.f14468d = byteBuffer;
        this.f14465a = j5;
        this.f14466b = j6;
        this.f14467c = j7;
        this.f14469e = byteBuffer2;
    }

    public C1276m3(AudioTrack audioTrack) {
        this.f14468d = audioTrack;
        this.f14469e = new AudioTimestamp();
    }
}
