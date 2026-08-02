package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jt1 implements Iterator {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4092j;

    /* JADX INFO: renamed from: k */
    public int f4093k = 0;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f4094l;

    public /* synthetic */ jt1(int i, Object obj) {
        this.f4092j = i;
        this.f4094l = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4092j) {
            case 0:
                return this.f4093k < ((lt1) this.f4094l).f4908j.length();
            case 1:
                return this.f4093k < ((lt1) this.f4094l).f4908j.length();
            default:
                return this.f4093k < ((dp1) this.f4094l).m1282s();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.f4092j;
        Object obj = this.f4094l;
        switch (i) {
            case 0:
                String str = ((lt1) obj).f4908j;
                int i2 = this.f4093k;
                if (i2 >= str.length()) {
                    throw new NoSuchElementException();
                }
                this.f4093k = i2 + 1;
                return new lt1(String.valueOf(i2));
            case 1:
                lt1 lt1Var = (lt1) obj;
                String str2 = lt1Var.f4908j;
                int i3 = this.f4093k;
                if (i3 >= str2.length()) {
                    throw new NoSuchElementException();
                }
                this.f4093k = i3 + 1;
                return new lt1(String.valueOf(lt1Var.f4908j.charAt(i3)));
            default:
                dp1 dp1Var = (dp1) obj;
                int i4 = this.f4093k;
                int iM1282s = dp1Var.m1282s();
                int i5 = this.f4093k;
                if (i4 >= iM1282s) {
                    throw new NoSuchElementException(j11.m2774i(new StringBuilder(String.valueOf(i5).length() + 21), "Out of bounds index: ", i5));
                }
                this.f4093k = i5 + 1;
                return dp1Var.m1283t(i5);
        }
    }
}
