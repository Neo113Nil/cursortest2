package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

/* loaded from: classes3.dex */
public final class m {
    public static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f3951a = -1;
    public int b = -1;

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        int i = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o[] oVarArr = bVar.f4040a;
            if (i >= oVarArr.length) {
                return;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar = oVarArr[i];
            if (oVar instanceof com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j) {
                com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j jVar = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j) oVar;
                java.lang.String str = jVar.c;
                java.lang.String str2 = jVar.d;
                if ("iTunSMPB".equals(str)) {
                    java.util.regex.Matcher matcher = c.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int parseInt = java.lang.Integer.parseInt(matcher.group(1), 16);
                            int parseInt2 = java.lang.Integer.parseInt(matcher.group(2), 16);
                            if (parseInt > 0 || parseInt2 > 0) {
                                this.f3951a = parseInt;
                                this.b = parseInt2;
                                return;
                            }
                        } catch (java.lang.NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
    }
}
