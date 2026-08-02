package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzxj {
    private static final com.google.common.collect.ImmutableSet zza = com.google.common.collect.ImmutableSet.of("applet", "base", "embed", "math", com.adjust.sdk.Constants.REFERRER_API_META, "object", "svg", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.TEMPLATE);
    private static final com.google.common.collect.ImmutableSet zzb = com.google.common.collect.ImmutableSet.of("script");
    private static final com.google.common.collect.ImmutableSet zzc = com.google.common.collect.ImmutableSet.of(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE);
    private static final com.google.common.collect.ImmutableSet zzd = com.google.common.collect.ImmutableSet.of("area", "br", "col", "hr", "img", "input", "link", "param", "source", "track", "wbr");
    private static final com.google.common.collect.ImmutableSet zzh;
    private static final com.google.common.collect.ImmutableSet zzi;
    private final java.lang.String zze;
    private final java.util.Map zzf = new java.util.LinkedHashMap();
    private final java.util.List zzg = new java.util.ArrayList();

    static {
        com.google.common.collect.ImmutableSet.of("input");
        com.google.common.collect.ImmutableSet.of("form");
        com.google.common.collect.ImmutableSet.of("script");
        com.google.common.collect.ImmutableSet.of("button", "input");
        com.google.common.collect.ImmutableSet.of("button", "input");
        zzh = com.google.common.collect.ImmutableSet.of("a", "area");
        zzi = com.google.common.collect.ImmutableSet.of("alternate", "author", "bookmark", "canonical", "cite", "help", "icon", com.miteksystems.misnap.core.MiSnapSettings.KEY_LICENSE, io.ktor.http.LinkHeader.Rel.Next, io.ktor.http.LinkHeader.Rel.Prefetch, io.ktor.http.LinkHeader.Rel.DnsPrefetch, io.ktor.http.LinkHeader.Rel.PreRender, io.ktor.http.LinkHeader.Rel.PreConnect, io.ktor.http.LinkHeader.Rel.PreLoad, "prev", com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.Analytics.FEATURE_SEARCH, "subresource");
        com.google.common.collect.ImmutableSet.of("form");
        com.google.common.collect.ImmutableSet.of("input");
        com.google.common.collect.ImmutableSet.of("input", "textarea");
        com.google.common.collect.ImmutableSet.of("audio", "img", "input", "source", "video");
        com.google.common.collect.ImmutableSet.of("iframe");
    }

    public zzxj(java.lang.String str) {
        if (!"a".matches("[a-z0-9-]+")) {
            throw new java.lang.IllegalArgumentException("Invalid element name \"a\". Only lowercase letters, numbers and '-' allowed.");
        }
        if (zza.contains("a")) {
            throw new java.lang.IllegalArgumentException("Element \"a\" is not supported.");
        }
        this.zze = "a";
    }

    public final com.google.android.libraries.places.internal.zzxj zza(com.google.android.libraries.places.internal.zzxl zzxlVar) {
        java.lang.String str;
        com.google.common.collect.ImmutableSet immutableSet = zzh;
        java.lang.String str2 = this.zze;
        if (!immutableSet.contains(str2) && !str2.equals("link")) {
            throw new java.lang.IllegalArgumentException("Attribute \"href\" with a SafeUrl value can only be used by one of the following elements: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(immutableSet))));
        }
        if (!str2.equals("link") || (str = (java.lang.String) this.zzf.get(io.ktor.http.LinkHeader.Parameters.Rel)) == null || zzi.contains(str.toLowerCase(java.util.Locale.ENGLISH))) {
            this.zzf.put("href", com.google.android.libraries.places.internal.zzaub.zzb(zzxlVar.zza(), 65533));
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 113);
        sb.append("SafeUrl values for the href attribute are not allowed on <link rel=");
        sb.append(str);
        sb.append(">. Did you intend to use a TrustedResourceUrl?");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final com.google.android.libraries.places.internal.zzxj zzb(java.lang.String str) {
        java.util.Iterator it = java.util.Arrays.asList(com.google.android.libraries.places.internal.zzxk.zza(str)).iterator();
        com.google.common.collect.ImmutableSet immutableSet = zzd;
        java.lang.String str2 = this.zze;
        com.google.common.base.Preconditions.checkState(!immutableSet.contains(str2), "Element \"%s\" is a void element and so cannot have content.", str2);
        com.google.common.base.Preconditions.checkState(!zzb.contains(str2), "Element \"%s\" requires SafeScript contents, not SafeHTML or text.", str2);
        com.google.common.base.Preconditions.checkState(!zzc.contains(str2), "Element \"%s\" requires SafeStyleSheet contents, not SafeHTML or text.", str2);
        while (it.hasNext()) {
            this.zzg.add(((com.google.android.libraries.places.internal.zzxi) it.next()).zza());
        }
        return this;
    }

    public final com.google.android.libraries.places.internal.zzxi zzc() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<");
        java.lang.String str = this.zze;
        sb.append(str);
        for (java.util.Map.Entry entry : this.zzf.entrySet()) {
            sb.append(" ");
            sb.append((java.lang.String) entry.getKey());
            sb.append("=\"");
            sb.append(com.google.android.libraries.places.internal.zzxg.zza((java.lang.String) entry.getValue()));
            sb.append("\"");
        }
        boolean contains = zzd.contains(str);
        sb.append(">");
        if (!contains) {
            java.util.Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                sb.append((java.lang.String) it.next());
            }
            sb.append("</");
            sb.append(str);
            sb.append(">");
        }
        return new com.google.android.libraries.places.internal.zzxi(sb.toString());
    }
}
