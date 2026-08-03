package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
public final class m extends com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g {
    public static final java.util.regex.Pattern g = java.util.regex.Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final java.util.regex.Pattern h = java.util.regex.Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final java.util.regex.Pattern i = java.util.regex.Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public m(java.lang.String str, long j, long j2, long j3, java.io.File file) {
        super(str, j, j2, j3, file);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e7, code lost:
    
        if (r17.renameTo(r3) == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m a(java.io.File file, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i iVar) {
        java.io.File file2;
        java.lang.String group;
        java.io.File file3;
        java.lang.String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            java.lang.String name2 = file.getName();
            java.util.regex.Matcher matcher = h.matcher(name2);
            if (matcher.matches()) {
                group = matcher.group(1);
                int i2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
                int length = group.length();
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    if (group.charAt(i5) == '%') {
                        i4++;
                    }
                }
                if (i4 != 0) {
                    int i6 = length - (i4 * 2);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(i6);
                    java.util.regex.Matcher matcher2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.g.matcher(group);
                    while (i4 > 0 && matcher2.find()) {
                        char parseInt = (char) java.lang.Integer.parseInt(matcher2.group(1), 16);
                        sb.append((java.lang.CharSequence) group, i3, matcher2.start());
                        sb.append(parseInt);
                        i3 = matcher2.end();
                        i4--;
                    }
                    if (i3 < length) {
                        sb.append((java.lang.CharSequence) group, i3, length);
                    }
                    group = sb.length() != i6 ? null : sb.toString();
                }
            } else {
                matcher = g.matcher(name2);
                if (matcher.matches()) {
                    group = matcher.group(1);
                    java.io.File parentFile = file.getParentFile();
                    com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h) iVar.f4081a.get(group);
                    if (hVar == null) {
                        hVar = iVar.a(group, -1L);
                    }
                    file3 = new java.io.File(parentFile, hVar.f4080a + "." + java.lang.Long.parseLong(matcher.group(2)) + "." + java.lang.Long.parseLong(matcher.group(3)) + ".v3.exo");
                }
                file3 = null;
            }
            if (file3 == null) {
                return null;
            }
            name = file3.getName();
            file2 = file3;
        }
        java.util.regex.Matcher matcher3 = i.matcher(name);
        if (!matcher3.matches()) {
            return null;
        }
        long length2 = file2.length();
        java.lang.String str = (java.lang.String) iVar.b.get(java.lang.Integer.parseInt(matcher3.group(1)));
        if (str == null) {
            return null;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m(str, java.lang.Long.parseLong(matcher3.group(2)), length2, java.lang.Long.parseLong(matcher3.group(3)), file2);
    }
}
