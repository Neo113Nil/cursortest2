package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0917e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f13229a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f13230b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f13231c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f13232d;

    static {
        Locale locale = Locale.US;
        f13230b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f13231c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f13232d = Pattern.compile("\\\\an(\\d+)");
    }
}
