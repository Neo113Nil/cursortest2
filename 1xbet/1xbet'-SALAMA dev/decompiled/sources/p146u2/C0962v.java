package p146u2;

import D3.l;
import java.util.Map;

/* JADX INFO: renamed from: u2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0962v implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16859a;

    @Override // D3.l
    public final boolean apply(Object obj) {
        switch (this.f16859a) {
            case 0:
                return ((String) obj) != null;
            default:
                return ((Map.Entry) obj).getKey() != null;
        }
    }
}
