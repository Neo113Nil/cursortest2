package zb;

/* loaded from: classes18.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f7092a = {org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 80, 65, 89, 46, 83, 89, 83, 46, 68, 68, 70, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE};
    public static final byte[] b = {0, -92, 4, 0};
    public static final byte[] c = {0, -92, 4, 2};
    public final common.emv.cardio.CardIO d;
    public common.emv.configuration.ConfigurationTemplate g;
    public common.emv.cardio.CardSession h;
    public byte[] i;
    public boolean j = false;
    public boolean k = false;
    public boolean l = true;
    public boolean m = false;
    public common.emv.kernel.TransactionData.TransactionType n = common.emv.kernel.TransactionData.TransactionType.Purchase;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7093o = false;
    public common.emv.kernel.TransactionOutcome.ErrorIndication p = common.emv.kernel.TransactionOutcome.ErrorIndication.NA;
    public final java.util.List<common.emv.kernel.KernelProvider> e = new java.util.ArrayList();
    public final java.util.concurrent.ExecutorService f = java.util.concurrent.Executors.newFixedThreadPool(1);

    public static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0155, code lost:
    
        if (r11.length < 5) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0158, code lost:
    
        if (r11.length <= 16) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015c, code lost:
    
        r10 = zb.g.u;
        r11 = r9.get(r10.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0168, code lost:
    
        if (r11 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016b, code lost:
    
        if (r11.length == 1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016d, code lost:
    
        r11 = r11.length;
        r9.remove(r10.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0175, code lost:
    
        r4.add(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0231 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<zb.c> a(java.nio.ByteBuffer byteBuffer, byte[] bArr, java.util.List<zb.e> list, common.emv.kernel.TransactionData.TransactionType transactionType) {
        zb.c cVar;
        java.util.Iterator it;
        char c2;
        boolean z;
        int i;
        byte b2;
        common.emv.kernel.TransactionData.TransactionType transactionType2 = transactionType;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.Map<common.emv.util.Tag, byte[]> createMap = common.emv.util.BerTlv.createMap(byteBuffer, this.k);
            byte[] bArr2 = createMap.get(zb.g.n.a());
            if ((bArr2 == null || createMap.size() != 1 || bArr2.length == 0) && !this.k) {
                throw new java.lang.IllegalArgumentException();
            }
            java.util.Map<common.emv.util.Tag, byte[]> createMap2 = bArr2 == null ? common.emv.util.BerTlv.createMap(createMap.entrySet().iterator().next().getValue(), this.k) : common.emv.util.BerTlv.createMap(bArr2, this.k);
            if (this.f7093o && (createMap2.get(zb.g.f7096o.a()) == null || bArr2 == null)) {
                throw new java.lang.IllegalArgumentException();
            }
            java.util.Arrays.equals(createMap2.getOrDefault(zb.g.f7096o.a(), bArr), bArr);
            byte[] bArr3 = createMap2.get(zb.g.p.a());
            if (bArr3 == null || bArr3.length == 0) {
                throw new java.lang.IllegalArgumentException();
            }
            java.util.Map<common.emv.util.Tag, byte[]> createMap3 = common.emv.util.BerTlv.createMap(bArr3, this.k);
            if (createMap3.size() > 1) {
                createMap3.get(zb.g.H.a());
            }
            byte[] bArr4 = createMap3.get(zb.g.q.a());
            if (bArr4 == null || bArr4.length == 0) {
                throw new java.lang.IllegalArgumentException();
            }
            java.util.List<common.emv.util.BerTlv> createList = common.emv.util.BerTlv.createList(bArr4, this.k);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            boolean z2 = false;
            byte[] bArr5 = new byte[0];
            boolean z3 = false;
            for (common.emv.util.BerTlv berTlv : createList) {
                int intValue = berTlv.getTag().toIntValue();
                zb.g gVar = zb.g.Q;
                z3 = z3;
                if (intValue == gVar.d0) {
                    bArr5 = common.emv.util.BerTlv.createMap(berTlv.getValue()).get(gVar.a());
                    z3 = true;
                }
                if (berTlv.getTag().toIntValue() == zb.g.r.d0) {
                    if (this.k && (berTlv.getValue() == null || berTlv.getValue().length == 0)) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    if (berTlv.getValue() == null) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    if (berTlv.getValue().length != 0) {
                        java.util.Map<common.emv.util.Tag, byte[]> createMap4 = common.emv.util.BerTlv.createMap(berTlv.getValue(), this.k);
                        byte[] bArr6 = createMap4.get(zb.g.s.a());
                        if (createMap4.isEmpty() && !this.k) {
                            throw new java.lang.IllegalArgumentException();
                        }
                    }
                }
            }
            java.util.Iterator it2 = arrayList2.iterator();
            boolean z4 = false;
            zb.e eVar = null;
            while (it2.hasNext()) {
                java.util.Map map = (java.util.Map) it2.next();
                byte[] bArr7 = (byte[]) map.get(zb.g.s.a());
                byte[] bArr8 = (byte[]) map.get(zb.g.v.a());
                java.util.Iterator<zb.e> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        it = it2;
                        break;
                    }
                    zb.e next = it3.next();
                    byte[] decode = common.emv.util.HexUtil.decode(next.b);
                    if (next.c.isTransactionTypeSupported(transactionType2)) {
                        java.lang.String str = next.c.getConfiguration(transactionType2).get(zb.g.I.b0);
                        if (str != null && str.equalsIgnoreCase(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX)) {
                            this.l = z2;
                        }
                        boolean equals = decode.length == bArr7.length ? java.util.Arrays.equals(decode, bArr7) : (!this.l || bArr7.length <= decode.length) ? z2 ? 1 : 0 : java.util.Arrays.equals(decode, java.util.Arrays.copyOf(bArr7, decode.length));
                        if (bArr8 == null || bArr8.length <= 0 || (bArr8[z2 ? 1 : 0] & 63) == 0) {
                            it = it2;
                        } else {
                            it = it2;
                            if (!next.f7091a.equals(common.emv.util.HexUtil.encodeToString(new byte[]{(byte) (bArr8[z2 ? 1 : 0] & 63)}))) {
                                z4 = false;
                                if (z4) {
                                    transactionType2 = transactionType;
                                    it2 = it;
                                    z2 = false;
                                } else {
                                    if (common.emv.util.HexUtil.encodeToString(decode).startsWith("A000000333") && (next.e[0] & 1) == 1 && z3 && bArr5 != null && a(bArr5[0], 64)) {
                                        byte[] bArr9 = next.e;
                                        byte b3 = (byte) (bArr9[0] & com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                                        bArr9[0] = b3;
                                        byte b4 = (byte) (b3 | 32);
                                        bArr9[0] = b4;
                                        bArr9[0] = (byte) (b4 | 1);
                                        bArr9[1] = (byte) (bArr9[1] | 128);
                                    }
                                    eVar = next;
                                }
                            }
                        }
                        z4 = equals;
                        if (z4) {
                        }
                    }
                }
                if (z4) {
                    byte[] bArr10 = (byte[]) map.get(zb.g.v.a());
                    c2 = 16;
                    int parseInt = java.lang.Integer.parseInt(eVar.f7091a, 16);
                    if (bArr10 == null || bArr10.length == 0 || (b2 = bArr10[0]) == 0) {
                        z = true;
                        i = parseInt;
                    } else {
                        int i2 = b2 & 63;
                        if (this.f7093o && i2 == 0) {
                            i2 = parseInt;
                        }
                        z = true;
                        if (((b2 & com.visa.cbp.getEncExpo.startTransaction) >> 6) <= 1) {
                            i = i2;
                        } else if (bArr10.length >= 3 && i2 != 0) {
                            int i3 = bArr10[1] & 255;
                            i = i3 | (i2 << 16) | (i3 << 8);
                        }
                    }
                    if (i == 0 || i == parseInt) {
                        arrayList.add(new zb.c(eVar, bArr7, i, (byte[]) map.get(zb.g.u.a()), (byte[]) map.get(zb.g.w.a())));
                    }
                } else {
                    c2 = 16;
                    z = true;
                }
                transactionType2 = transactionType;
                it2 = it;
                z2 = false;
            }
            if (this.j && this.i != null) {
                java.util.Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        cVar = null;
                        break;
                    }
                    zb.c cVar2 = (zb.c) it4.next();
                    byte[] bArr11 = this.i;
                    byte[] decode2 = common.emv.util.HexUtil.decode(cVar2.f7089a.b);
                    if (bArr11 != null && bArr11.length != 0 && decode2 != null && decode2.length != 0 && bArr11.length <= decode2.length) {
                        if (common.emv.util.HexUtil.memcmp(bArr11, 0, decode2, 0, bArr11.length)) {
                            cVar = cVar2;
                            break;
                        }
                    }
                }
                if (cVar != null) {
                    arrayList.clear();
                    arrayList.add(cVar);
                }
            }
            return arrayList;
        } catch (java.lang.Exception unused) {
            arrayList.clear();
            this.p.setL2(common.emv.kernel.TransactionOutcome.ErrorIndication_L2.L2_PARSING_ERROR);
            this.p.setMessage(common.emv.kernel.TransactionOutcome.StandardMessage.ErrorOtherCard);
            return arrayList;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r5 != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        r16 = r3;
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012a, code lost:
    
        if (new java.lang.String(r12, java.nio.charset.StandardCharsets.US_ASCII).matches("[a-zA-Z\\d ]+") == false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[ADDED_TO_REGION, EDGE_INSN: B:38:0x008e->B:27:0x008e BREAK  A[LOOP:1: B:12:0x004f->B:67:0x0205], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0205 A[LOOP:1: B:12:0x004f->B:67:0x0205, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List a(java.lang.String str, common.emv.kernel.TransactionRequest transactionRequest, common.emv.cardio.CardSession cardSession, java.util.List list) {
        java.lang.String[] strArr;
        int i;
        boolean z;
        boolean z2;
        common.emv.cardio.CardSession cardSession2 = cardSession;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.lang.String[] split = str.split(",");
            int length = split.length;
            int i2 = 0;
            loop0: while (i2 < length) {
                java.lang.String str2 = split[i2];
                byte[] decode = common.emv.util.HexUtil.decode(str2.trim());
                byte[] send = cardSession2.send(c(decode));
                int e = e(send);
                int i3 = 36864;
                if (e != 25219) {
                    if (e == 27265) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    if (e != 36864) {
                        throw new java.lang.IllegalArgumentException();
                    }
                } else if (str2.startsWith("A000000025")) {
                    throw new java.lang.IllegalArgumentException();
                }
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    if (this.l && z4) {
                        send = cardSession2.send(d(decode));
                        e = e(send);
                        int i4 = 65280 & e;
                        if (i4 == 25088 || i4 == 25344 || i4 == i3) {
                            java.lang.Integer.valueOf(e);
                            if (!str2.startsWith("A000000025") || e == i3) {
                                z2 = false;
                                if (!z3 || z2) {
                                    break;
                                }
                            }
                            z2 = true;
                            if (!z3) {
                                break;
                            }
                            break;
                        }
                        java.lang.Integer.valueOf(e);
                        if (str2.startsWith("A000000025")) {
                            z2 = true;
                            if (!z3) {
                            }
                        } else {
                            z2 = false;
                            z3 = true;
                            if (!z3) {
                            }
                        }
                    }
                    java.util.Map<common.emv.util.Tag, byte[]> createMap = common.emv.util.BerTlv.createMap(g(send));
                    byte[] bArr = createMap.get(zb.g.n.a());
                    if (createMap.size() == 1 && ((byte[]) java.util.Objects.requireNonNull(bArr)).length != 0) {
                        java.util.Map<common.emv.util.Tag, byte[]> createMap2 = common.emv.util.BerTlv.createMap(bArr);
                        byte[] orDefault = createMap2.getOrDefault(zb.g.f7096o.a(), decode);
                        if (str2.startsWith("A000000025") && orDefault == null) {
                            break loop0;
                        }
                        if (orDefault != null) {
                            java.util.Arrays.equals(orDefault, decode);
                        }
                        byte[] bArr2 = createMap2.get(zb.g.p.a());
                        if (bArr2 != null && bArr2.length != 0) {
                            java.util.Map<common.emv.util.Tag, byte[]> createMap3 = common.emv.util.BerTlv.createMap(bArr2);
                            createMap3.size();
                            if (str2.startsWith("A000000025")) {
                                if (createMap3.get(zb.g.x.a()) == null) {
                                    strArr = split;
                                } else {
                                    byte[] bArr3 = createMap3.get(zb.g.t.a());
                                    if (bArr3 != null && bArr3.length > 0) {
                                        strArr = split;
                                    }
                                }
                                i = length;
                                z4 = true;
                                if (!z3) {
                                    break;
                                }
                                cardSession2 = cardSession;
                                split = strArr;
                                length = i;
                                i3 = 36864;
                            }
                            strArr = split;
                            java.util.Iterator it = list.iterator();
                            boolean z5 = false;
                            while (true) {
                                if (!it.hasNext()) {
                                    i = length;
                                    break;
                                }
                                zb.e eVar = (zb.e) it.next();
                                java.util.Iterator it2 = it;
                                byte[] decode2 = common.emv.util.HexUtil.decode(eVar.b);
                                boolean z6 = z5;
                                i = length;
                                java.lang.String str3 = eVar.c.getConfiguration(transactionRequest.getTransactionData().getTransactionType()).get(zb.g.I.b0);
                                if (str3 != null && str3.equalsIgnoreCase(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX)) {
                                    this.l = false;
                                }
                                if (decode2.length == orDefault.length) {
                                    z5 = java.util.Arrays.equals(decode2, orDefault);
                                    z3 = z5;
                                } else {
                                    if (!this.l) {
                                        z5 = z6;
                                        z = true;
                                        break;
                                    }
                                    if (orDefault.length > decode2.length) {
                                        z5 = java.util.Arrays.equals(decode2, java.util.Arrays.copyOf(orDefault, decode2.length));
                                        z4 = z5;
                                    } else {
                                        z5 = z6;
                                    }
                                }
                                if (!z5) {
                                    it = it2;
                                    length = i;
                                } else if (e == 36864) {
                                    arrayList.add(new zb.c(eVar, orDefault, 0, createMap3.get(zb.g.u.a()), createMap3.get(zb.g.w.a())));
                                }
                            }
                            z = z3;
                            if (!z5) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            z3 = z;
                            if (!z3) {
                            }
                        }
                        strArr = split;
                        i = length;
                        if (str2.startsWith("A000000025")) {
                            break loop0;
                        }
                        if (!z3) {
                            break;
                        }
                    }
                    strArr = split;
                    i = length;
                    if (str2.startsWith("A000000025")) {
                        break loop0;
                    }
                    if (!z3) {
                    }
                }
                i2++;
                cardSession2 = cardSession;
                split = strArr;
                length = i;
            }
            if (arrayList.size() != 0) {
                return arrayList;
            }
            throw new java.lang.IllegalArgumentException();
        } catch (java.lang.Exception unused) {
            arrayList.clear();
            return arrayList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4 A[Catch: IOException -> 0x00ef, TRY_LEAVE, TryCatch #0 {IOException -> 0x00ef, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0020, B:10:0x0029, B:14:0x0031, B:15:0x0039, B:17:0x0043, B:18:0x005e, B:19:0x0063, B:22:0x006b, B:32:0x0071, B:68:0x0079, B:59:0x0083, B:65:0x008a, B:62:0x0097, B:37:0x00a6, B:54:0x00b0, B:56:0x00b9, B:49:0x00bf, B:51:0x00c8, B:41:0x00d2, B:43:0x00d8, B:27:0x00e4, B:72:0x004c, B:74:0x0056, B:12:0x0034, B:77:0x0037), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(java.nio.ByteBuffer byteBuffer, common.emv.configuration.DataObjectList dataObjectList, common.emv.configuration.DataObjectList dataObjectList2) {
        zb.g.b bVar;
        java.lang.String str;
        java.lang.String str2;
        int i;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(256);
        while (byteBuffer.hasRemaining()) {
            try {
                common.emv.util.Tag create = common.emv.util.Tag.create(byteBuffer);
                int decodeLength = common.emv.util.BerTlv.decodeLength(byteBuffer);
                zb.g a2 = zb.g.a(create.toHexValue());
                if (a2 != null) {
                    zb.g[] values = zb.g.values();
                    for (int i2 = 0; i2 < 52; i2++) {
                        zb.g gVar = values[i2];
                        if (gVar.equals(a2)) {
                            bVar = gVar.c0;
                            break;
                        }
                    }
                }
                bVar = zb.g.b.Unknown;
                if (dataObjectList.get(create.toHexValue()) != null) {
                    str2 = dataObjectList.get(create.toHexValue());
                } else if (dataObjectList2.get(create.toHexValue()) != null) {
                    str2 = dataObjectList2.get(create.toHexValue());
                } else {
                    str = "";
                    if (create.isPrimitive() || str == null || str.length() <= 0) {
                        for (i = 0; i < decodeLength; i++) {
                            byteArrayOutputStream.write(0);
                        }
                    } else {
                        int length = str.length() / 2;
                        if (decodeLength == length) {
                            byteArrayOutputStream.write(common.emv.util.HexUtil.decode(str));
                        } else if (decodeLength < length) {
                            int i3 = (length - decodeLength) * 2;
                            if (bVar == zb.g.b.Numeric) {
                                byteArrayOutputStream.write(common.emv.util.HexUtil.decode(str.substring(i3)));
                            } else {
                                byteArrayOutputStream.write(common.emv.util.HexUtil.decode(str.substring(0, i3 - 1)));
                            }
                        } else {
                            int i4 = decodeLength - length;
                            int ordinal = bVar.ordinal();
                            if (ordinal == 0) {
                                while (i4 > 0) {
                                    byteArrayOutputStream.write(0);
                                    i4--;
                                }
                                byteArrayOutputStream.write(common.emv.util.HexUtil.decode(str));
                            } else if (ordinal != 1) {
                                byteArrayOutputStream.write(common.emv.util.HexUtil.decode(str));
                                while (i4 > 0) {
                                    byteArrayOutputStream.write(0);
                                    i4--;
                                }
                            } else {
                                byteArrayOutputStream.write(common.emv.util.HexUtil.decode(str));
                                while (i4 > 0) {
                                    byteArrayOutputStream.write(255);
                                    i4--;
                                }
                            }
                        }
                    }
                }
                str = str2;
                if (create.isPrimitive()) {
                }
                while (i < decodeLength) {
                }
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0189 A[Catch: IOException | IllegalArgumentException -> 0x01e1, TryCatch #0 {IOException | IllegalArgumentException -> 0x01e1, blocks: (B:3:0x0001, B:6:0x001a, B:8:0x001d, B:10:0x002f, B:12:0x0032, B:14:0x0044, B:16:0x0047, B:20:0x0068, B:21:0x006d, B:25:0x0071, B:27:0x0074, B:29:0x0092, B:30:0x0096, B:32:0x009c, B:35:0x00ae, B:38:0x00bb, B:40:0x00d7, B:42:0x00db, B:44:0x00ed, B:45:0x0108, B:47:0x010c, B:50:0x0114, B:51:0x011e, B:53:0x0124, B:56:0x0131, B:58:0x0137, B:60:0x0147, B:61:0x0153, B:63:0x0159, B:66:0x0165, B:71:0x017e, B:75:0x0183, B:77:0x0189, B:79:0x01b9, B:81:0x01be, B:82:0x01c1, B:84:0x01c9, B:85:0x01ce, B:86:0x00fc, B:89:0x01cf, B:90:0x01d4, B:91:0x01d5, B:92:0x01da, B:93:0x01db, B:94:0x01e0), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c9 A[Catch: IOException | IllegalArgumentException -> 0x01e1, TryCatch #0 {IOException | IllegalArgumentException -> 0x01e1, blocks: (B:3:0x0001, B:6:0x001a, B:8:0x001d, B:10:0x002f, B:12:0x0032, B:14:0x0044, B:16:0x0047, B:20:0x0068, B:21:0x006d, B:25:0x0071, B:27:0x0074, B:29:0x0092, B:30:0x0096, B:32:0x009c, B:35:0x00ae, B:38:0x00bb, B:40:0x00d7, B:42:0x00db, B:44:0x00ed, B:45:0x0108, B:47:0x010c, B:50:0x0114, B:51:0x011e, B:53:0x0124, B:56:0x0131, B:58:0x0137, B:60:0x0147, B:61:0x0153, B:63:0x0159, B:66:0x0165, B:71:0x017e, B:75:0x0183, B:77:0x0189, B:79:0x01b9, B:81:0x01be, B:82:0x01c1, B:84:0x01c9, B:85:0x01ce, B:86:0x00fc, B:89:0x01cf, B:90:0x01d4, B:91:0x01d5, B:92:0x01da, B:93:0x01db, B:94:0x01e0), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(java.nio.ByteBuffer byteBuffer, common.emv.kernel.TransactionRequest transactionRequest, java.util.List<zb.e> list) {
        byte[] bArr;
        int i;
        byte[] bArr2;
        try {
            java.util.Map<common.emv.util.Tag, byte[]> createMap = common.emv.util.BerTlv.createMap(byteBuffer);
            byte[] bArr3 = createMap.get(zb.g.n.a());
            if (createMap.size() != 1 || (bArr3 != null && bArr3.length == 0)) {
                throw new java.lang.IllegalArgumentException();
            }
            byte[] bArr4 = common.emv.util.BerTlv.createMap(bArr3).get(zb.g.p.a());
            if (bArr4 == null || bArr4.length == 0) {
                throw new java.lang.IllegalArgumentException();
            }
            byte[] bArr5 = common.emv.util.BerTlv.createMap(bArr4).get(zb.g.q.a());
            if (bArr5 == null || bArr5.length == 0) {
                throw new java.lang.IllegalArgumentException();
            }
            java.util.Map<common.emv.util.Tag, byte[]> createMap2 = common.emv.util.BerTlv.createMap(bArr5);
            byte[] bArr6 = createMap2.get(zb.g.K.a());
            byte[] bArr7 = createMap2.get(zb.g.M.a());
            if (bArr7 == null && bArr6 == null) {
                throw new java.lang.IllegalArgumentException();
            }
            if (bArr7 == null || bArr7.length <= 0) {
                bArr = null;
                i = 0;
            } else {
                byte[] bArr8 = common.emv.util.BerTlv.createMap(createMap2.get(zb.g.r.a())).get(zb.g.s.a());
                if (bArr8 != null) {
                    java.util.Iterator<zb.e> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        zb.e next = it.next();
                        if (next.b.equals(common.emv.util.HexUtil.encodeToString(bArr8))) {
                            transactionRequest.getTransactionData().setTTQ(common.emv.util.HexUtil.encodeToString(next.e));
                            break;
                        }
                    }
                }
                bArr = a(java.nio.ByteBuffer.wrap(bArr7), transactionRequest.getTransactionData().getData(), this.g.getTerminalConfiguration());
                i = bArr.length;
            }
            if (bArr6 != null && bArr6.length >= 2) {
                common.emv.configuration.DataObjectList data = transactionRequest.getTransactionData().getData();
                zb.g gVar = zb.g.i;
                java.lang.String str = data.get(gVar.b0) != null ? transactionRequest.getTransactionData().getData().get(gVar.b0) : this.g.getTerminalConfiguration().get(gVar.b0);
                if (str != null && !str.isEmpty()) {
                    java.lang.String encodeToString = common.emv.util.HexUtil.encodeToString(bArr6);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int i2 = 0;
                    while (i2 < encodeToString.length()) {
                        int i3 = i2 + 4;
                        arrayList.add(encodeToString.substring(i2, i3));
                        i2 = i3;
                    }
                    bArr2 = null;
                    for (int i4 = 0; i4 < str.length(); i4 += 10) {
                        if (str.substring(i4, i4 + 4).equals(zb.g.L.b0)) {
                            int i5 = i4 + 10;
                            java.lang.String substring = str.substring(i4 + 6, i5);
                            java.util.Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                if (((java.lang.String) it2.next()).equals(substring)) {
                                    common.emv.util.Logger.isLogEnable();
                                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(5);
                                    byteArrayOutputStream.write(common.emv.util.HexUtil.decode(str.substring(i4, i5)));
                                    bArr2 = byteArrayOutputStream.toByteArray();
                                }
                            }
                        }
                    }
                    if (bArr2 != null) {
                        i += bArr2.length;
                    }
                    if (i != 0) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    byte[] encodeLength = common.emv.util.BerTlv.encodeLength(i);
                    java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream(encodeLength.length + 6 + i + 1);
                    byteArrayOutputStream2.write(128);
                    byteArrayOutputStream2.write(26);
                    byteArrayOutputStream2.write(0);
                    byteArrayOutputStream2.write(0);
                    byteArrayOutputStream2.write((i + encodeLength.length + 1) & 255);
                    byteArrayOutputStream2.write(131);
                    byteArrayOutputStream2.write(encodeLength);
                    if (bArr != null) {
                        byteArrayOutputStream2.write(bArr);
                    }
                    if (bArr2 != null) {
                        byteArrayOutputStream2.write(bArr2);
                    }
                    byteArrayOutputStream2.write(0);
                    return byteArrayOutputStream2.toByteArray();
                }
            }
            bArr2 = null;
            if (i != 0) {
            }
        } catch (java.io.IOException | java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public final void a() {
        a(this.d, this.h, 1000L);
        this.e.forEach(new java.util.function.Consumer() { // from class: zb.f$$ExternalSyntheticLambda5
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                ((common.emv.kernel.KernelProvider) obj).provide().resetTransaction();
            }
        });
        this.p.reset();
    }

    public static /* synthetic */ void $r8$lambda$B39TJ_h_CXXLxrJI7cNlEomujZo(zb.f fVar, common.emv.kernel.TransactionOutcome transactionOutcome, java.lang.Throwable th) {
        if (th != null) {
            fVar.d.disable();
        }
    }

    public final void d(java.util.concurrent.CompletableFuture<common.emv.kernel.TransactionOutcome> completableFuture, final common.emv.kernel.TransactionRequest transactionRequest, common.emv.kernel.TransactionEventListener transactionEventListener, java.util.List<zb.e> list) {
        if (completableFuture.isDone()) {
            return;
        }
        if (!transactionRequest.isRestart()) {
            list.forEach(new java.util.function.Consumer() { // from class: zb.f$$ExternalSyntheticLambda4
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    zb.f.a(common.emv.kernel.TransactionRequest.this, (zb.e) obj);
                }
            });
        }
        c(completableFuture, transactionRequest, transactionEventListener, list);
    }

    public final void c(java.util.concurrent.CompletableFuture<common.emv.kernel.TransactionOutcome> completableFuture, common.emv.kernel.TransactionRequest transactionRequest, common.emv.kernel.TransactionEventListener transactionEventListener, java.util.List<zb.e> list) {
        if (completableFuture.isDone()) {
            return;
        }
        transactionEventListener.updateUI((!transactionRequest.isRestart() || transactionRequest.getRetainUserInterfaceData() == null) ? common.emv.kernel.TransactionOutcome.StandardMessage.PresentCard : transactionRequest.getRetainUserInterfaceData().getMessage());
        completableFuture.whenComplete(new java.util.function.BiConsumer() { // from class: zb.f$$ExternalSyntheticLambda3
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                zb.f.$r8$lambda$B39TJ_h_CXXLxrJI7cNlEomujZo(zb.f.this, (common.emv.kernel.TransactionOutcome) obj, (java.lang.Throwable) obj2);
            }
        });
        try {
            this.d.enable(new zb.f.a(this, completableFuture, transactionRequest, transactionEventListener, list));
        } catch (common.emv.cardio.CardIONotReadyException e) {
            completableFuture.completeExceptionally(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x04ff, code lost:
    
        java.lang.Thread.sleep(r1.getUiReqOnOutcome().getHoldTime() * 100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x050d, code lost:
    
        r23.f.submit(new zb.f$$ExternalSyntheticLambda0(r23, r24, r26, r27, r28));
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0522, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x04d9, code lost:
    
        if (common.emv.util.HexUtil.encodeToString(r26.getAid()).startsWith(zb.d.RID_VISA.toString()) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x04e1, code lost:
    
        if (r1.getOutcome() != common.emv.kernel.TransactionOutcome.Outcome.EndApplication) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x04e3, code lost:
    
        r2 = r26.getTransactionData().getData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0483, code lost:
    
        if (r7 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0485, code lost:
    
        a(r23.d, r25, r1.getUiReqOnOutcome().getHoldTime() * 100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0495, code lost:
    
        r27.selectNextOutcome(r1);
        r26.setRestart(r14);
        r26.setRetainUserInterfaceData(r1.getUiReqOnRestart());
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x04b4, code lost:
    
        if (common.emv.util.HexUtil.encodeToString(r26.getAid()).startsWith(zb.d.RID_AMEX.toString()) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x04ba, code lost:
    
        if (r1.getOutcome() != r3) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x04bc, code lost:
    
        r2 = r26.getTransactionData().getData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x04ec, code lost:
    
        r2.put(zb.g.f.b0, common.emv.util.RandomUtil.generateRandomInHexString(4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x04fd, code lost:
    
        if (r1.getUiReqOnOutcome().getHoldTime() <= 0) goto L135;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(final java.util.concurrent.CompletableFuture<common.emv.kernel.TransactionOutcome> completableFuture, common.emv.cardio.CardSession cardSession, final common.emv.kernel.TransactionRequest transactionRequest, final common.emv.kernel.TransactionEventListener transactionEventListener, final java.util.List<zb.e> list) {
        java.util.List<zb.c> arrayList;
        byte[] bArr;
        zb.c cVar;
        java.util.List<zb.c> list2;
        java.lang.String str;
        zb.a aVar;
        char c2;
        boolean z;
        boolean z2;
        byte[] a2;
        if (common.emv.util.Logger.isLogEnable()) {
            list.size();
        }
        this.p = common.emv.kernel.TransactionOutcome.ErrorIndication.NA;
        byte[] bArr2 = null;
        transactionRequest.setKernelIdentifierTerminal(null);
        boolean z3 = false;
        try {
            try {
                this.h = cardSession;
                byte[] bArr3 = f7092a;
                zb.a aVar2 = (zb.a) cardSession;
                byte[] send = aVar2.send(c(bArr3));
                if (this.m && f(send) && (a2 = a(g(send), transactionRequest, list)) != null) {
                    byte[] send2 = aVar2.send(a2);
                    if (f(send2)) {
                        send = send2;
                    }
                }
                this.k = true;
                java.util.List<zb.c> a3 = a(a(g(send), bArr3, list, transactionRequest.getTransactionData().getTransactionType()));
                if (!a3.isEmpty()) {
                    java.util.Iterator<zb.c> it = a3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (it.next().c == 2) {
                            this.f7093o = true;
                            break;
                        }
                    }
                }
                this.k = false;
                java.lang.String str2 = "0000000000000000";
                int i = 13;
                if (this.f7093o && !f(send)) {
                    this.p.setL2(common.emv.kernel.TransactionOutcome.ErrorIndication_L2.L2_STATUS_BYTES);
                    this.p.setSw12(java.lang.Integer.toHexString(e(send)));
                    common.emv.kernel.TransactionOutcome.ErrorIndication errorIndication = this.p;
                    common.emv.kernel.TransactionOutcome.StandardMessage standardMessage = common.emv.kernel.TransactionOutcome.StandardMessage.ErrorOtherCard;
                    errorIndication.setMessage(standardMessage);
                    a(this.d, cardSession);
                    a(completableFuture, transactionRequest, common.emv.kernel.TransactionOutcome.Outcome.EndApplication, new common.emv.kernel.TransactionOutcome.UserInterfaceRequestData(standardMessage, common.emv.kernel.TransactionOutcome.Status.NotReady, 13, "0000000000000000"), transactionEventListener);
                    return false;
                }
                if (f(send)) {
                    arrayList = a(a(g(send), f7092a, list, transactionRequest.getTransactionData().getTransactionType()));
                } else if (e(send) == 27266) {
                    java.util.Iterator<zb.e> it2 = list.iterator();
                    java.util.List<zb.c> list3 = null;
                    while (it2.hasNext()) {
                        java.lang.String str3 = it2.next().h;
                        if (str3 != null && !str3.isEmpty()) {
                            list3 = a(str3, transactionRequest, cardSession, list);
                        }
                        if (list3 != null && list3.size() > 0) {
                            break;
                        }
                    }
                    arrayList = a(list3);
                } else {
                    arrayList = new java.util.ArrayList<>();
                }
                java.util.List<zb.c> list4 = arrayList;
                if (common.emv.util.Logger.isLogEnable()) {
                    list4.size();
                }
                if (!this.f7093o || this.p.getL2() != common.emv.kernel.TransactionOutcome.ErrorIndication_L2.L2_PARSING_ERROR) {
                    while (true) {
                        this.p = common.emv.kernel.TransactionOutcome.ErrorIndication.NA;
                        transactionRequest.setKernelIdentifierTerminal(bArr2);
                        if (!list4.isEmpty()) {
                            zb.c remove = list4.remove(z3 ? 1 : 0);
                            byte[] bArr4 = remove.d;
                            byte[] bArr5 = remove.b;
                            if (!remove.f7089a.g || bArr4 == null || bArr4.length <= 0) {
                                bArr = bArr5;
                            } else {
                                bArr = new byte[bArr5.length + bArr4.length];
                                java.lang.System.arraycopy(bArr5, z3 ? 1 : 0, bArr, z3 ? 1 : 0, bArr5.length);
                                java.lang.System.arraycopy(bArr4, z3 ? 1 : 0, bArr, bArr5.length, bArr4.length);
                            }
                            byte[] send3 = aVar2.send(c(bArr));
                            if (f(send3)) {
                                if (!a(remove.b)) {
                                    transactionRequest.getTransactionData().getData().put(zb.g.s.b0, common.emv.util.HexUtil.encodeToString(remove.b));
                                }
                                if (this.f7093o) {
                                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(10);
                                    java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream(8);
                                    java.io.ByteArrayOutputStream byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
                                    list2 = list4;
                                    java.io.ByteArrayOutputStream byteArrayOutputStream4 = new java.io.ByteArrayOutputStream(8);
                                    byteArrayOutputStream2.write(common.emv.kernel.TransactionOutcome.OutcomeParameterSetB1.Approved.getCode());
                                    byteArrayOutputStream2.write(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                                    byteArrayOutputStream2.write(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                                    byteArrayOutputStream2.write(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                                    byteArrayOutputStream2.write(144);
                                    byteArrayOutputStream2.write(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                                    byteArrayOutputStream2.write(255);
                                    byteArrayOutputStream2.write(0);
                                    byteArrayOutputStream3.write(remove.a());
                                    byteArrayOutputStream3.write(remove.c);
                                    byteArrayOutputStream.write(common.emv.util.HexUtil.decode(zb.g.U.b0));
                                    byteArrayOutputStream.write(common.emv.util.BerTlv.encodeLength(6));
                                    byteArrayOutputStream.write(common.emv.util.BerTlv.encodeLength(this.p.getL1().getCode()));
                                    byteArrayOutputStream.write(common.emv.util.BerTlv.encodeLength(this.p.getL2().getCode()));
                                    byteArrayOutputStream.write(common.emv.util.BerTlv.encodeLength(this.p.getL3().getCode()));
                                    byteArrayOutputStream.write(common.emv.util.HexUtil.decode(this.p.getSw12()));
                                    byteArrayOutputStream.write(this.p.getMessage().getMessageIdentifier());
                                    str = str2;
                                    aVar = aVar2;
                                    z = true;
                                    byte[] bArr6 = {(byte) ((e(send3) >> 8) & 255), (byte) (255 & e(send3))};
                                    byte b2 = bArr6[0];
                                    byte b3 = bArr6[1];
                                    byte[] bArr7 = new byte[8];
                                    int i2 = remove.c;
                                    cVar = remove;
                                    bArr7[0] = (byte) i2;
                                    bArr7[3] = 0;
                                    if (i2 == 8) {
                                        bArr7[3] = 64;
                                    }
                                    byteArrayOutputStream4.write(bArr7);
                                    java.io.ByteArrayOutputStream byteArrayOutputStream5 = new java.io.ByteArrayOutputStream();
                                    byteArrayOutputStream5.write(common.emv.util.HexUtil.decode(zb.g.W.b0));
                                    byteArrayOutputStream5.write(common.emv.util.BerTlv.encodeLength(8));
                                    byteArrayOutputStream5.write(byteArrayOutputStream2.toByteArray());
                                    byteArrayOutputStream5.write(send3);
                                    byteArrayOutputStream5.write(common.emv.util.HexUtil.decode(zb.g.X.b0));
                                    byteArrayOutputStream5.write(byteArrayOutputStream3.size());
                                    byteArrayOutputStream5.write(byteArrayOutputStream3.toByteArray());
                                    byteArrayOutputStream5.write(common.emv.util.HexUtil.decode(zb.g.V.b0));
                                    byteArrayOutputStream5.write(common.emv.util.BerTlv.encodeLength(10));
                                    byteArrayOutputStream5.write(byteArrayOutputStream.toByteArray());
                                    byteArrayOutputStream5.write(common.emv.util.HexUtil.decode(zb.g.Y.b0));
                                    c2 = 2;
                                    byteArrayOutputStream5.write(common.emv.util.BerTlv.encodeLength(2));
                                    byteArrayOutputStream5.write(bArr6);
                                    byteArrayOutputStream5.write(common.emv.util.HexUtil.decode(zb.g.Z.b0));
                                    byteArrayOutputStream5.write(common.emv.util.BerTlv.encodeLength(8));
                                    byteArrayOutputStream5.write(bArr7);
                                    transactionRequest.setKernelIdentifierTerminal(bArr7);
                                } else {
                                    cVar = remove;
                                    list2 = list4;
                                    str = str2;
                                    aVar = aVar2;
                                    c2 = 2;
                                    z = true;
                                }
                                java.util.List<zb.c> list5 = list2;
                                java.lang.String str4 = str;
                                boolean z4 = z;
                                common.emv.kernel.TransactionOutcome a4 = a(cardSession, transactionRequest, transactionEventListener, cVar, bArr, send3);
                                transactionRequest.getTransactionData().getData().remove(zb.g.s.b0);
                                if (a4.getFieldOffRequest() != 0) {
                                    a4.getFieldOffRequest();
                                    a(this.d, cardSession, a4.getFieldOffRequest() * 100);
                                    java.lang.Thread.sleep(a4.getFieldOffRequest() * 100);
                                    z2 = z4;
                                } else {
                                    z2 = false;
                                }
                                if (!completableFuture.isDone()) {
                                    if (a4.isUiReqOnOutcomePresent()) {
                                        transactionEventListener.updateUI(a4.getUiReqOnOutcome().getMessage());
                                    }
                                    common.emv.kernel.TransactionOutcome.Outcome outcome = a4.getOutcome();
                                    common.emv.kernel.TransactionOutcome.Outcome outcome2 = common.emv.kernel.TransactionOutcome.Outcome.TryAgain;
                                    if (outcome == outcome2 || a4.getStart() == common.emv.kernel.TransactionOutcome.Start.B) {
                                        break;
                                    }
                                    if (a4.getOutcome() != common.emv.kernel.TransactionOutcome.Outcome.SelectNext) {
                                        a(this.d, cardSession);
                                        completableFuture.complete(a4);
                                        return false;
                                    }
                                    transactionEventListener.selectNextOutcome(a4);
                                    transactionRequest.getTransactionData().getData().put(zb.g.f.b0, common.emv.util.RandomUtil.generateRandomInHexString(4));
                                    list4 = list5;
                                    str2 = str4;
                                    aVar2 = aVar;
                                    i = 13;
                                    bArr2 = null;
                                    z3 = false;
                                } else {
                                    if (z2) {
                                        return false;
                                    }
                                    a(this.d, cardSession, a4.getUiReqOnOutcome().getHoldTime() * 100);
                                    return false;
                                }
                            } else {
                                if (common.emv.util.HexUtil.encodeToString(bArr).startsWith(zb.d.RID_EFTPOS.toString()) && e(send3) == 27265 && remove.c == 11) {
                                    a(this.d, cardSession);
                                    a(completableFuture, transactionRequest, common.emv.kernel.TransactionOutcome.Outcome.EndApplication, new common.emv.kernel.TransactionOutcome.UserInterfaceRequestData(common.emv.kernel.TransactionOutcome.StandardMessage.InsertSwipeOrTryAnotherCard, common.emv.kernel.TransactionOutcome.Status.ReadyToRead), transactionEventListener);
                                    return z3;
                                }
                                i = 13;
                                bArr2 = null;
                            }
                        } else {
                            if (!this.f7093o) {
                                a(this.d, cardSession);
                                a(completableFuture, transactionRequest, common.emv.kernel.TransactionOutcome.Outcome.EndApplication, new common.emv.kernel.TransactionOutcome.UserInterfaceRequestData(common.emv.kernel.TransactionOutcome.StandardMessage.InsertSwipeOrTryAnotherCard, common.emv.kernel.TransactionOutcome.Status.ReadyToRead), transactionEventListener);
                                return z3;
                            }
                            this.p.setL2(common.emv.kernel.TransactionOutcome.ErrorIndication_L2.L2_EMPTY_CANDIDATE_LIST);
                            common.emv.kernel.TransactionOutcome.ErrorIndication errorIndication2 = this.p;
                            common.emv.kernel.TransactionOutcome.StandardMessage standardMessage2 = common.emv.kernel.TransactionOutcome.StandardMessage.ErrorOtherCard;
                            errorIndication2.setMessage(standardMessage2);
                            a(this.d, cardSession);
                            a(completableFuture, transactionRequest, common.emv.kernel.TransactionOutcome.Outcome.EndApplication, new common.emv.kernel.TransactionOutcome.UserInterfaceRequestData(standardMessage2, common.emv.kernel.TransactionOutcome.Status.NotReady, i, str2), transactionEventListener);
                            return z3;
                        }
                    }
                } else {
                    common.emv.kernel.TransactionOutcome.ErrorIndication errorIndication3 = this.p;
                    common.emv.kernel.TransactionOutcome.StandardMessage standardMessage3 = common.emv.kernel.TransactionOutcome.StandardMessage.ErrorOtherCard;
                    errorIndication3.setMessage(standardMessage3);
                    a(this.d, cardSession);
                    a(completableFuture, transactionRequest, common.emv.kernel.TransactionOutcome.Outcome.EndApplication, new common.emv.kernel.TransactionOutcome.UserInterfaceRequestData(standardMessage3, common.emv.kernel.TransactionOutcome.Status.NotReady, 13, "0000000000000000"), transactionEventListener);
                    return false;
                }
            } catch (java.nio.BufferOverflowException | java.nio.BufferUnderflowException unused) {
                a(this.d, cardSession);
                a(completableFuture, transactionRequest, common.emv.kernel.TransactionOutcome.Outcome.SelectNext, new common.emv.kernel.TransactionOutcome.UserInterfaceRequestData(common.emv.kernel.TransactionOutcome.StandardMessage.NA, common.emv.kernel.TransactionOutcome.Status.NA), transactionEventListener);
                return false;
            }
        } catch (java.io.IOException unused2) {
            if (this.f7093o) {
                this.p.setL1(common.emv.kernel.TransactionOutcome.ErrorIndication_L1.L1_TIMEOUT_ERROR);
                this.p.setL2(common.emv.kernel.TransactionOutcome.ErrorIndication_L2.L2_OK);
                this.p.setL3(common.emv.kernel.TransactionOutcome.ErrorIndication_L3.L3_OK);
                this.p.setMessage(common.emv.kernel.TransactionOutcome.StandardMessage.NA);
                a(transactionEventListener);
            }
            a(this.d, cardSession);
            this.f.submit(new java.lang.Runnable() { // from class: zb.f$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    zb.f.this.c(completableFuture, transactionRequest, transactionEventListener, list);
                }
            });
            return false;
        } catch (java.lang.Exception e) {
            a(this.d, cardSession);
            completableFuture.completeExceptionally(e);
            return false;
        }
    }

    public final void a(java.util.concurrent.CompletableFuture<common.emv.kernel.TransactionOutcome> completableFuture, common.emv.kernel.TransactionRequest transactionRequest, common.emv.kernel.TransactionOutcome.Outcome outcome, common.emv.kernel.TransactionOutcome.UserInterfaceRequestData userInterfaceRequestData, common.emv.kernel.TransactionEventListener transactionEventListener) {
        common.emv.kernel.TransactionOutcome transactionOutcome = new common.emv.kernel.TransactionOutcome(transactionRequest, outcome);
        transactionOutcome.setUiReqOnOutcome(userInterfaceRequestData);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(10);
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream(13);
        java.io.ByteArrayOutputStream byteArrayOutputStream3 = new java.io.ByteArrayOutputStream(8);
        try {
            byteArrayOutputStream.write(common.emv.util.HexUtil.decode(zb.g.U.b0));
            byteArrayOutputStream.write(common.emv.util.BerTlv.encodeLength(6));
            byteArrayOutputStream.write(common.emv.util.BerTlv.encodeLength(this.p.getL1().getCode()));
            byteArrayOutputStream.write(common.emv.util.BerTlv.encodeLength(this.p.getL2().getCode()));
            byteArrayOutputStream.write(common.emv.util.BerTlv.encodeLength(this.p.getL3().getCode()));
            byteArrayOutputStream.write(common.emv.util.HexUtil.decode(this.p.getSw12()));
            byteArrayOutputStream.write(this.p.getMessage().getMessageIdentifier());
            if (transactionOutcome.getUiReqOnOutcome() != null) {
                byteArrayOutputStream2.write(common.emv.util.BerTlv.encodeLength(transactionOutcome.getUiReqOnOutcome().getMessage().getMessageIdentifier()));
                byteArrayOutputStream2.write(common.emv.util.BerTlv.encodeLength(transactionOutcome.getUiReqOnOutcome().getStatus().code));
                byteArrayOutputStream2.write(common.emv.util.HexUtil.decode(java.lang.String.format("%06d", java.lang.Integer.valueOf(transactionOutcome.getUiReqOnOutcome().getHoldTime()))));
                if (transactionOutcome.getUiReqOnOutcome().getLanguagePreference() != null) {
                    byteArrayOutputStream2.write(common.emv.util.HexUtil.decode(transactionOutcome.getUiReqOnOutcome().getLanguagePreference()));
                }
            }
            byteArrayOutputStream3.write(new byte[4]);
            byteArrayOutputStream3.write(144);
            byteArrayOutputStream3.write(new byte[3]);
        } catch (java.io.IOException unused) {
        }
        transactionOutcome.setDiscretionaryData(byteArrayOutputStream.toByteArray());
        transactionOutcome.setUiRequestData(byteArrayOutputStream2.toByteArray());
        transactionOutcome.setOutcomeParameterSet(byteArrayOutputStream3.toByteArray());
        transactionOutcome.setErrorIndication(this.p);
        transactionEventListener.updateUI(userInterfaceRequestData.getMessage());
        completableFuture.complete(transactionOutcome);
    }

    public final void a(common.emv.kernel.TransactionEventListener transactionEventListener) {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(8);
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream(10);
            java.io.ByteArrayOutputStream byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
            byteArrayOutputStream.write(common.emv.kernel.TransactionOutcome.OutcomeParameterSetB1.TryAgain.getCode());
            byteArrayOutputStream.write(common.emv.kernel.TransactionOutcome.OutcomeParameterSetB2.StartB.getCode());
            byteArrayOutputStream.write(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            byteArrayOutputStream.write(common.emv.kernel.TransactionOutcome.OutcomeParameterSetB4.NA.getCode());
            byteArrayOutputStream.write(144);
            byteArrayOutputStream.write(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            byteArrayOutputStream.write(255);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream2.write(common.emv.util.HexUtil.decode(zb.g.U.b0));
            byteArrayOutputStream2.write(common.emv.util.BerTlv.encodeLength(6));
            byteArrayOutputStream2.write(common.emv.util.BerTlv.encodeLength(this.p.getL1().getCode()));
            byteArrayOutputStream2.write(common.emv.util.BerTlv.encodeLength(this.p.getL2().getCode()));
            byteArrayOutputStream2.write(common.emv.util.BerTlv.encodeLength(this.p.getL3().getCode()));
            byteArrayOutputStream2.write(common.emv.util.HexUtil.decode(this.p.getSw12()));
            byteArrayOutputStream2.write(this.p.getMessage().getMessageIdentifier());
            byteArrayOutputStream3.write(common.emv.util.HexUtil.decode(zb.g.W.b0));
            byteArrayOutputStream3.write(common.emv.util.BerTlv.encodeLength(8));
            byteArrayOutputStream3.write(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream3.write(common.emv.util.HexUtil.decode(zb.g.V.b0));
            byteArrayOutputStream3.write(common.emv.util.BerTlv.encodeLength(10));
            byteArrayOutputStream3.write(byteArrayOutputStream2.toByteArray());
            common.emv.util.HexUtil.encodeToString(byteArrayOutputStream3.toByteArray());
            transactionEventListener.updateOUT(byteArrayOutputStream3.toByteArray());
        } catch (java.io.IOException unused) {
        }
    }

    public final void a(common.emv.cardio.CardIO cardIO, common.emv.cardio.CardSession cardSession, long j) {
        if (cardSession != null) {
            cardSession.close(j, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        cardIO.disable();
    }

    public final void a(common.emv.cardio.CardIO cardIO, common.emv.cardio.CardSession cardSession) {
        a(cardIO, cardSession, 1000L);
    }

    public final java.util.concurrent.CompletableFuture<common.emv.kernel.TransactionOutcome> a(common.emv.kernel.TransactionRequest transactionRequest, common.emv.kernel.TransactionEventListener transactionEventListener) {
        common.emv.kernel.TransactionOutcome.Outcome outcome;
        common.emv.kernel.TransactionOutcome.UserInterfaceRequestData userInterfaceRequestData;
        byte[] decode;
        byte[] decode2;
        a();
        java.util.concurrent.CompletableFuture<common.emv.kernel.TransactionOutcome> completableFuture = new java.util.concurrent.CompletableFuture<>();
        try {
            java.lang.String amountAuth = transactionRequest.getTransactionData().getAmountAuth() != null ? transactionRequest.getTransactionData().getAmountAuth() : "0";
            java.lang.String amountOther = transactionRequest.getTransactionData().getAmountOther() != null ? transactionRequest.getTransactionData().getAmountOther() : "0";
            this.n = transactionRequest.getTransactionData().getTransactionType();
            boolean z = true;
            if (transactionRequest.getTransactionData().getContactlessPOSImplementationOptions() != null && (decode2 = common.emv.util.HexUtil.decode(transactionRequest.getTransactionData().getContactlessPOSImplementationOptions())) != null) {
                this.j = (decode2[0] & 8) == 8;
            }
            if (transactionRequest.getTransactionData().getVisaRiskParameterCheckingCapabilities() != null && (decode = common.emv.util.HexUtil.decode(transactionRequest.getTransactionData().getVisaRiskParameterCheckingCapabilities())) != null) {
                if ((decode[0] & 32) != 32) {
                    z = false;
                }
                this.m = z;
            }
            java.util.List<zb.e> a2 = a(a(this.n), amountAuth, amountOther, this.n);
            if (transactionRequest.getTransactionData().getAmexIsUnableToGoOnline().booleanValue()) {
                a(completableFuture, transactionRequest, common.emv.kernel.TransactionOutcome.Outcome.EndApplication, new common.emv.kernel.TransactionOutcome.UserInterfaceRequestData(common.emv.kernel.TransactionOutcome.StandardMessage.InsertSwipeOrTryAnotherCard, common.emv.kernel.TransactionOutcome.Status.ProcessingError), transactionEventListener);
                return completableFuture;
            }
            java.util.List<zb.e> list = (java.util.List) a2.stream().filter(new java.util.function.Predicate() { // from class: zb.f$$ExternalSyntheticLambda2
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    return zb.f.a((zb.e) obj);
                }
            }).collect(java.util.stream.Collectors.toList());
            if (list.size() != 0) {
                c(completableFuture, transactionRequest, transactionEventListener, list);
                return completableFuture;
            }
            if (transactionRequest.getTransactionData().getAmexEnhancedContactlessReaderCapabilities() != null) {
                outcome = common.emv.kernel.TransactionOutcome.Outcome.EndApplication;
                userInterfaceRequestData = new common.emv.kernel.TransactionOutcome.UserInterfaceRequestData(common.emv.kernel.TransactionOutcome.StandardMessage.InsertSwipeOrTryAnotherCard, common.emv.kernel.TransactionOutcome.Status.ProcessingError);
            } else {
                outcome = common.emv.kernel.TransactionOutcome.Outcome.TryAnotherInterface;
                userInterfaceRequestData = new common.emv.kernel.TransactionOutcome.UserInterfaceRequestData(common.emv.kernel.TransactionOutcome.StandardMessage.PleaseInsertOrSwipeCard, common.emv.kernel.TransactionOutcome.Status.ReadyToRead);
            }
            a(completableFuture, transactionRequest, outcome, userInterfaceRequestData, transactionEventListener);
            return completableFuture;
        } catch (java.lang.Exception e) {
            completableFuture.completeExceptionally(e);
            return completableFuture;
        }
    }

    public final java.util.List<zb.e> a(java.util.List<zb.e> list, java.lang.String str, java.lang.String str2, common.emv.kernel.TransactionData.TransactionType transactionType) {
        long parseLong = java.lang.Long.parseLong(str);
        long parseLong2 = java.lang.Long.parseLong(str2);
        for (zb.e eVar : list) {
            common.emv.configuration.EntryConfigurationData entryConfigurationData = eVar.c.getEntryConfigurationData(transactionType);
            if (entryConfigurationData != null) {
                if (a(entryConfigurationData.isStatusCheckSupport(), true)) {
                    java.lang.String str3 = eVar.c.getConfiguration(transactionType).get(zb.g.h.b0);
                    if (str3 == null) {
                        throw new java.lang.IllegalArgumentException("Invalid currency exponent configuration");
                    }
                    int i = 1;
                    for (int i2 = 0; i2 < java.lang.Integer.parseInt(str3); i2++) {
                        i *= 10;
                    }
                    if (i == parseLong) {
                        eVar.f |= 4;
                    }
                }
                if (parseLong == 0 && !a(entryConfigurationData.isZeroAmountOfflineAllowed(), true)) {
                    eVar.f = a(entryConfigurationData.isZeroAmountAllowed(), false) ? eVar.f | 1 : eVar.f | 8;
                }
                if (entryConfigurationData.getReaderContactlessTransactionLimit() != null && parseLong >= entryConfigurationData.getReaderContactlessTransactionLimit().longValue()) {
                    eVar.f |= 1;
                }
                if (entryConfigurationData.getReaderContactlessFloorLimit() != null && parseLong > entryConfigurationData.getReaderContactlessFloorLimit().longValue()) {
                    eVar.f |= 32;
                }
                if (entryConfigurationData.getReaderContactlessFloorLimit() == null && entryConfigurationData.getTerminalFloorLimit() != null && parseLong > entryConfigurationData.getTerminalFloorLimit().longValue()) {
                    eVar.f |= 32;
                }
                if (transactionType != common.emv.kernel.TransactionData.TransactionType.Purchase || parseLong2 <= 0 ? !(entryConfigurationData.getReaderCvmRequiredLimit() == null || parseLong < entryConfigurationData.getReaderCvmRequiredLimit().longValue()) : !(entryConfigurationData.getReaderCvmRequiredLimitCashback() == null || parseLong < entryConfigurationData.getReaderCvmRequiredLimitCashback().longValue())) {
                    eVar.f |= 16;
                }
                if (eVar.e != null) {
                    if (a(eVar.f, 32) || a(eVar.f, 4)) {
                        byte[] bArr = eVar.e;
                        bArr[1] = (byte) (bArr[1] | 128);
                    }
                    if (a(eVar.f, 8)) {
                        byte[] bArr2 = eVar.e;
                        if ((bArr2[0] & 8) == 0) {
                            bArr2[1] = (byte) (bArr2[1] | 128);
                        } else {
                            eVar.f |= 1;
                        }
                    }
                    if (a(eVar.f, 16)) {
                        byte[] bArr3 = eVar.e;
                        bArr3[1] = (byte) (bArr3[1] | 64);
                    }
                }
                if (a(entryConfigurationData.isAllowFormatError(), true)) {
                    this.k = true;
                }
            }
        }
        return list;
    }

    public final java.util.List<zb.c> a(java.util.List<zb.c> list) {
        int i;
        if (list.size() <= 1) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (zb.c cVar : list) {
            while (i < arrayList.size()) {
                i = b(cVar.e) >= b(((zb.c) arrayList.get(i)).e) ? i + 1 : 0;
            }
            arrayList.add(i, cVar);
        }
        return arrayList;
    }

    public final java.util.List<zb.e> a(common.emv.kernel.TransactionData.TransactionType transactionType) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (common.emv.kernel.KernelProvider kernelProvider : this.e) {
            java.lang.String aid = kernelProvider.aid();
            java.lang.String kernelID = kernelProvider.kernelID();
            common.emv.kernel.Kernel provide = kernelProvider.provide();
            common.emv.configuration.ApplicationConfiguration createConfiguration = this.g.createConfiguration(aid, kernelID);
            if (createConfiguration != null) {
                if (transactionType == common.emv.kernel.TransactionData.TransactionType.Unknown) {
                    transactionType = common.emv.kernel.TransactionData.TransactionType.Purchase;
                }
                if (createConfiguration.isTransactionTypeSupported(transactionType)) {
                    zb.e eVar = new zb.e(kernelProvider.kernelID(), aid, provide, createConfiguration, transactionType);
                    byte[] bArr = eVar.e;
                    if (bArr != null) {
                        bArr[1] = (byte) (bArr[1] & 63);
                    }
                    eVar.f = 0;
                    this.i = null;
                    if (this.j) {
                        java.lang.String str = createConfiguration.getConfiguration(transactionType).get(zb.g.z.b0);
                        if (str == null || str.length() < 2) {
                            this.i = null;
                        } else {
                            this.i = common.emv.util.HexUtil.decode(str);
                        }
                    }
                    arrayList.add(eVar);
                }
            }
        }
        return arrayList;
    }

    public final common.emv.kernel.TransactionOutcome a(common.emv.cardio.CardSession cardSession, common.emv.kernel.TransactionRequest transactionRequest, common.emv.kernel.TransactionEventListener transactionEventListener, zb.c cVar, byte[] bArr, byte[] bArr2) {
        zb.e eVar = cVar.f7089a;
        int i = eVar.f;
        common.emv.kernel.Kernel kernel = eVar.d;
        common.emv.configuration.ApplicationConfiguration applicationConfiguration = eVar.c;
        transactionRequest.setReaderContactlessFloorLimitExceed(a(i, 32));
        transactionRequest.setReaderCvmRequiredLimitExceed(a(i, 16));
        transactionRequest.setStatusCheckRequested(a(i, 4));
        transactionRequest.setZeroAmount(a(i, 8));
        byte[] bArr3 = cVar.f7089a.e;
        transactionRequest.setTtq(bArr3 == null ? null : java.util.Arrays.copyOf(bArr3, bArr3.length));
        transactionRequest.setAid(bArr);
        transactionRequest.setFci(bArr2);
        if (common.emv.util.HexUtil.encodeToString(bArr).startsWith("A000000025")) {
            java.lang.String str = applicationConfiguration.getConfiguration(transactionRequest.getTransactionData().getTransactionType()).get(zb.g.N.b0);
            java.lang.String str2 = applicationConfiguration.getConfiguration(transactionRequest.getTransactionData().getTransactionType()).get(zb.g.O.b0);
            if (str != null && transactionRequest.getTransactionData().getAmexContactlessReaderCapabilities() == null) {
                transactionRequest.getTransactionData().setAmexContactlessReaderCapabilities(common.emv.util.HexUtil.decode(str));
            }
            if (str2 != null && transactionRequest.getTransactionData().getAmexEnhancedContactlessReaderCapabilities() == null) {
                transactionRequest.getTransactionData().setAmexEnhancedContactlessReaderCapabilities(common.emv.util.HexUtil.decode(str2));
            }
        }
        kernel.init(applicationConfiguration, transactionRequest.getTransactionData().getTransactionType());
        return kernel.startTransaction(transactionRequest, cardSession, transactionEventListener);
    }

    public static java.nio.ByteBuffer g(byte[] bArr) {
        return java.nio.ByteBuffer.wrap(bArr, 0, bArr.length - 2);
    }

    public static boolean f(byte[] bArr) {
        return e(bArr) == 36864;
    }

    public static int e(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return 0;
        }
        int length = bArr.length;
        return ((bArr[length - 2] & 255) << 8) + (bArr[length - 1] & 255);
    }

    public static byte[] d(byte[] bArr) {
        if (bArr.length == 0) {
            throw new java.lang.IllegalArgumentException();
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(bArr.length + 7);
            try {
                byteArrayOutputStream.write(c);
                byteArrayOutputStream.write(bArr.length & 255);
                byteArrayOutputStream.write(bArr);
                byteArrayOutputStream.write(0);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static byte[] c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new java.lang.IllegalArgumentException();
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(bArr.length + 7);
            try {
                byteArrayOutputStream.write(b);
                byteArrayOutputStream.write(bArr.length & 255);
                byteArrayOutputStream.write(bArr);
                byteArrayOutputStream.write(0);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static int b(byte[] bArr) {
        int i;
        if (bArr == null || bArr.length == 0 || (i = bArr[0] & com.google.common.base.Ascii.SI) == 0 || i == 15) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public static boolean a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static /* synthetic */ boolean a(zb.e eVar) {
        return !a(eVar.f, 1);
    }

    public static boolean a(java.lang.Boolean bool, boolean z) {
        return bool != null && z == bool.booleanValue();
    }

    public static class a implements common.emv.cardio.CardIOSessionListener {

        /* renamed from: a, reason: collision with root package name */
        public final java.util.concurrent.CompletableFuture<common.emv.kernel.TransactionOutcome> f7094a;
        public final common.emv.kernel.TransactionRequest b;
        public final common.emv.kernel.TransactionEventListener c;
        public final java.util.List<zb.e> d;
        public final zb.f e;

        @Override // common.emv.cardio.CardIOSessionListener
        public void onCardDetected(common.emv.cardio.CardIO cardIO, common.emv.cardio.CardSession cardSession) {
            if (common.emv.util.Logger.isLogEnable()) {
                this.f7094a.isCancelled();
                this.f7094a.isDone();
                this.f7094a.isCompletedExceptionally();
            }
            if (this.f7094a.isDone() || this.f7094a.isCancelled()) {
                cardSession.close();
                cardIO.disable();
            } else {
                this.c.updateUI(common.emv.kernel.TransactionOutcome.StandardMessage.Processing);
                this.b.markCardDetectedTimestamp();
                this.e.a(this.f7094a, new zb.a(cardSession, this.b.getIoSpent()), this.b, this.c, this.d);
            }
        }

        @Override // common.emv.cardio.CardIOSessionListener
        public void onCardDetectFailed(common.emv.cardio.CardIO cardIO) {
            common.emv.kernel.TransactionOutcome transactionOutcome = new common.emv.kernel.TransactionOutcome(this.b, common.emv.kernel.TransactionOutcome.Outcome.EndApplication);
            transactionOutcome.setUiReqOnOutcome(new common.emv.kernel.TransactionOutcome.UserInterfaceRequestData(common.emv.kernel.TransactionOutcome.StandardMessage.InsertSwipeOrTryAnotherCard, common.emv.kernel.TransactionOutcome.Status.ReadyToRead));
            this.f7094a.complete(transactionOutcome);
        }

        public a(zb.f fVar, java.util.concurrent.CompletableFuture<common.emv.kernel.TransactionOutcome> completableFuture, common.emv.kernel.TransactionRequest transactionRequest, common.emv.kernel.TransactionEventListener transactionEventListener, java.util.List<zb.e> list) {
            this.e = fVar;
            this.f7094a = completableFuture;
            this.b = transactionRequest;
            this.c = transactionEventListener;
            this.d = list;
        }
    }

    public static /* synthetic */ void a(common.emv.kernel.TransactionRequest transactionRequest, zb.e eVar) {
        byte[] terminalTransactionQualifier = eVar.c.getEntryConfigurationData(transactionRequest.getTransactionData().getTransactionType()).getTerminalTransactionQualifier();
        eVar.e = terminalTransactionQualifier == null ? null : java.util.Arrays.copyOf(terminalTransactionQualifier, terminalTransactionQualifier.length);
        eVar.f = 0;
    }

    public f(common.emv.cardio.CardIO cardIO) {
        this.d = cardIO;
    }
}
