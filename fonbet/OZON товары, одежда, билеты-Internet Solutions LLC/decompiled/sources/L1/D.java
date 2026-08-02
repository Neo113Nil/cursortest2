package L1;

import io.sentry.InterfaceC7134d0;
import java.util.Comparator;
import kotlin.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16148a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f16148a) {
            case 0:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return (((Number) pair.f()).intValue() - ((Number) pair.e()).intValue()) - (((Number) pair2.f()).intValue() - ((Number) pair2.e()).intValue());
            default:
                InterfaceC7134d0 interfaceC7134d0 = (InterfaceC7134d0) obj;
                InterfaceC7134d0 interfaceC7134d02 = (InterfaceC7134d0) obj2;
                if (interfaceC7134d0 == interfaceC7134d02) {
                    return 0;
                }
                int compareTo = interfaceC7134d0.s().compareTo(interfaceC7134d02.s());
                return compareTo != 0 ? compareTo : interfaceC7134d0.e().l().toString().compareTo(interfaceC7134d02.e().l().toString());
        }
    }
}
