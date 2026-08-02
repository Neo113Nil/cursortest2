package util.h.xy.bv;

import util.h.xy.bv.ri.b;
import util.h.xy.bv.ri.ma;

/* loaded from: classes5.dex */
public class rj extends util.h.xy.bv.mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    private static char[] getHighSpeedVideoSizes;
    private static long getHighSpeedVideoSizesFor;
    private static char getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputFormats;
    private final byte[] getInputFormats;
    private final byte[] getOutputMinFrameDuration;

    static {
        getHighSpeedVideoSizes();
        getOutputFormats = util.h.xy.bv.rj.class.toString();
        int i = Camera2StreamConfigurationMap + 11;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rj(byte[] bArr, byte[] bArr2) {
        super(((java.lang.String) r3[0]).intern());
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((byte) (android.graphics.Color.rgb(0, 0, 0) + 16777333), "\n\u000b,\n\u0012\u0001㙫㙫*\u001c,\b\u001c(\u0007$\u0014\u001d\u0004\u0017%\u0015", 22 - android.view.KeyEvent.getDeadChar(0, 0), objArr);
        this.getOutputMinFrameDuration = (byte[]) bArr.clone();
        this.getInputFormats = (byte[]) bArr2.clone();
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
        char[] charArray = str.toCharArray();
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 85) % 128;
        char[] cArr = charArray;
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            jArr[dVar.f2629] = (cArr[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoSizesFor ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr2 = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            cArr2[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    @Override // util.h.xy.bv.mb
    /* renamed from: ˎ */
    protected java.util.Map<java.lang.String, java.lang.String> mo25690() throws util.h.xy.ck.rc, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.util.Map<java.lang.String, java.lang.String> mo25690 = super.mo25690();
        java.lang.String str = new java.lang.String(util.h.xy.bx.ra.f1063.m25785(this.getOutputMinFrameDuration));
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\uee25⁽犛蓁휇\ue9a7㯵䨪鱱꺂\ue129㍙䖧韍ꘁ\uf8a3૱崦潞ꆌ\uf033ɱ", android.graphics.Color.rgb(0, 0, 0) + 16830029, objArr);
        mo25690.put(((java.lang.String) objArr[0]).intern(), str);
        java.lang.String str2 = new java.lang.String(util.h.xy.bx.ra.f1063.m25785(this.getInputFormats));
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\uee3f㚌彟搄質햀艹̎⯘炖饍븁웏\uef84㑒", android.view.KeyEvent.getDeadChar(0, 0) + 55487, objArr2);
        mo25690.put(((java.lang.String) objArr2[0]).intern(), str2);
        try {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
            java.lang.String[] m26919 = util.h.xy.k.b.m26919();
            if (m26919 != null && m26919.length > 0) {
                arrayList = new java.util.ArrayList(java.util.Arrays.asList(m26919));
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.lang.String str3 : arrayList) {
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 39) % 128;
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails> m26209 = ((util.h.xy.d.md) util.h.xy.d.re.m26254(str3)).m26209();
                if (m26209.isSuccessful()) {
                    java.lang.String scheme = m26209.getResult().getScheme();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\uee04\uda5e蚋狜", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13381, objArr3);
                    if (scheme.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern())) {
                        java.lang.String m26921 = util.h.xy.k.b.m26921(str3, util.h.xy.d.ma.f1142);
                        if (m26921 != null) {
                            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 93) % 128;
                            if (util.h.xy.u.d.m27515(util.h.xy.s.rh.f2413, m26921)) {
                                java.lang.String string = new org.json.JSONObject(m26921).getString(util.h.xy.s.rh.f2413);
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("\uee24ຑ⽏䰸泊趀ꩈ쬡\ueb83ࡋ⤕䧻暣蝒ꐵ쒒", 57527 - android.graphics.Color.blue(0), objArr4);
                                jSONObject.put(((java.lang.String) objArr4[0]).intern(), new java.lang.String(util.h.xy.bx.ra.f1063.m25785(util.h.xy.al.rb.m25017(string))));
                                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                byte mirror = (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 31);
                                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 19) % 128;
                                try {
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(mirror, "\u0004\u0013/$/\u000b$\u0007\u001c-", ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 10, objArr5);
                                    jSONObject2.put(((java.lang.String) objArr5[0]).intern(), str3);
                                    try {
                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap("\uee25ꐉ穡り웅鴪印\ue9ae", 19000 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), objArr6);
                                        jSONObject2.put(((java.lang.String) objArr6[0]).intern(), jSONObject);
                                        jSONArray.put(jSONObject2);
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th2) {
                                    java.lang.Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            }
                        }
                    }
                }
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            }
            if (jSONArray.length() > 0) {
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\uee25영빤隮份⛂Ἒ\uf744꾩螘翝吽౭", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10288, objArr7);
                mo25690.put(((java.lang.String) objArr7[0]).intern(), jSONArray.toString());
            }
            return mo25690;
        } catch (java.lang.Exception e) {
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(e.getMessage(), e);
        }
    }

    @Override // util.h.xy.bv.mb
    /* renamed from: ˏ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> mo25691(util.h.xy.bv.rb rbVar) {
        util.h.xy.bv.ri riVar = new util.h.xy.bv.ri(rbVar.m25751());
        riVar.m25744(rbVar.m25745());
        riVar.m25748(rbVar.m25742());
        riVar.m25743(rbVar.m25749());
        riVar.m25746(rbVar.m25750());
        if (rbVar.m25745() == util.h.xy.bv.rb.ra.f1062) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 11) % 128;
            try {
                java.util.Map<java.lang.String, java.lang.String> m25747 = rbVar.m25747();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 113), "\u0012\u0001㙧㙧*\u001c\u000e\u001c/ \u0005\u0019%\u001c\f\u0001\u0015'㙔", 20 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
                byte[] mo25943 = util.h.xy.ck.ra.f1116.m25945().mo25943(util.h.xy.bx.ra.f1063.m25786(m25747.get(((java.lang.String) objArr[0]).intern())));
                util.h.xy.ar.b.m25074(mo25943);
                java.util.Map<java.lang.String, java.lang.String> m257472 = rbVar.m25747();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\uee25⠠战밇\uf67bべ䩳蒣\udea5ᢋ劍泤ꛓ", android.view.View.combineMeasuredStates(0, 0) + 50707, objArr2);
                byte[] m25787 = util.h.xy.bx.ra.f1063.m25787(mo25943, util.h.xy.bx.ra.f1063.m25786(m257472.get(((java.lang.String) objArr2[0]).intern())));
                util.h.xy.ar.b.m25074(m25787);
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(m25787);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\uee07潻\uecee樈\ueb9e", android.view.View.resolveSize(0, 0) + 33149, objArr3);
                android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.InputStreamReader(byteArrayInputStream, ((java.lang.String) objArr3[0]).intern()));
                try {
                    jsonReader.beginObject();
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 27) % 128;
                    byte[] bArr = null;
                    while (jsonReader.hasNext()) {
                        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 67) % 128;
                        java.lang.String nextName = jsonReader.nextName();
                        android.util.JsonToken peek = jsonReader.peek();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\uee25ᓩᮡẩՆࠦ༪㗎㣮㾒≆⥢Ⱋ匜姩岜", android.widget.ExpandableListView.getPackedPositionChild(0L) + 64218, objArr4);
                        if (((java.lang.String) objArr4[0]).intern().equalsIgnoreCase(nextName) && peek == android.util.JsonToken.STRING) {
                            int i = getHighSpeedVideoFpsRanges + 13;
                            Camera2StreamConfigurationMap = i % 128;
                            if (i % 2 == 0) {
                                riVar.m25767(util.h.xy.bx.ra.f1063.m25789(jsonReader.nextString().getBytes()));
                                throw new java.lang.NullPointerException();
                            }
                            bArr = util.h.xy.bx.ra.f1063.m25789(jsonReader.nextString().getBytes());
                            riVar.m25767(bArr);
                        } else {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("\uee25영빤隮份⛂Ἒ\uf744꾩螘翝吽౭", 10289 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr5);
                            if (((java.lang.String) objArr5[0]).intern().equalsIgnoreCase(nextName)) {
                                riVar.m25766(getHighSpeedVideoFpsRangesFor(riVar, jsonReader));
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (bArr == null) {
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\uee1fい勒畓韯뙵\ud8f7ﭡᶓ㱝庄愮莴ꈸ쒽\ue6ceॖ⯐䩾沧轷퇢\uf048ኍ㔕垹癤颯묤\udd4cￓṞ⃜䍱斲萷ꚾ줓\ueb97ਇⲥ伾醻돃툆\uf4cf\u1759㧤塮竴鴘뾎\ude11\ue09fͦ", android.view.View.MeasureSpec.getSize(0) + 56951, objArr6);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr6[0]).intern());
                    }
                    util.h.xy.ar.b.m25095(bArr);
                } finally {
                    jsonReader.close();
                    byteArrayInputStream.close();
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e = e;
                e.getMessage();
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (67 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), "\u001f\" /\u001d(\u000f\r#+(\u0000\u001e\u001a\u000e\u0019\u000f\r\u0016(\u0010\u000e\u0019\u001c#\u000f\n\u000e+\u0001$*0\u000f+\u000b(\b%\u0015", android.graphics.Color.alpha(0) + 40, objArr7);
                return new util.h.xy.an.ra(riVar, false, ((java.lang.String) objArr7[0]).intern());
            } catch (java.io.IOException e2) {
                e = e2;
                e.getMessage();
                java.lang.Object[] objArr72 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (67 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), "\u001f\" /\u001d(\u000f\r#+(\u0000\u001e\u001a\u000e\u0019\u000f\r\u0016(\u0010\u000e\u0019\u001c#\u000f\n\u000e+\u0001$*0\u000f+\u000b(\b%\u0015", android.graphics.Color.alpha(0) + 40, objArr72);
                return new util.h.xy.an.ra(riVar, false, ((java.lang.String) objArr72[0]).intern());
            } catch (util.h.xy.ck.rc e3) {
                e = e3;
                e.getMessage();
                java.lang.Object[] objArr722 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (67 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), "\u001f\" /\u001d(\u000f\r#+(\u0000\u001e\u001a\u000e\u0019\u000f\r\u0016(\u0010\u000e\u0019\u001c#\u000f\n\u000e+\u0001$*0\u000f+\u000b(\b%\u0015", android.graphics.Color.alpha(0) + 40, objArr722);
                return new util.h.xy.an.ra(riVar, false, ((java.lang.String) objArr722[0]).intern());
            } catch (java.lang.Exception e4) {
                e4.getMessage();
                return new util.h.xy.an.ra(riVar, false, e4.getMessage());
            }
        }
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(riVar, true, null);
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 5) % 128;
        return raVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r0.f2641 == r0.f2636) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        r0.f2639 = r0.f2641 / r2;
        r0.f2640 = r0.f2641 % r2;
        r0.f2637 = r0.f2636 / r2;
        r0.f2635 = r0.f2636 % r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        if (r0.f2640 != r0.f2635) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b7, code lost:
    
        util.h.xy.bv.rj.getHighSpeedVideoFpsRangesFor = (util.h.xy.bv.rj.getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
        r0.f2639 = ((r0.f2639 + r2) - 1) % r2;
        r0.f2637 = ((r0.f2637 + r2) - 1) % r2;
        r7 = r0.f2639;
        r8 = r0.f2640;
        r9 = r0.f2637;
        r10 = r0.f2635;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00eb, code lost:
    
        if (r0.f2639 != r0.f2637) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ed, code lost:
    
        r0.f2640 = ((r0.f2640 + r2) - 1) % r2;
        r0.f2635 = ((r0.f2635 + r2) - 1) % r2;
        r7 = r0.f2639;
        r8 = r0.f2640;
        r9 = r0.f2637;
        r10 = r0.f2635;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0115, code lost:
    
        r7 = r0.f2639;
        r8 = r0.f2635;
        r9 = r0.f2637;
        r10 = r0.f2640;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        r3[r0.f2638] = (char) (r0.f2641 - r12);
        r3[r0.f2638 + 1] = (char) (r0.f2636 - r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        if (r0.f2641 == r0.f2636) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRanges(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getHighSpeedVideoSizes;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 71;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getInputSizeshNQ4ISI);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 85) % 128;
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                int i6 = getHighResolutionOutputSizeshNQ4ISI + 23;
                getHighSpeedVideoFpsRangesFor = i6 % 128;
                if (i6 % 2 != 0) {
                    mcVar.f2641 = charArray[mcVar.f2638];
                    mcVar.f2636 = charArray[mcVar.f2638];
                } else {
                    mcVar.f2641 = charArray[mcVar.f2638];
                    mcVar.f2636 = charArray[mcVar.f2638 + 1];
                }
                mcVar.f2638 += 2;
            }
        }
        int i7 = 0;
        while (i7 < i) {
            int i8 = getHighSpeedVideoFpsRangesFor + 125;
            getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
            if (i8 % 2 == 0) {
                cArr3[i7] = (char) (cArr3[i7] ^ 12767);
                i7 += 30;
            } else {
                cArr3[i7] = (char) (cArr3[i7] ^ 13722);
                i7++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.util.List<util.h.xy.bv.ri.b> getHighSpeedVideoFpsRangesFor(util.h.xy.bv.ri riVar, android.util.JsonReader jsonReader) throws java.io.IOException {
        java.lang.String nextName;
        android.util.JsonToken peek;
        java.lang.Object[] objArr;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            byte[] bArr = null;
            util.h.xy.bv.ri.ma maVar = null;
            while (jsonReader.hasNext()) {
                int i = getHighSpeedVideoFpsRanges + 59;
                Camera2StreamConfigurationMap = i % 128;
                if (i % 2 == 0) {
                    nextName = jsonReader.nextName();
                    peek = jsonReader.peek();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((byte) ('O' - android.text.AndroidCharacter.getMirror('!')), "\u0004\u0013/$/\u000b$\u0007\u001c-", 7 >>> android.view.KeyEvent.normalizeMetaState(0), objArr2);
                    if (((java.lang.String) objArr2[0]).intern().equalsIgnoreCase(nextName)) {
                        if (peek == android.util.JsonToken.STRING) {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("\uee11ີ⽯䱗泚趮ꩳ쬶\ueb84ࠝ⤝䧼曦蝷ꐿ쒟\ue502Ȇ⋸䎵恷脿ꆏ\ude03．ῴ㲴嵺穸髉뭰\ud809\uf8ddᦱ㙳圴瞁鑍땘헅\uf2a3፲〸傎煒渐軟꾥찬", android.view.Gravity.getAbsoluteGravity(0, 0) + 57527, objArr3);
                            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
                        }
                        bArr = jsonReader.nextString().getBytes();
                    } else {
                        objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\uee25ꐉ穡り웅鴪印\ue9ae", 19001 - android.view.View.getDefaultSize(0, 0), objArr);
                        if (!((java.lang.String) objArr[0]).intern().equalsIgnoreCase(nextName)) {
                            maVar = getHighSpeedVideoSizes(riVar, jsonReader);
                        } else {
                            jsonReader.skipValue();
                            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 105) % 128;
                        }
                    }
                } else {
                    nextName = jsonReader.nextName();
                    peek = jsonReader.peek();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((byte) (127 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), "\u0004\u0013/$/\u000b$\u0007\u001c-", 10 - android.view.KeyEvent.normalizeMetaState(0), objArr4);
                    if (((java.lang.String) objArr4[0]).intern().equalsIgnoreCase(nextName)) {
                        if (peek == android.util.JsonToken.STRING) {
                        }
                    } else {
                        objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\uee25ꐉ穡り웅鴪印\ue9ae", 19001 - android.view.View.getDefaultSize(0, 0), objArr);
                        if (!((java.lang.String) objArr[0]).intern().equalsIgnoreCase(nextName)) {
                        }
                    }
                }
            }
            jsonReader.endObject();
            if (bArr != null) {
                java.util.Objects.requireNonNull(riVar);
                arrayList.add(riVar.new b(bArr, maVar));
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 95) % 128;
            } else {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (7 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), "\u0012\u0003\u0007+\u0000\u0019/ \u0016%\u0019\u000b \u0005\u0000$\u001c*\u001d(\f\u0006\u000f.'/\u0007(\n\u001d-#)\u000f\u0001+\u000b+\u0016#\u0013 $*$\u0007\u0017\u000e(+ /\u0019*\u0004/\u0001)\r\u00110\u0004\u0000\u0019\u00120\t\u000f", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 68, objArr5);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr5[0]).intern());
            }
        }
        jsonReader.endArray();
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 57) % 128;
        return arrayList;
    }

    private static util.h.xy.bv.ri.ma getHighSpeedVideoSizes(util.h.xy.bv.ri riVar, android.util.JsonReader jsonReader) throws java.io.IOException {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 61) % 128;
        jsonReader.beginObject();
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        while (jsonReader.hasNext()) {
            java.lang.String nextName = jsonReader.nextName();
            android.util.JsonToken peek = jsonReader.peek();
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\uee24ຑ⽏䰸泊趀ꩈ쬡\ueb83ࡋ⤕䧻暣蝒ꐵ쒒", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 57527, objArr);
            try {
                if (((java.lang.String) objArr[0]).intern().equalsIgnoreCase(nextName)) {
                    int i = Camera2StreamConfigurationMap + 91;
                    getHighSpeedVideoFpsRanges = i % 128;
                    if (i % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    if (peek == android.util.JsonToken.STRING) {
                        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 63) % 128;
                        bArr = util.h.xy.ar.b.m25074(util.h.xy.bx.ra.f1063.m25786(jsonReader.nextString())).getBytes();
                    }
                }
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 12), "\u0007\u0018.\b.\u0017", android.view.KeyEvent.normalizeMetaState(0) + 6, objArr2);
                if (((java.lang.String) objArr2[0]).intern().equalsIgnoreCase(nextName)) {
                    int i2 = getHighSpeedVideoFpsRanges + 37;
                    Camera2StreamConfigurationMap = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    if (peek == android.util.JsonToken.STRING) {
                        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 91) % 128;
                        bArr7 = util.h.xy.bx.ra.f1063.m25786(jsonReader.nextString());
                        util.h.xy.ar.b.m25074(bArr7);
                    }
                }
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\uee24ꁟ狓յퟃ晤㣈쭫鷮", 20089 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr3);
                if (((java.lang.String) objArr3[0]).intern().equalsIgnoreCase(nextName) && peek == android.util.JsonToken.STRING) {
                    bArr8 = util.h.xy.bx.ra.f1063.m25786(jsonReader.nextString());
                    util.h.xy.ar.b.m25074(bArr8);
                } else {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((byte) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 46), "/+\u0005.\"\u0013\u0015'\u0015\u0010", 10 - android.graphics.Color.green(0), objArr4);
                    if (((java.lang.String) objArr4[0]).intern().equalsIgnoreCase(nextName) && peek == android.util.JsonToken.STRING) {
                        bArr2 = jsonReader.nextString().getBytes();
                        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 77) % 128;
                    } else {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\uee3d岋證\uf635ⓔ鎊\ude77ജ篃ꚳᕀ", 45756 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr5);
                        if (((java.lang.String) objArr5[0]).intern().equalsIgnoreCase(nextName) && peek == android.util.JsonToken.STRING) {
                            bArr3 = jsonReader.nextString().getBytes();
                        } else {
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("\uee3d뢭䌅\uedd3둌弼\ue9bb뀊嫳\ue565谭", android.view.View.combineMeasuredStates(0, 0) + 22171, objArr6);
                            if (((java.lang.String) objArr6[0]).intern().equalsIgnoreCase(nextName) && peek == android.util.JsonToken.STRING) {
                                bArr4 = jsonReader.nextString().getBytes();
                            } else {
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((byte) (84 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), "/+\u0005.\"\u0013\u0015'\u001a,", 11 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr7);
                                if (((java.lang.String) objArr7[0]).intern().equalsIgnoreCase(nextName) && peek == android.util.JsonToken.STRING) {
                                    bArr5 = jsonReader.nextString().getBytes();
                                } else {
                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("\uee3dᐗᩱaڤಞ㋟㣐㼣┪", 64032 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr8);
                                    if (((java.lang.String) objArr8[0]).intern().equalsIgnoreCase(nextName) && peek == android.util.JsonToken.STRING) {
                                        bArr6 = jsonReader.nextString().getBytes();
                                    } else {
                                        jsonReader.skipValue();
                                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 47) % 128;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 103) % 128;
        }
        jsonReader.endObject();
        java.util.Objects.requireNonNull(riVar);
        util.h.xy.bv.ri.ma maVar = riVar.new ma(bArr, bArr7, bArr8, bArr2, bArr3, bArr4, bArr5, bArr6);
        util.h.xy.ar.b.m25100(bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8);
        return maVar;
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizes = new char[]{38476, 41905, 41886, 38479, 41917, 41919, 41904, 41871, 41906, 41971, 41898, 41872, 41911, 41972, 41885, 41899, 41970, 41873, 41900, 38465, 41909, 41896, 38469, 41893, 38464, 41879, 41915, 38474, 38468, 38477, 41881, 41877, 41908, 41902, 41867, 41913, 41980, 38471, 41973, 38478, 41864, 38467, 41912, 41903, 41865, 41966, 41907, 41868, 38466};
        getInputSizeshNQ4ISI = (char) 38465;
        getHighSpeedVideoSizesFor = 7574686250398768585L;
    }
}
