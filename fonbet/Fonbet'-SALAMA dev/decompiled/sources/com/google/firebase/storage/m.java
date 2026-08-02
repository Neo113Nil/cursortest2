package com.google.firebase.storage;

import W5.A1;
import android.net.Uri;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import w1.C1726n0;

/* loaded from: classes2.dex */
public final class m implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f12044a;

    /* renamed from: b, reason: collision with root package name */
    public final f f12045b;

    public m(Uri uri, f fVar) {
        D.a("storageUri cannot be null", uri != null);
        D.a("FirebaseApp cannot be null", fVar != null);
        this.f12044a = uri;
        this.f12045b = fVar;
    }

    public final String a() {
        String path = this.f12044a.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
    }

    public final C1726n0 b() {
        return new C1726n0(this.f12044a, this.f12045b.f12019h);
    }

    public final Task c(String str, Integer num) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Y4.D.f7694f.execute(new A1(this, num, str, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12044a.compareTo(((m) obj).f12044a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return ((m) obj).toString().equals(toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("gs://");
        Uri uri = this.f12044a;
        sb.append(uri.getAuthority());
        sb.append(uri.getEncodedPath());
        return sb.toString();
    }
}
