package com.iab.omid.library.unity3d.devicevolume;

/* loaded from: classes5.dex */
public final class d extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final android.content.Context f4498a;
    private final android.media.AudioManager b;
    private final com.iab.omid.library.unity3d.devicevolume.a c;
    private final com.iab.omid.library.unity3d.devicevolume.c d;
    private float e;

    public d(android.os.Handler handler, android.content.Context context, com.iab.omid.library.unity3d.devicevolume.a aVar, com.iab.omid.library.unity3d.devicevolume.c cVar) {
        super(handler);
        this.f4498a = context;
        this.b = (android.media.AudioManager) context.getSystemService("audio");
        this.c = aVar;
        this.d = cVar;
    }

    private float a() {
        return this.c.a(this.b.getStreamVolume(3), this.b.getStreamMaxVolume(3));
    }

    private boolean a(float f) {
        return f != this.e;
    }

    private void b() {
        this.d.a(this.e);
    }

    public void c() {
        this.e = a();
        b();
        this.f4498a.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f4498a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float a2 = a();
        if (a(a2)) {
            this.e = a2;
            b();
        }
    }
}
