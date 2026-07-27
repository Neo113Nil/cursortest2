package com.bytedance.adsdk.pcc.sf.gm.pcc;

import java.util.Deque;
import java.util.LinkedList;

/* loaded from: classes5.dex */
public class vy extends wh {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r0.pcc() != com.bytedance.adsdk.pcc.sf.oo.sf.METHOD) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r0 = (com.bytedance.adsdk.pcc.sf.sf.pcc.ork) r0;
        r1 = new java.util.LinkedList();
        r2 = new java.util.LinkedList();
        r11 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r11.hasNext() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r4 = (com.bytedance.adsdk.pcc.sf.sf.pcc) r11.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r4.pcc() != com.bytedance.adsdk.pcc.sf.oo.oo.COMMA) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        r2.addLast(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r1.add(com.bytedance.adsdk.pcc.sf.vj.sf.pcc(r2, r8, r9));
        r2.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r2.isEmpty() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        r1.add(com.bytedance.adsdk.pcc.sf.vj.sf.pcc(r2, r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        r0.pcc((com.bytedance.adsdk.pcc.sf.sf.pcc[]) r1.toArray(new com.bytedance.adsdk.pcc.sf.sf.pcc[r1.size()]));
        r0.pcc(true);
        r9 = r9 + 1;
        r10.push(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        r10.push(com.bytedance.adsdk.pcc.sf.vj.sf.pcc(r11, r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
    
        return r9 + 1;
     */
    @Override // com.bytedance.adsdk.pcc.sf.gm.pcc.wh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int pcc(String str, int i, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque, com.bytedance.adsdk.pcc.sf.gm.pcc pccVar) {
        if (')' != pcc(i, str)) {
            return pccVar.pcc(str, i, deque);
        }
        LinkedList linkedList = new LinkedList();
        while (true) {
            com.bytedance.adsdk.pcc.sf.sf.pcc pollFirst = deque.pollFirst();
            if (pollFirst == null || pollFirst.pcc() == com.bytedance.adsdk.pcc.sf.oo.oo.LEFT_PAREN || ((pollFirst instanceof com.bytedance.adsdk.pcc.sf.sf.pcc.ork) && pollFirst.pcc() == com.bytedance.adsdk.pcc.sf.oo.sf.METHOD && !((com.bytedance.adsdk.pcc.sf.sf.pcc.ork) pollFirst).gm())) {
                break;
            }
            linkedList.addFirst(pollFirst);
        }
        throw new IllegalArgumentException(str.substring(0, i));
    }
}
