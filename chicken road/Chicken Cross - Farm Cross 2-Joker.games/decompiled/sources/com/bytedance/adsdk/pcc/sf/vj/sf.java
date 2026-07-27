package com.bytedance.adsdk.pcc.sf.vj;

import com.bytedance.adsdk.pcc.sf.oo.gm;
import com.bytedance.adsdk.pcc.sf.oo.oo;
import com.bytedance.adsdk.pcc.sf.sf.pcc.gbb;
import com.bytedance.adsdk.pcc.sf.sf.pcc.gpj;
import com.bytedance.adsdk.pcc.sf.sf.pcc.hc;
import com.bytedance.adsdk.pcc.sf.sf.pcc.kj;
import com.bytedance.adsdk.pcc.sf.sf.pcc.lu;
import com.bytedance.adsdk.pcc.sf.sf.pcc.nac;
import com.bytedance.adsdk.pcc.sf.sf.pcc.tmg;
import com.bytedance.adsdk.pcc.sf.sf.pcc.vh;
import com.bytedance.adsdk.pcc.sf.sf.pcc.vj;
import com.bytedance.adsdk.pcc.sf.sf.pcc.vy;
import com.bytedance.adsdk.pcc.sf.sf.pcc.wh;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes5.dex */
public class sf {
    public static com.bytedance.adsdk.pcc.sf.sf.pcc pcc(List<com.bytedance.adsdk.pcc.sf.sf.pcc> list, String str, int i) {
        gm(list, str, i);
        Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> pcc = pcc(sf(list, str, i));
        if (pcc.size() != 1) {
            throw new IllegalStateException();
        }
        return pcc.getFirst();
    }

    private static Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> pcc(Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.pcc.sf.sf.pcc pccVar : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.pcc.sf.sf.pcc) linkedList.peekLast()).pcc() == gm.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.pcc.sf.sf.pcc pccVar2 = (com.bytedance.adsdk.pcc.sf.sf.pcc) linkedList.pollLast();
                if (((com.bytedance.adsdk.pcc.sf.sf.pcc) linkedList.pollLast()).pcc() != gm.QUESTION) {
                    throw new IllegalStateException();
                }
                com.bytedance.adsdk.pcc.sf.sf.pcc pccVar3 = (com.bytedance.adsdk.pcc.sf.sf.pcc) linkedList.pollLast();
                gpj gpjVar = new gpj();
                gpjVar.pcc(pccVar3);
                gpjVar.sf(pccVar2);
                gpjVar.gm(pccVar);
                linkedList.addLast(gpjVar);
            } else {
                linkedList.addLast(pccVar);
            }
        }
        return linkedList;
    }

    private static Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> sf(List<com.bytedance.adsdk.pcc.sf.sf.pcc> list, String str, int i) {
        LinkedList<com.bytedance.adsdk.pcc.sf.sf.pcc> linkedList = new LinkedList(list);
        int i2 = 5;
        while (i2 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.pcc.sf.sf.pcc pccVar : linkedList) {
                if (!linkedList2.isEmpty() && gm.pcc(((com.bytedance.adsdk.pcc.sf.sf.pcc) linkedList2.peekLast()).pcc()) && ((gm) ((com.bytedance.adsdk.pcc.sf.sf.pcc) linkedList2.peekLast()).pcc()).sf() == i2) {
                    com.bytedance.adsdk.pcc.sf.sf.pcc pccVar2 = (com.bytedance.adsdk.pcc.sf.sf.pcc) linkedList2.pollLast();
                    com.bytedance.adsdk.pcc.sf.sf.pcc pccVar3 = (com.bytedance.adsdk.pcc.sf.sf.pcc) linkedList2.pollLast();
                    if (!gm.pcc(pccVar3.pcc()) && !gm.pcc(pccVar.pcc())) {
                        linkedList2.addLast(pcc(pccVar3, pccVar2, pccVar));
                    } else {
                        throw new IllegalArgumentException(str.substring(0, i));
                    }
                } else {
                    linkedList2.addLast(pccVar);
                }
            }
            i2--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    private static void gm(List<com.bytedance.adsdk.pcc.sf.sf.pcc> list, String str, int i) {
        Iterator<com.bytedance.adsdk.pcc.sf.sf.pcc> it = list.iterator();
        while (it.hasNext()) {
            if (oo.pcc(it.next().pcc())) {
                throw new IllegalArgumentException(str.substring(0, i));
            }
        }
    }

    /* renamed from: com.bytedance.adsdk.pcc.sf.vj.sf$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[gm.values().length];
            pcc = iArr;
            try {
                iArr[gm.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[gm.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pcc[gm.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                pcc[gm.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                pcc[gm.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                pcc[gm.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                pcc[gm.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                pcc[gm.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                pcc[gm.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                pcc[gm.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                pcc[gm.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                pcc[gm.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                pcc[gm.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static com.bytedance.adsdk.pcc.sf.sf.pcc pcc(com.bytedance.adsdk.pcc.sf.sf.pcc pccVar, com.bytedance.adsdk.pcc.sf.sf.pcc pccVar2, com.bytedance.adsdk.pcc.sf.sf.pcc pccVar3) {
        nac vhVar;
        switch (AnonymousClass1.pcc[((gm) pccVar2.pcc()).ordinal()]) {
            case 1:
                vhVar = new vh();
                break;
            case 2:
                vhVar = new lu();
                break;
            case 3:
                vhVar = new com.bytedance.adsdk.pcc.sf.sf.pcc.pcc();
                break;
            case 4:
                vhVar = new hc();
                break;
            case 5:
                vhVar = new tmg();
                break;
            case 6:
                vhVar = new com.bytedance.adsdk.pcc.sf.sf.pcc.oo();
                break;
            case 7:
                vhVar = new gbb();
                break;
            case 8:
                vhVar = new wh();
                break;
            case 9:
                vhVar = new vy();
                break;
            case 10:
                vhVar = new vj();
                break;
            case 11:
                vhVar = new kj();
                break;
            case 12:
                vhVar = new com.bytedance.adsdk.pcc.sf.sf.pcc.sf();
                break;
            case 13:
                vhVar = new com.bytedance.adsdk.pcc.sf.sf.pcc.gm();
                break;
            default:
                throw new UnsupportedOperationException(pccVar2.pcc().toString());
        }
        vhVar.pcc(pccVar);
        vhVar.sf(pccVar3);
        return vhVar;
    }

    public static boolean pcc(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
