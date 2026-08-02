package Pf;

import com.vk.id.internal.ipc.IPCClientBaseProvider;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final /* synthetic */ class k implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22481a;

    public /* synthetic */ k(int i11) {
        this.f22481a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int providerComparator$lambda$0;
        String str = (String) obj;
        String str2 = (String) obj2;
        switch (this.f22481a) {
            case 0:
                return str2.length() - str.length();
            default:
                providerComparator$lambda$0 = IPCClientBaseProvider.providerComparator$lambda$0(str, str2);
                return providerComparator$lambda$0;
        }
    }
}
