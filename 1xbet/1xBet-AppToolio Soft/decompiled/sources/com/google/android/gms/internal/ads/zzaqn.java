package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@zzadh
/* loaded from: classes.dex */
public final class zzaqn extends zzaqh {
    private static final Set<String> zzdbg = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzdbh = new DecimalFormat("#,###");
    private File zzdbi;
    private boolean zzdbj;

    public zzaqn(zzapw zzapwVar) {
        super(zzapwVar);
        File cacheDir = this.mContext.getCacheDir();
        if (cacheDir == null) {
            zzakb.zzdk("Context.getCacheDir() returned null");
            return;
        }
        this.zzdbi = new File(cacheDir, "admobVideoStreams");
        if (!this.zzdbi.isDirectory() && !this.zzdbi.mkdirs()) {
            String valueOf = String.valueOf(this.zzdbi.getAbsolutePath());
            zzakb.zzdk(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.zzdbi = null;
        } else {
            if (this.zzdbi.setReadable(true, false) && this.zzdbi.setExecutable(true, false)) {
                return;
            }
            String valueOf2 = String.valueOf(this.zzdbi.getAbsolutePath());
            zzakb.zzdk(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.zzdbi = null;
        }
    }

    private final File zzc(File file) {
        return new File(this.zzdbi, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void abort() {
        this.zzdbj = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01ef, code lost:
    
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01f1, code lost:
    
        r1 = r5.getResponseCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01fa, code lost:
    
        if (r1 < 400) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01fc, code lost:
    
        r15 = "badUrl";
        r2 = java.lang.String.valueOf(java.lang.Integer.toString(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x020c, code lost:
    
        if (r2.length() == 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x020e, code lost:
    
        r2 = "HTTP request failed. Code: ".concat(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0219, code lost:
    
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 32);
        r4.append("HTTP status code ");
        r4.append(r1);
        r4.append(" at ");
        r4.append(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0241, code lost:
    
        throw new java.io.IOException(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0242, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0214, code lost:
    
        r2 = new java.lang.String("HTTP request failed. Code: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0244, code lost:
    
        r7 = r5.getContentLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0248, code lost:
    
        if (r7 >= 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x024a, code lost:
    
        r1 = java.lang.String.valueOf(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0254, code lost:
    
        if (r1.length() == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0256, code lost:
    
        r0 = "Stream cache aborted, missing content-length header at ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0261, code lost:
    
        com.google.android.gms.internal.ads.zzakb.zzdk(r0);
        zza(r31, r12.getAbsolutePath(), "contentLengthMissing", null);
        com.google.android.gms.internal.ads.zzaqn.zzdbg.remove(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0272, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x025b, code lost:
    
        r0 = new java.lang.String("Stream cache aborted, missing content-length header at ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0273, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzaqn.zzdbh.format(r7);
        r3 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzkb.zzik().zzd(com.google.android.gms.internal.ads.zznk.zzauy)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x028a, code lost:
    
        if (r7 <= r3) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x028c, code lost:
    
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 33) + java.lang.String.valueOf(r31).length());
        r2.append("Content length ");
        r2.append(r1);
        r2.append(" exceeds limit at ");
        r2.append(r31);
        com.google.android.gms.internal.ads.zzakb.zzdk(r2.toString());
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02c5, code lost:
    
        if (r1.length() == 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02c7, code lost:
    
        r0 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02d2, code lost:
    
        zza(r31, r12.getAbsolutePath(), "sizeExceeded", r0);
        com.google.android.gms.internal.ads.zzaqn.zzdbg.remove(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02e0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02cc, code lost:
    
        r0 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02e1, code lost:
    
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 20) + java.lang.String.valueOf(r31).length());
        r4.append("Caching ");
        r4.append(r1);
        r4.append(" bytes from ");
        r4.append(r31);
        com.google.android.gms.internal.ads.zzakb.zzck(r4.toString());
        r5 = java.nio.channels.Channels.newChannel(r5.getInputStream());
        r4 = new java.io.FileOutputStream(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x031c, code lost:
    
        r2 = r4.getChannel();
        r1 = java.nio.ByteBuffer.allocate(1048576);
        r16 = com.google.android.gms.ads.internal.zzbv.zzer();
        r17 = r16.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x033a, code lost:
    
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x033b, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzamj(((java.lang.Long) com.google.android.gms.internal.ads.zzkb.zzik().zzd(com.google.android.gms.internal.ads.zznk.zzavb)).longValue());
        r13 = ((java.lang.Long) com.google.android.gms.internal.ads.zzkb.zzik().zzd(com.google.android.gms.internal.ads.zznk.zzava)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0354, code lost:
    
        r20 = r5.read(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0358, code lost:
    
        if (r20 < 0) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x035a, code lost:
    
        r11 = r11 + r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x035c, code lost:
    
        if (r11 <= r3) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x038d, code lost:
    
        r1.flip();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0394, code lost:
    
        if (r2.write(r1) > 0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0396, code lost:
    
        r1.clear();
        r24 = ((r16.currentTimeMillis() - r17) > (1000 * r13) ? 1 : ((r16.currentTimeMillis() - r17) == (1000 * r13) ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03a5, code lost:
    
        if (r24 > 0) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03a7, code lost:
    
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03ab, code lost:
    
        if (r30.zzdbj != false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03b1, code lost:
    
        if (r6.tryAcquire() == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03b9, code lost:
    
        r22 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03bd, code lost:
    
        r24 = r10;
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03db, code lost:
    
        com.google.android.gms.internal.ads.zzamu.zzsy.post(new com.google.android.gms.internal.ads.zzaqi(r30, r31, r12.getAbsolutePath(), r11, r7, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03fa, code lost:
    
        r6 = r19;
        r1 = r20;
        r5 = r21;
        r15 = r22;
        r10 = r24;
        r2 = r25;
        r3 = r26;
        r4 = r27;
        r7 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04b0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x04b1, code lost:
    
        r15 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x04b3, code lost:
    
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03e2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03e3, code lost:
    
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03e8, code lost:
    
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x041d, code lost:
    
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x041e, code lost:
    
        r27 = r4;
        r24 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0424, code lost:
    
        r15 = "downloadTimeout";
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0426, code lost:
    
        r0 = java.lang.Long.toString(r13);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
        r10 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0451, code lost:
    
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0452, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0453, code lost:
    
        r2 = r10;
        r1 = r24;
        r10 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x045a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0460, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0461, code lost:
    
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x035e, code lost:
    
        r15 = "sizeExceeded";
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x036e, code lost:
    
        if (r1.length() == 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0370, code lost:
    
        r1 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0382, code lost:
    
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0383, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0384, code lost:
    
        r2 = r1;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x038a, code lost:
    
        r10 = r4;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0376, code lost:
    
        r1 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0387, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0388, code lost:
    
        r1 = r10;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0468, code lost:
    
        r27 = r4;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0470, code lost:
    
        r27.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0477, code lost:
    
        if (com.google.android.gms.internal.ads.zzakb.isLoggable(3) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0479, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzaqn.zzdbh.format(r11);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r31).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r31);
        com.google.android.gms.internal.ads.zzakb.zzck(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04b8, code lost:
    
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04bf, code lost:
    
        if (r0.isFile() == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04c1, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04c9, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x04de, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04df, code lost:
    
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04e4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x04e5, code lost:
    
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x04ed, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04e9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04ea, code lost:
    
        r27 = r4;
        r1 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x050a: MOVE (r15 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:275:0x050a */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x054b  */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r24v1, types: [int] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.net.URLConnection] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzdp(String str) {
        int i;
        File file;
        String str2;
        String str3;
        String str4;
        String str5;
        ?? intValue;
        URL url;
        int i2;
        String str6;
        FileOutputStream fileOutputStream;
        String str7;
        String str8;
        boolean delete;
        String str9;
        FileOutputStream fileOutputStream2 = null;
        int i3 = 0;
        if (this.zzdbi == null) {
            str9 = "noCacheDir";
        } else {
            do {
                File file2 = this.zzdbi;
                if (file2 == null) {
                    i = 0;
                } else {
                    i = 0;
                    for (File file3 : file2.listFiles()) {
                        if (!file3.getName().endsWith(".done")) {
                            i++;
                        }
                    }
                }
                if (i <= ((Integer) zzkb.zzik().zzd(zznk.zzaux)).intValue()) {
                    zzkb.zzif();
                    file = new File(this.zzdbi, zzamu.zzde(str));
                    File zzc = zzc(file);
                    if (file.isFile() && zzc.isFile()) {
                        int length = (int) file.length();
                        String valueOf = String.valueOf(str);
                        zzakb.zzck(valueOf.length() != 0 ? "Stream cache hit at ".concat(valueOf) : new String("Stream cache hit at "));
                        zza(str, file.getAbsolutePath(), length);
                        return true;
                    }
                    String valueOf2 = String.valueOf(this.zzdbi.getAbsolutePath());
                    String valueOf3 = String.valueOf(str);
                    String concat = valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
                    synchronized (zzdbg) {
                        if (zzdbg.contains(concat)) {
                            String valueOf4 = String.valueOf(str);
                            zzakb.zzdk(valueOf4.length() != 0 ? "Stream cache already in progress at ".concat(valueOf4) : new String("Stream cache already in progress at "));
                            zza(str, file.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        zzdbg.add(concat);
                        str2 = "error";
                        try {
                            com.google.android.gms.ads.internal.zzbv.zzew();
                            intValue = ((Integer) zzkb.zzik().zzd(zznk.zzavc)).intValue();
                            url = new URL(str);
                            i2 = 0;
                        } catch (IOException | RuntimeException e) {
                            e = e;
                            str3 = concat;
                        }
                        while (true) {
                            i2++;
                            try {
                            } catch (IOException | RuntimeException e2) {
                                e = e2;
                                str2 = str6;
                                str3 = intValue;
                                str4 = null;
                                fileOutputStream2 = null;
                                str5 = str3;
                                if (e instanceof RuntimeException) {
                                }
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException | NullPointerException unused) {
                                }
                                if (this.zzdbj) {
                                }
                                if (file.exists()) {
                                }
                                zza(str, file.getAbsolutePath(), str2, str4);
                                zzdbg.remove(str5);
                                return false;
                            }
                            if (i2 > 20) {
                                throw new IOException("Too many redirects (20)");
                            }
                            ?? openConnection = url.openConnection();
                            openConnection.setConnectTimeout(intValue);
                            openConnection.setReadTimeout(intValue);
                            if (!(openConnection instanceof HttpURLConnection)) {
                                throw new IOException("Invalid protocol.");
                            }
                            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                            zzamy zzamyVar = new zzamy();
                            zzamyVar.zza(httpURLConnection, (byte[]) null);
                            httpURLConnection.setInstanceFollowRedirects(false);
                            int responseCode = httpURLConnection.getResponseCode();
                            zzamyVar.zza(httpURLConnection, responseCode);
                            if (responseCode / 100 != 3) {
                                break;
                            }
                            try {
                                String headerField = httpURLConnection.getHeaderField("Location");
                                if (headerField == null) {
                                    throw new IOException("Missing Location header in redirect");
                                }
                                URL url2 = new URL(url, headerField);
                                String protocol = url2.getProtocol();
                                if (protocol == null) {
                                    throw new IOException("Protocol is null");
                                }
                                if (!protocol.equals("http") && !protocol.equals("https")) {
                                    String valueOf5 = String.valueOf(protocol);
                                    throw new IOException(valueOf5.length() != 0 ? "Unsupported scheme: ".concat(valueOf5) : new String("Unsupported scheme: "));
                                }
                                String valueOf6 = String.valueOf(headerField);
                                zzakb.zzck(valueOf6.length() != 0 ? "Redirecting to ".concat(valueOf6) : new String("Redirecting to "));
                                httpURLConnection.disconnect();
                                url = url2;
                            } catch (IOException | RuntimeException e3) {
                                e = e3;
                                str4 = null;
                            }
                            str5 = concat;
                            if (e instanceof RuntimeException) {
                                com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "VideoStreamFullFileCache.preload");
                            }
                            fileOutputStream2.close();
                            if (this.zzdbj) {
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
                                sb.append("Preload aborted for URL \"");
                                sb.append(str);
                                sb.append("\"");
                                zzakb.zzdj(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25);
                                sb2.append("Preload failed for URL \"");
                                sb2.append(str);
                                sb2.append("\"");
                                zzakb.zzc(sb2.toString(), e);
                            }
                            if (file.exists() && !file.delete()) {
                                String valueOf7 = String.valueOf(file.getAbsolutePath());
                                zzakb.zzdk(valueOf7.length() == 0 ? "Could not delete partial cache file at ".concat(valueOf7) : new String("Could not delete partial cache file at "));
                            }
                            zza(str, file.getAbsolutePath(), str2, str4);
                            zzdbg.remove(str5);
                            return false;
                        }
                    }
                }
                File file4 = this.zzdbi;
                if (file4 != null) {
                    long j = Long.MAX_VALUE;
                    File file5 = null;
                    for (File file6 : file4.listFiles()) {
                        if (!file6.getName().endsWith(".done")) {
                            long lastModified = file6.lastModified();
                            if (lastModified < j) {
                                file5 = file6;
                                j = lastModified;
                            }
                        }
                    }
                    if (file5 != null) {
                        delete = file5.delete();
                        File zzc2 = zzc(file5);
                        if (zzc2.isFile()) {
                            delete &= zzc2.delete();
                        }
                    }
                }
                delete = false;
            } while (delete);
            zzakb.zzdk("Unable to expire stream cache");
            str9 = "expireFailed";
        }
        zza(str, null, str9, null);
        return false;
        zza(str, file.getAbsolutePath(), i3);
        String str10 = str7;
        try {
            zzdbg.remove(str10);
            return true;
        } catch (IOException | RuntimeException e4) {
            e = e4;
            str2 = str8;
            String str11 = str10;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            str5 = str11;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.zzdbj) {
            }
            if (file.exists()) {
            }
            zza(str, file.getAbsolutePath(), str2, str4);
            zzdbg.remove(str5);
            return false;
        }
    }
}
