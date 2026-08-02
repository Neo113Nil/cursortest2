package C7;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* renamed from: C7.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C2731a {

    /* renamed from: a, reason: collision with root package name */
    private final int f4431a;

    /* renamed from: b, reason: collision with root package name */
    private final PendingIntent f4432b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4433c = false;

    private C2731a(int i11, long j11, long j12, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, HashMap hashMap) {
        this.f4431a = i11;
        this.f4432b = pendingIntent2;
    }

    public static C2731a e(int i11, long j11, long j12, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, HashMap hashMap) {
        return new C2731a(i11, j11, j12, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, hashMap);
    }

    public final boolean a() {
        d.c();
        PendingIntent pendingIntent = this.f4432b;
        if (pendingIntent == null) {
            pendingIntent = null;
        }
        return pendingIntent != null;
    }

    public final boolean b(@NonNull d dVar) {
        PendingIntent pendingIntent = this.f4432b;
        if (pendingIntent == null) {
            pendingIntent = null;
        }
        return pendingIntent != null;
    }

    public final int c() {
        return this.f4431a;
    }

    final PendingIntent d(d dVar) {
        PendingIntent pendingIntent = this.f4432b;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        return null;
    }

    final void f() {
        this.f4433c = true;
    }

    final boolean g() {
        return this.f4433c;
    }
}
