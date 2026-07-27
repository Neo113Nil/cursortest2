package U;

import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.plugin.platform.C1046b;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class A implements io.flutter.plugin.platform.i {

    /* renamed from: a, reason: collision with root package name */
    public int f1477a;

    /* renamed from: b, reason: collision with root package name */
    public int f1478b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1479c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1480d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1481e;
    public final Object f;

    public A(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        this.f1477a = 0;
        this.f1478b = 0;
        this.f1481e = new Handler();
        this.f = new C1046b(this);
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f1479c = textureRegistry$ImageTextureEntry;
    }

    public void a(int i3) {
        RecyclerView recyclerView = (RecyclerView) this.f;
        D d3 = recyclerView.f2393U;
        if (i3 < 0 || i3 >= d3.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i3 + "(" + i3 + "). Item count:" + d3.a() + recyclerView.h());
        }
        boolean z3 = d3.f1485c;
        ArrayList arrayList = (ArrayList) this.f1479c;
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList2 = (ArrayList) recyclerView.f2402d.f68d;
        if (arrayList2.size() > 0) {
            RecyclerView.j((View) arrayList2.get(0));
            throw null;
        }
        ArrayList arrayList3 = (ArrayList) this.f1480d;
        if (arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            throw new ClassCastException();
        }
        int y = recyclerView.f2400c.y(i3, 0);
        if (y >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i3 + "(offset:" + y + ").state:" + d3.a() + recyclerView.h());
    }

    public void b() {
        this.f1478b = this.f1477a;
        ArrayList arrayList = (ArrayList) this.f1480d;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f1478b) {
            return;
        }
        if (arrayList.get(size) != null) {
            throw new ClassCastException();
        }
        int[] iArr = RecyclerView.f2370h0;
        throw null;
    }

    @Override // io.flutter.plugin.platform.i
    public void c(int i3, int i4) {
        ImageReader newInstance;
        ImageReader imageReader = (ImageReader) this.f1480d;
        if (imageReader != null && this.f1477a == i3 && this.f1478b == i4) {
            return;
        }
        if (imageReader != null) {
            ((TextureRegistry$ImageTextureEntry) this.f1479c).pushImage(null);
            ((ImageReader) this.f1480d).close();
            this.f1480d = null;
        }
        this.f1477a = i3;
        this.f1478b = i4;
        int i5 = Build.VERSION.SDK_INT;
        Handler handler = (Handler) this.f1481e;
        C1046b c1046b = (C1046b) this.f;
        if (i5 >= 33) {
            E.c.n();
            ImageReader.Builder i6 = E.c.i(this.f1477a, this.f1478b);
            i6.setMaxImages(4);
            i6.setImageFormat(34);
            i6.setUsage(256L);
            newInstance = i6.build();
            newInstance.setOnImageAvailableListener(c1046b, handler);
        } else {
            if (i5 < 29) {
                throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            newInstance = ImageReader.newInstance(i3, i4, 34, 4, 256L);
            newInstance.setOnImageAvailableListener(c1046b, handler);
        }
        this.f1480d = newInstance;
    }

    @Override // io.flutter.plugin.platform.i
    public int getHeight() {
        return this.f1478b;
    }

    @Override // io.flutter.plugin.platform.i
    public long getId() {
        return ((TextureRegistry$ImageTextureEntry) this.f1479c).id();
    }

    @Override // io.flutter.plugin.platform.i
    public Surface getSurface() {
        return ((ImageReader) this.f1480d).getSurface();
    }

    @Override // io.flutter.plugin.platform.i
    public int getWidth() {
        return this.f1477a;
    }

    @Override // io.flutter.plugin.platform.i
    public void release() {
        if (((ImageReader) this.f1480d) != null) {
            ((TextureRegistry$ImageTextureEntry) this.f1479c).pushImage(null);
            ((ImageReader) this.f1480d).close();
            this.f1480d = null;
        }
        this.f1479c = null;
    }

    public A(RecyclerView recyclerView) {
        this.f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1479c = arrayList;
        this.f1480d = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f1477a = 2;
        this.f1478b = 2;
    }
}
