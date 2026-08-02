package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.internal.ads.br, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0817br {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f12915a;

    public C0817br() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) Q2.r.f5053d.f5056c.a(F7.v6));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f12915a = pattern;
    }
}
