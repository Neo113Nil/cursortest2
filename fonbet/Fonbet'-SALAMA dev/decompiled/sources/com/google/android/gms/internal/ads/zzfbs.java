package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
public final class zzfbs {
    private final Pattern zza;

    public zzfbs() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) C0254t.f2723d.f2726c.zzb(zzbby.zzgM));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.zza = pattern;
    }

    public final String zza(String str) {
        Pattern pattern = this.zza;
        if (pattern == null || str == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}
