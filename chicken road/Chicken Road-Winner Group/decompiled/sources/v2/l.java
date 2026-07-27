package v2;

import d2.C0274d;
import java.util.NoSuchElementException;
import o2.p;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ char[] f10431a;

    public /* synthetic */ l(char[] cArr) {
        this.f10431a = cArr;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        int i3;
        CharSequence DelimitedRangesSequence = (CharSequence) obj;
        int intValue = ((Integer) obj2).intValue();
        kotlin.jvm.internal.j.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        char[] cArr = this.f10431a;
        kotlin.jvm.internal.j.e(DelimitedRangesSequence, "<this>");
        if (cArr.length == 1 && (DelimitedRangesSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            i3 = ((String) DelimitedRangesSequence).indexOf(cArr[0], intValue);
        } else {
            if (intValue < 0) {
                intValue = 0;
            }
            int l0 = m.l0(DelimitedRangesSequence);
            if (intValue <= l0) {
                loop0: while (true) {
                    char charAt = DelimitedRangesSequence.charAt(intValue);
                    for (char c3 : cArr) {
                        if (c3 == charAt) {
                            i3 = intValue;
                            break loop0;
                        }
                    }
                    if (intValue == l0) {
                        break;
                    }
                    intValue++;
                }
            }
            i3 = -1;
        }
        if (i3 < 0) {
            return null;
        }
        return new C0274d(Integer.valueOf(i3), 1);
    }
}
