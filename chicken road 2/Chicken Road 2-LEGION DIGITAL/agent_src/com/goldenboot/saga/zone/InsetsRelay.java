package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aO\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aW\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001aW\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u0014\u0010\u001f\u001a\u00020\u0000*\u00020\u0018H\u0082\b¢\u0006\u0004\b\u001f\u0010 \u001a?\u0010'\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0016H\u0000¢\u0006\u0004\b'\u0010(\u001a#\u0010+\u001a\u00020\n*\u00020\u00162\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0000H\u0002¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"", "oldSize", "newSize", "Lcom/goldenboot/saga/zone/LayoutCurator;", "cb", "Lcom/goldenboot/saga/zone/InternalFence;", "detachStream", "(IILcom/goldenboot/saga/zone/LayoutCurator;)Lcom/goldenboot/saga/zone/InternalFence;", "diagonals", "callback", "Lcom/goldenboot/saga/zone/DpadBuilder;", "growPayload", "(Lcom/goldenboot/saga/zone/InternalFence;Lcom/goldenboot/saga/zone/LayoutCurator;)V", "releaseHeader", "(IILcom/goldenboot/saga/zone/LayoutCurator;)V", "oldStart", "oldEnd", "newStart", "newEnd", "Lcom/goldenboot/saga/zone/SlideShard;", "forward", "backward", "", "snake", "", "updateTimer", "(IIIILcom/goldenboot/saga/zone/LayoutCurator;[I[I[I)Z", "d", "flushSample", "(IIIILcom/goldenboot/saga/zone/LayoutCurator;[I[II[I)Z", "injectMetric", "popBlueprint", "(Z)I", "startX", "startY", "endX", "endY", "reverse", "data", "clipOrigin", "(IIIIZ[I)V", "i", "j", "applyTask", "([III)V", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InsetsRelay {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyTask(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    public static final void clipOrigin(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    private static final InternalFence detachStream(int i, int i2, LayoutCurator layoutCurator) {
        char c = 1;
        int i3 = ((i + i2) + 1) / 2;
        InternalFence internalFence = new InternalFence(i3 * 3);
        InternalFence internalFence2 = new InternalFence(i3 * 4);
        internalFence2.updateTimer(0, i, 0, i2);
        int i4 = (i3 * 2) + 1;
        int[] growPayload = SlideShard.growPayload(new int[i4]);
        int[] growPayload2 = SlideShard.growPayload(new int[i4]);
        int[] injectMetric = DragDeserializer.injectMetric(new int[5]);
        while (internalFence2.detachStream()) {
            int clipOrigin = internalFence2.clipOrigin();
            int clipOrigin2 = internalFence2.clipOrigin();
            int clipOrigin3 = internalFence2.clipOrigin();
            int clipOrigin4 = internalFence2.clipOrigin();
            int[] iArr = injectMetric;
            if (updateTimer(clipOrigin4, clipOrigin3, clipOrigin2, clipOrigin, layoutCurator, growPayload, growPayload2, injectMetric)) {
                char c2 = c;
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[c]) > 0) {
                    DragDeserializer.evictLayout(iArr, internalFence);
                }
                internalFence2.updateTimer(clipOrigin4, iArr[0], clipOrigin2, iArr[c2]);
                internalFence2.updateTimer(iArr[2], clipOrigin3, iArr[3], clipOrigin);
                injectMetric = iArr;
                c = c2;
            } else {
                injectMetric = iArr;
            }
        }
        internalFence.drawField();
        internalFence.flushSample(i, i2, 0);
        return internalFence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    private static final boolean flushSample(int i, int i2, int i3, int i4, LayoutCurator layoutCurator, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int releaseHeader;
        int i6;
        ?? r16;
        int i7 = (i2 - i) - (i4 - i3);
        int i8 = 1;
        boolean z = (Math.abs(i7) & 1) == 1;
        int i9 = -i5;
        int i10 = i9;
        while (i10 <= i5) {
            if (i10 == i9 || (i10 != i5 && SlideShard.releaseHeader(iArr, i10 + 1) > SlideShard.releaseHeader(iArr, i10 - 1))) {
                releaseHeader = SlideShard.releaseHeader(iArr, i10 + 1);
                i6 = releaseHeader;
            } else {
                releaseHeader = SlideShard.releaseHeader(iArr, i10 - 1);
                i6 = releaseHeader + 1;
            }
            int i11 = (i3 + (i6 - i)) - i10;
            int i12 = i11 - ((i5 != 0 ? i8 : 0) & (i6 == releaseHeader ? i8 : 0));
            while (i6 < i2 && i11 < i4) {
                if (!layoutCurator.evictLayout(i6, i11)) {
                    break;
                }
                i6++;
                i11++;
            }
            SlideShard.updateTimer(iArr, i10, i6);
            if (z) {
                int i13 = i7 - i10;
                r16 = i8;
                r16 = r16;
                if (i13 >= i9 + 1) {
                    r16 = r16;
                    if (i13 <= i5 - 1) {
                        if (SlideShard.releaseHeader(iArr2, i13) <= i6) {
                            clipOrigin(releaseHeader, i12, i6, i11, false, iArr3);
                            return r16;
                        }
                        i10 += 2;
                        i8 = r16;
                    }
                }
            } else {
                r16 = i8;
            }
            i10 += 2;
            i8 = r16;
        }
        return false;
    }

    private static final void growPayload(InternalFence internalFence, LayoutCurator layoutCurator) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < internalFence.getLastIndex()) {
            int i4 = i + 2;
            int growPayload = internalFence.growPayload(i) - internalFence.growPayload(i4);
            int growPayload2 = internalFence.growPayload(i + 1) - internalFence.growPayload(i4);
            int growPayload3 = internalFence.growPayload(i4);
            i += 3;
            while (i2 < growPayload) {
                layoutCurator.growPayload(i3, i2);
                i2++;
            }
            while (i3 < growPayload2) {
                layoutCurator.detachStream(i3);
                i3++;
            }
            while (true) {
                int i5 = growPayload3 - 1;
                if (growPayload3 > 0) {
                    layoutCurator.injectMetric(i2, i3);
                    i2++;
                    i3++;
                    growPayload3 = i5;
                }
            }
        }
    }

    private static final boolean injectMetric(int i, int i2, int i3, int i4, LayoutCurator layoutCurator, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int releaseHeader;
        int i6;
        int i7;
        int i8 = (i2 - i) - (i4 - i3);
        boolean z = (i8 & 1) == 0;
        int i9 = -i5;
        for (int i10 = i9; i10 <= i5; i10 += 2) {
            if (i10 == i9 || (i10 != i5 && SlideShard.releaseHeader(iArr2, i10 + 1) < SlideShard.releaseHeader(iArr2, i10 - 1))) {
                releaseHeader = SlideShard.releaseHeader(iArr2, i10 + 1);
                i6 = releaseHeader;
            } else {
                releaseHeader = SlideShard.releaseHeader(iArr2, i10 - 1);
                i6 = releaseHeader - 1;
            }
            int i11 = i4 - ((i2 - i6) - i10);
            int i12 = ((i5 != 0 ? 1 : 0) & (i6 == releaseHeader ? 1 : 0)) + i11;
            while (i6 > i && i11 > i3) {
                if (!layoutCurator.evictLayout(i6 - 1, i11 - 1)) {
                    break;
                }
                i6--;
                i11--;
            }
            SlideShard.updateTimer(iArr2, i10, i6);
            if (z && (i7 = i8 - i10) >= i9 && i7 <= i5) {
                if (SlideShard.releaseHeader(iArr, i7) >= i6) {
                    clipOrigin(i6, i11, releaseHeader, i12, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    public static final void releaseHeader(int i, int i2, LayoutCurator layoutCurator) {
        growPayload(detachStream(i, i2, layoutCurator), layoutCurator);
    }

    private static final boolean updateTimer(int i, int i2, int i3, int i4, LayoutCurator layoutCurator, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i2 - i;
        int i6 = i4 - i3;
        if (i5 >= 1 && i6 >= 1) {
            int i7 = ((i5 + i6) + 1) / 2;
            int[] iArr4 = iArr;
            SlideShard.updateTimer(iArr4, 1, i);
            int[] iArr5 = iArr2;
            SlideShard.updateTimer(iArr5, 1, i2);
            int i8 = 0;
            while (i8 < i7) {
                if (flushSample(i, i2, i3, i4, layoutCurator, iArr4, iArr5, i8, iArr3) || injectMetric(i, i2, i3, i4, layoutCurator, iArr, iArr2, i8, iArr3)) {
                    return true;
                }
                i8++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    private static final int popBlueprint(boolean z) {
        return z ? 1 : 0;
    }
}
