package Y1;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Y1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082f extends T1.r {

    /* renamed from: a, reason: collision with root package name */
    public static final C0082f f1677a = new C0082f();

    @Override // T1.r
    public final Object readValueOfType(byte b3, ByteBuffer byteBuffer) {
        switch (b3) {
            case -127:
                Object readValue = readValue(byteBuffer);
                if (readValue == null) {
                    return null;
                }
                return m.values()[((Long) readValue).intValue()];
            case -126:
                Object readValue2 = readValue(byteBuffer);
                if (readValue2 == null) {
                    return null;
                }
                return D.values()[((Long) readValue2).intValue()];
            case -125:
                Object readValue3 = readValue(byteBuffer);
                if (readValue3 == null) {
                    return null;
                }
                return v.values()[((Long) readValue3).intValue()];
            case -124:
                Object readValue4 = readValue(byteBuffer);
                if (readValue4 == null) {
                    return null;
                }
                return EnumC0085i.values()[((Long) readValue4).intValue()];
            case -123:
                Object readValue5 = readValue(byteBuffer);
                if (readValue5 == null) {
                    return null;
                }
                return j.values()[((Long) readValue5).intValue()];
            case -122:
                Object readValue6 = readValue(byteBuffer);
                if (readValue6 == null) {
                    return null;
                }
                return z.values()[((Long) readValue6).intValue()];
            case -121:
                Object readValue7 = readValue(byteBuffer);
                if (readValue7 == null) {
                    return null;
                }
                return C.values()[((Long) readValue7).intValue()];
            case -120:
                ArrayList arrayList = (ArrayList) readValue(byteBuffer);
                B b4 = new B();
                String str = (String) arrayList.get(0);
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"productId\" is null.");
                }
                b4.f1638a = str;
                v vVar = (v) arrayList.get(1);
                if (vVar == null) {
                    throw new IllegalStateException("Nonnull field \"productType\" is null.");
                }
                b4.f1639b = vVar;
                return b4;
            case -119:
                ArrayList arrayList2 = (ArrayList) readValue(byteBuffer);
                C0083g c0083g = new C0083g();
                c0083g.f1678a = (String) arrayList2.get(0);
                c0083g.f1679b = (String) arrayList2.get(1);
                return c0083g;
            case -118:
                ArrayList arrayList3 = (ArrayList) readValue(byteBuffer);
                n nVar = new n();
                m mVar = (m) arrayList3.get(0);
                if (mVar == null) {
                    throw new IllegalStateException("Nonnull field \"responseCode\" is null.");
                }
                nVar.f1707a = mVar;
                String str2 = (String) arrayList3.get(1);
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"debugMessage\" is null.");
                }
                nVar.f1708b = str2;
                return nVar;
            case -117:
                ArrayList arrayList4 = (ArrayList) readValue(byteBuffer);
                p pVar = new p();
                Long l3 = (Long) arrayList4.get(0);
                if (l3 == null) {
                    throw new IllegalStateException("Nonnull field \"priceAmountMicros\" is null.");
                }
                pVar.f1711a = l3;
                String str3 = (String) arrayList4.get(1);
                if (str3 == null) {
                    throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
                }
                pVar.f1712b = str3;
                String str4 = (String) arrayList4.get(2);
                if (str4 == null) {
                    throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
                }
                pVar.f1713c = str4;
                return pVar;
            case -116:
                ArrayList arrayList5 = (ArrayList) readValue(byteBuffer);
                t tVar = new t();
                String str5 = (String) arrayList5.get(0);
                if (str5 == null) {
                    throw new IllegalStateException("Nonnull field \"description\" is null.");
                }
                tVar.f1722a = str5;
                String str6 = (String) arrayList5.get(1);
                if (str6 == null) {
                    throw new IllegalStateException("Nonnull field \"name\" is null.");
                }
                tVar.f1723b = str6;
                String str7 = (String) arrayList5.get(2);
                if (str7 == null) {
                    throw new IllegalStateException("Nonnull field \"productId\" is null.");
                }
                tVar.f1724c = str7;
                v vVar2 = (v) arrayList5.get(3);
                if (vVar2 == null) {
                    throw new IllegalStateException("Nonnull field \"productType\" is null.");
                }
                tVar.f1725d = vVar2;
                String str8 = (String) arrayList5.get(4);
                if (str8 == null) {
                    throw new IllegalStateException("Nonnull field \"title\" is null.");
                }
                tVar.f1726e = str8;
                tVar.f = (p) arrayList5.get(5);
                tVar.f1727g = (List) arrayList5.get(6);
                return tVar;
            case -115:
                ArrayList arrayList6 = (ArrayList) readValue(byteBuffer);
                u uVar = new u();
                n nVar2 = (n) arrayList6.get(0);
                if (nVar2 == null) {
                    throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
                }
                uVar.f1728a = nVar2;
                List list = (List) arrayList6.get(1);
                if (list == null) {
                    throw new IllegalStateException("Nonnull field \"productDetails\" is null.");
                }
                uVar.f1729b = list;
                return uVar;
            case -114:
                ArrayList arrayList7 = (ArrayList) readValue(byteBuffer);
                C0084h c0084h = new C0084h();
                n nVar3 = (n) arrayList7.get(0);
                if (nVar3 == null) {
                    throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
                }
                c0084h.f1680a = nVar3;
                String str9 = (String) arrayList7.get(1);
                if (str9 == null) {
                    throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
                }
                c0084h.f1681b = str9;
                return c0084h;
            case -113:
                ArrayList arrayList8 = (ArrayList) readValue(byteBuffer);
                k kVar = new k();
                n nVar4 = (n) arrayList8.get(0);
                if (nVar4 == null) {
                    throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
                }
                kVar.f1686a = nVar4;
                String str10 = (String) arrayList8.get(1);
                if (str10 == null) {
                    throw new IllegalStateException("Nonnull field \"countryCode\" is null.");
                }
                kVar.f1687b = str10;
                return kVar;
            case -112:
                ArrayList arrayList9 = (ArrayList) readValue(byteBuffer);
                l lVar = new l();
                String str11 = (String) arrayList9.get(0);
                if (str11 == null) {
                    throw new IllegalStateException("Nonnull field \"product\" is null.");
                }
                lVar.f1688a = str11;
                D d3 = (D) arrayList9.get(1);
                if (d3 == null) {
                    throw new IllegalStateException("Nonnull field \"replacementMode\" is null.");
                }
                lVar.f1689b = d3;
                lVar.f1690c = (String) arrayList9.get(2);
                lVar.f1691d = (String) arrayList9.get(3);
                lVar.f1692e = (String) arrayList9.get(4);
                lVar.f = (String) arrayList9.get(5);
                lVar.f1693g = (String) arrayList9.get(6);
                return lVar;
            case -111:
                ArrayList arrayList10 = (ArrayList) readValue(byteBuffer);
                s sVar = new s();
                Long l4 = (Long) arrayList10.get(0);
                if (l4 == null) {
                    throw new IllegalStateException("Nonnull field \"billingCycleCount\" is null.");
                }
                sVar.f1717a = l4;
                C c3 = (C) arrayList10.get(1);
                if (c3 == null) {
                    throw new IllegalStateException("Nonnull field \"recurrenceMode\" is null.");
                }
                sVar.f1718b = c3;
                Long l5 = (Long) arrayList10.get(2);
                if (l5 == null) {
                    throw new IllegalStateException("Nonnull field \"priceAmountMicros\" is null.");
                }
                sVar.f1719c = l5;
                String str12 = (String) arrayList10.get(3);
                if (str12 == null) {
                    throw new IllegalStateException("Nonnull field \"billingPeriod\" is null.");
                }
                sVar.f1720d = str12;
                String str13 = (String) arrayList10.get(4);
                if (str13 == null) {
                    throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
                }
                sVar.f1721e = str13;
                String str14 = (String) arrayList10.get(5);
                if (str14 == null) {
                    throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
                }
                sVar.f = str14;
                return sVar;
            case -110:
                ArrayList arrayList11 = (ArrayList) readValue(byteBuffer);
                w wVar = new w();
                wVar.f1734a = (String) arrayList11.get(0);
                String str15 = (String) arrayList11.get(1);
                if (str15 == null) {
                    throw new IllegalStateException("Nonnull field \"packageName\" is null.");
                }
                wVar.f1735b = str15;
                Long l6 = (Long) arrayList11.get(2);
                if (l6 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseTime\" is null.");
                }
                wVar.f1736c = l6;
                String str16 = (String) arrayList11.get(3);
                if (str16 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                wVar.f1737d = str16;
                String str17 = (String) arrayList11.get(4);
                if (str17 == null) {
                    throw new IllegalStateException("Nonnull field \"signature\" is null.");
                }
                wVar.f1738e = str17;
                List list2 = (List) arrayList11.get(5);
                if (list2 == null) {
                    throw new IllegalStateException("Nonnull field \"products\" is null.");
                }
                wVar.f = list2;
                Boolean bool = (Boolean) arrayList11.get(6);
                if (bool == null) {
                    throw new IllegalStateException("Nonnull field \"isAutoRenewing\" is null.");
                }
                wVar.f1739g = bool;
                String str18 = (String) arrayList11.get(7);
                if (str18 == null) {
                    throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
                }
                wVar.f1740h = str18;
                String str19 = (String) arrayList11.get(8);
                if (str19 == null) {
                    throw new IllegalStateException("Nonnull field \"developerPayload\" is null.");
                }
                wVar.f1741i = str19;
                Boolean bool2 = (Boolean) arrayList11.get(9);
                if (bool2 == null) {
                    throw new IllegalStateException("Nonnull field \"isAcknowledged\" is null.");
                }
                wVar.f1742j = bool2;
                Long l7 = (Long) arrayList11.get(10);
                if (l7 == null) {
                    throw new IllegalStateException("Nonnull field \"quantity\" is null.");
                }
                wVar.f1743k = l7;
                z zVar = (z) arrayList11.get(11);
                if (zVar == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseState\" is null.");
                }
                wVar.f1744l = zVar;
                wVar.f1745m = (C0083g) arrayList11.get(12);
                wVar.f1746n = (q) arrayList11.get(13);
                return wVar;
            case -109:
                ArrayList arrayList12 = (ArrayList) readValue(byteBuffer);
                q qVar = new q();
                List list3 = (List) arrayList12.get(0);
                if (list3 == null) {
                    throw new IllegalStateException("Nonnull field \"products\" is null.");
                }
                qVar.f1714a = list3;
                String str20 = (String) arrayList12.get(1);
                if (str20 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                qVar.f1715b = str20;
                return qVar;
            case -108:
                ArrayList arrayList13 = (ArrayList) readValue(byteBuffer);
                x xVar = new x();
                Long l8 = (Long) arrayList13.get(0);
                if (l8 == null) {
                    throw new IllegalStateException("Nonnull field \"quantity\" is null.");
                }
                xVar.f1747a = l8;
                Long l9 = (Long) arrayList13.get(1);
                if (l9 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseTime\" is null.");
                }
                xVar.f1748b = l9;
                xVar.f1749c = (String) arrayList13.get(2);
                String str21 = (String) arrayList13.get(3);
                if (str21 == null) {
                    throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
                }
                xVar.f1750d = str21;
                String str22 = (String) arrayList13.get(4);
                if (str22 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                xVar.f1751e = str22;
                String str23 = (String) arrayList13.get(5);
                if (str23 == null) {
                    throw new IllegalStateException("Nonnull field \"signature\" is null.");
                }
                xVar.f = str23;
                List list4 = (List) arrayList13.get(6);
                if (list4 == null) {
                    throw new IllegalStateException("Nonnull field \"products\" is null.");
                }
                xVar.f1752g = list4;
                return xVar;
            case -107:
                ArrayList arrayList14 = (ArrayList) readValue(byteBuffer);
                y yVar = new y();
                n nVar5 = (n) arrayList14.get(0);
                if (nVar5 == null) {
                    throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
                }
                yVar.f1753a = nVar5;
                List list5 = (List) arrayList14.get(1);
                if (list5 == null) {
                    throw new IllegalStateException("Nonnull field \"purchases\" is null.");
                }
                yVar.f1754b = list5;
                return yVar;
            case -106:
                ArrayList arrayList15 = (ArrayList) readValue(byteBuffer);
                A a3 = new A();
                n nVar6 = (n) arrayList15.get(0);
                if (nVar6 == null) {
                    throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
                }
                a3.f1636a = nVar6;
                List list6 = (List) arrayList15.get(1);
                if (list6 == null) {
                    throw new IllegalStateException("Nonnull field \"purchases\" is null.");
                }
                a3.f1637b = list6;
                return a3;
            case -105:
                ArrayList arrayList16 = (ArrayList) readValue(byteBuffer);
                E e3 = new E();
                String str24 = (String) arrayList16.get(0);
                if (str24 == null) {
                    throw new IllegalStateException("Nonnull field \"basePlanId\" is null.");
                }
                e3.f1648a = str24;
                e3.f1649b = (String) arrayList16.get(1);
                String str25 = (String) arrayList16.get(2);
                if (str25 == null) {
                    throw new IllegalStateException("Nonnull field \"offerToken\" is null.");
                }
                e3.f1650c = str25;
                List list7 = (List) arrayList16.get(3);
                if (list7 == null) {
                    throw new IllegalStateException("Nonnull field \"offerTags\" is null.");
                }
                e3.f1651d = list7;
                List list8 = (List) arrayList16.get(4);
                if (list8 == null) {
                    throw new IllegalStateException("Nonnull field \"pricingPhases\" is null.");
                }
                e3.f1652e = list8;
                e3.f = (o) arrayList16.get(5);
                return e3;
            case -104:
                ArrayList arrayList17 = (ArrayList) readValue(byteBuffer);
                F f = new F();
                f.f1653a = (String) arrayList17.get(0);
                String str26 = (String) arrayList17.get(1);
                if (str26 == null) {
                    throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
                }
                f.f1654b = str26;
                List list9 = (List) arrayList17.get(2);
                if (list9 == null) {
                    throw new IllegalStateException("Nonnull field \"products\" is null.");
                }
                f.f1655c = list9;
                return f;
            case -103:
                ArrayList arrayList18 = (ArrayList) readValue(byteBuffer);
                G g3 = new G();
                String str27 = (String) arrayList18.get(0);
                if (str27 == null) {
                    throw new IllegalStateException("Nonnull field \"id\" is null.");
                }
                g3.f1656a = str27;
                g3.f1657b = (String) arrayList18.get(1);
                v vVar3 = (v) arrayList18.get(2);
                if (vVar3 == null) {
                    throw new IllegalStateException("Nonnull field \"type\" is null.");
                }
                g3.f1658c = vVar3;
                return g3;
            case -102:
                ArrayList arrayList19 = (ArrayList) readValue(byteBuffer);
                o oVar = new o();
                Long l10 = (Long) arrayList19.get(0);
                if (l10 == null) {
                    throw new IllegalStateException("Nonnull field \"commitmentPaymentsCount\" is null.");
                }
                oVar.f1709a = l10;
                Long l11 = (Long) arrayList19.get(1);
                if (l11 == null) {
                    throw new IllegalStateException("Nonnull field \"subsequentCommitmentPaymentsCount\" is null.");
                }
                oVar.f1710b = l11;
                return oVar;
            case -101:
                ArrayList arrayList20 = (ArrayList) readValue(byteBuffer);
                r rVar = new r();
                Boolean bool3 = (Boolean) arrayList20.get(0);
                if (bool3 == null) {
                    throw new IllegalStateException("Nonnull field \"enablePrepaidPlans\" is null.");
                }
                rVar.f1716a = bool3;
                return rVar;
            default:
                return super.readValueOfType(b3, byteBuffer);
        }
    }

    @Override // T1.r
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof m) {
            byteArrayOutputStream.write(129);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((m) obj).f1706a) : null);
            return;
        }
        if (obj instanceof D) {
            byteArrayOutputStream.write(130);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((D) obj).f1647a) : null);
            return;
        }
        if (obj instanceof v) {
            byteArrayOutputStream.write(131);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((v) obj).f1733a) : null);
            return;
        }
        if (obj instanceof EnumC0085i) {
            byteArrayOutputStream.write(132);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((EnumC0085i) obj).f1683a) : null);
            return;
        }
        if (obj instanceof j) {
            byteArrayOutputStream.write(133);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((j) obj).f1685a) : null);
            return;
        }
        if (obj instanceof z) {
            byteArrayOutputStream.write(134);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((z) obj).f1759a) : null);
            return;
        }
        if (obj instanceof C) {
            byteArrayOutputStream.write(135);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((C) obj).f1644a) : null);
            return;
        }
        if (obj instanceof B) {
            byteArrayOutputStream.write(136);
            B b3 = (B) obj;
            b3.getClass();
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(b3.f1638a);
            arrayList.add(b3.f1639b);
            writeValue(byteArrayOutputStream, arrayList);
            return;
        }
        if (obj instanceof C0083g) {
            byteArrayOutputStream.write(137);
            C0083g c0083g = (C0083g) obj;
            c0083g.getClass();
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(c0083g.f1678a);
            arrayList2.add(c0083g.f1679b);
            writeValue(byteArrayOutputStream, arrayList2);
            return;
        }
        if (obj instanceof n) {
            byteArrayOutputStream.write(138);
            n nVar = (n) obj;
            nVar.getClass();
            ArrayList arrayList3 = new ArrayList(2);
            arrayList3.add(nVar.f1707a);
            arrayList3.add(nVar.f1708b);
            writeValue(byteArrayOutputStream, arrayList3);
            return;
        }
        if (obj instanceof p) {
            byteArrayOutputStream.write(139);
            p pVar = (p) obj;
            pVar.getClass();
            ArrayList arrayList4 = new ArrayList(3);
            arrayList4.add(pVar.f1711a);
            arrayList4.add(pVar.f1712b);
            arrayList4.add(pVar.f1713c);
            writeValue(byteArrayOutputStream, arrayList4);
            return;
        }
        if (obj instanceof t) {
            byteArrayOutputStream.write(140);
            t tVar = (t) obj;
            tVar.getClass();
            ArrayList arrayList5 = new ArrayList(7);
            arrayList5.add(tVar.f1722a);
            arrayList5.add(tVar.f1723b);
            arrayList5.add(tVar.f1724c);
            arrayList5.add(tVar.f1725d);
            arrayList5.add(tVar.f1726e);
            arrayList5.add(tVar.f);
            arrayList5.add(tVar.f1727g);
            writeValue(byteArrayOutputStream, arrayList5);
            return;
        }
        if (obj instanceof u) {
            byteArrayOutputStream.write(141);
            u uVar = (u) obj;
            uVar.getClass();
            ArrayList arrayList6 = new ArrayList(2);
            arrayList6.add(uVar.f1728a);
            arrayList6.add(uVar.f1729b);
            writeValue(byteArrayOutputStream, arrayList6);
            return;
        }
        if (obj instanceof C0084h) {
            byteArrayOutputStream.write(142);
            C0084h c0084h = (C0084h) obj;
            c0084h.getClass();
            ArrayList arrayList7 = new ArrayList(2);
            arrayList7.add(c0084h.f1680a);
            arrayList7.add(c0084h.f1681b);
            writeValue(byteArrayOutputStream, arrayList7);
            return;
        }
        if (obj instanceof k) {
            byteArrayOutputStream.write(143);
            k kVar = (k) obj;
            kVar.getClass();
            ArrayList arrayList8 = new ArrayList(2);
            arrayList8.add(kVar.f1686a);
            arrayList8.add(kVar.f1687b);
            writeValue(byteArrayOutputStream, arrayList8);
            return;
        }
        if (obj instanceof l) {
            byteArrayOutputStream.write(144);
            l lVar = (l) obj;
            lVar.getClass();
            ArrayList arrayList9 = new ArrayList(7);
            arrayList9.add(lVar.f1688a);
            arrayList9.add(lVar.f1689b);
            arrayList9.add(lVar.f1690c);
            arrayList9.add(lVar.f1691d);
            arrayList9.add(lVar.f1692e);
            arrayList9.add(lVar.f);
            arrayList9.add(lVar.f1693g);
            writeValue(byteArrayOutputStream, arrayList9);
            return;
        }
        if (obj instanceof s) {
            byteArrayOutputStream.write(145);
            s sVar = (s) obj;
            sVar.getClass();
            ArrayList arrayList10 = new ArrayList(6);
            arrayList10.add(sVar.f1717a);
            arrayList10.add(sVar.f1718b);
            arrayList10.add(sVar.f1719c);
            arrayList10.add(sVar.f1720d);
            arrayList10.add(sVar.f1721e);
            arrayList10.add(sVar.f);
            writeValue(byteArrayOutputStream, arrayList10);
            return;
        }
        if (obj instanceof w) {
            byteArrayOutputStream.write(146);
            w wVar = (w) obj;
            wVar.getClass();
            ArrayList arrayList11 = new ArrayList(14);
            arrayList11.add(wVar.f1734a);
            arrayList11.add(wVar.f1735b);
            arrayList11.add(wVar.f1736c);
            arrayList11.add(wVar.f1737d);
            arrayList11.add(wVar.f1738e);
            arrayList11.add(wVar.f);
            arrayList11.add(wVar.f1739g);
            arrayList11.add(wVar.f1740h);
            arrayList11.add(wVar.f1741i);
            arrayList11.add(wVar.f1742j);
            arrayList11.add(wVar.f1743k);
            arrayList11.add(wVar.f1744l);
            arrayList11.add(wVar.f1745m);
            arrayList11.add(wVar.f1746n);
            writeValue(byteArrayOutputStream, arrayList11);
            return;
        }
        if (obj instanceof q) {
            byteArrayOutputStream.write(147);
            q qVar = (q) obj;
            qVar.getClass();
            ArrayList arrayList12 = new ArrayList(2);
            arrayList12.add(qVar.f1714a);
            arrayList12.add(qVar.f1715b);
            writeValue(byteArrayOutputStream, arrayList12);
            return;
        }
        if (obj instanceof x) {
            byteArrayOutputStream.write(148);
            x xVar = (x) obj;
            xVar.getClass();
            ArrayList arrayList13 = new ArrayList(7);
            arrayList13.add(xVar.f1747a);
            arrayList13.add(xVar.f1748b);
            arrayList13.add(xVar.f1749c);
            arrayList13.add(xVar.f1750d);
            arrayList13.add(xVar.f1751e);
            arrayList13.add(xVar.f);
            arrayList13.add(xVar.f1752g);
            writeValue(byteArrayOutputStream, arrayList13);
            return;
        }
        if (obj instanceof y) {
            byteArrayOutputStream.write(149);
            y yVar = (y) obj;
            yVar.getClass();
            ArrayList arrayList14 = new ArrayList(2);
            arrayList14.add(yVar.f1753a);
            arrayList14.add(yVar.f1754b);
            writeValue(byteArrayOutputStream, arrayList14);
            return;
        }
        if (obj instanceof A) {
            byteArrayOutputStream.write(150);
            A a3 = (A) obj;
            a3.getClass();
            ArrayList arrayList15 = new ArrayList(2);
            arrayList15.add(a3.f1636a);
            arrayList15.add(a3.f1637b);
            writeValue(byteArrayOutputStream, arrayList15);
            return;
        }
        if (obj instanceof E) {
            byteArrayOutputStream.write(151);
            E e3 = (E) obj;
            e3.getClass();
            ArrayList arrayList16 = new ArrayList(6);
            arrayList16.add(e3.f1648a);
            arrayList16.add(e3.f1649b);
            arrayList16.add(e3.f1650c);
            arrayList16.add(e3.f1651d);
            arrayList16.add(e3.f1652e);
            arrayList16.add(e3.f);
            writeValue(byteArrayOutputStream, arrayList16);
            return;
        }
        if (obj instanceof F) {
            byteArrayOutputStream.write(152);
            F f = (F) obj;
            f.getClass();
            ArrayList arrayList17 = new ArrayList(3);
            arrayList17.add(f.f1653a);
            arrayList17.add(f.f1654b);
            arrayList17.add(f.f1655c);
            writeValue(byteArrayOutputStream, arrayList17);
            return;
        }
        if (obj instanceof G) {
            byteArrayOutputStream.write(153);
            G g3 = (G) obj;
            g3.getClass();
            ArrayList arrayList18 = new ArrayList(3);
            arrayList18.add(g3.f1656a);
            arrayList18.add(g3.f1657b);
            arrayList18.add(g3.f1658c);
            writeValue(byteArrayOutputStream, arrayList18);
            return;
        }
        if (obj instanceof o) {
            byteArrayOutputStream.write(154);
            o oVar = (o) obj;
            oVar.getClass();
            ArrayList arrayList19 = new ArrayList(2);
            arrayList19.add(oVar.f1709a);
            arrayList19.add(oVar.f1710b);
            writeValue(byteArrayOutputStream, arrayList19);
            return;
        }
        if (!(obj instanceof r)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(155);
        r rVar = (r) obj;
        rVar.getClass();
        ArrayList arrayList20 = new ArrayList(1);
        arrayList20.add(rVar.f1716a);
        writeValue(byteArrayOutputStream, arrayList20);
    }
}
