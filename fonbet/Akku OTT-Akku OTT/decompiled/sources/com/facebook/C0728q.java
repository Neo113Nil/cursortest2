package com.facebook;

import androidx.media3.common.C0337v;
import com.facebook.internal.C0715k;
import java.security.SecureRandom;

/* renamed from: com.facebook.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0728q extends RuntimeException {
    public static final a Companion = new a();
    public static final SecureRandom a = new SecureRandom();
    public static final long serialVersionUID = 1;

    /* renamed from: com.facebook.q$a */
    public static final class a {
    }

    public C0728q() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public C0728q(String str) {
        super(str);
        if (str == null || !w.q.get() || a.nextInt(100) <= 50) {
            return;
        }
        C0715k.a(new C0337v(str, 2), C0715k.b.ErrorReport);
    }
}
