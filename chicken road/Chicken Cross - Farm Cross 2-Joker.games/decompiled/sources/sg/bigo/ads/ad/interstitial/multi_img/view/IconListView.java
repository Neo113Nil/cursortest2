package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.R;
import sg.bigo.ads.h.X;
import sg.bigo.ads.h.Y;
import sg.bigo.ads.v.g;
import sg.bigo.ads.v.h;
import sg.bigo.ads.v.i;
import sg.bigo.ads.v.j;

/* loaded from: classes3.dex */
public class IconListView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12682a;
    public ArrayList b;

    public IconListView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
    
        if (r7.f12682a != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x002c, code lost:
    
        r4 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x002a, code lost:
    
        if (r7.f12682a != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0033, code lost:
    
        if (r7.f12682a != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0040, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x003d, code lost:
    
        if (r7.f12682a != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Y y) {
        ArrayList a2;
        removeAllViews();
        if (y == null) {
            return;
        }
        Context context = getContext();
        int i = y.f12864a;
        if (i != 1) {
            int i2 = 4;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || !y.d) {
                        return;
                    }
                } else if (y.d) {
                }
                a2 = a(context, i2, y.c);
                this.b = a2;
                if (A.a(this.b)) {
                    for (int i3 = 0; i3 < this.b.size(); i3++) {
                        if (i3 > 0) {
                            AbstractC4944a.a(getContext(), this.f12682a ? R.layout.bigo_ad_layout_space : R.layout.bigo_ad_layout_space_black, this, true);
                        }
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                        layoutParams.weight = 1.0f;
                        addView(((g) this.b.get(i3)).b, layoutParams);
                    }
                    return;
                }
                return;
            }
            if (!y.d) {
            }
        } else if (!y.d) {
            return;
        }
        a2 = a(context, 0, y.c);
        this.b = a2;
        if (A.a(this.b)) {
        }
    }

    public List<g> getItems() {
        return this.b;
    }

    public void setThemeWhite(boolean z) {
        this.f12682a = z;
    }

    public IconListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final ArrayList a(Context context, int i, String str) {
        j jVar;
        i iVar;
        ArrayList arrayList = new ArrayList();
        if (i == 1 || i == 2 || i == 4 || i == 8) {
            X[] values = X.values();
            ArrayList arrayList2 = new ArrayList();
            for (X x : values) {
                int i2 = x.f12861a;
                if ((i2 & i) > 0 || i2 == i) {
                    arrayList2.add(x);
                }
            }
            Random random = new Random();
            while (!arrayList2.isEmpty()) {
                arrayList.add(new g(context, (X) arrayList2.remove(random.nextInt(arrayList2.size())), str, this.f12682a));
            }
        } else {
            boolean z = this.f12682a;
            if (z) {
                jVar = new j(context, X.STAR_WHITE, str, z);
                arrayList.add(jVar);
                arrayList.add(new h(context, X.DOWNLOAD_NUM_WHITE, str, this.f12682a));
                iVar = new i(context, X.Everyone_WHITE, str, this.f12682a);
            } else {
                jVar = new j(context, X.STAR, str, z);
                arrayList.add(jVar);
                arrayList.add(new h(context, X.DOWNLOAD_NUM, str, this.f12682a));
                iVar = new i(context, X.Everyone, str, this.f12682a);
            }
            arrayList.add(iVar);
        }
        return arrayList;
    }

    public IconListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12682a = false;
        setOrientation(0);
        setGravity(17);
    }
}
