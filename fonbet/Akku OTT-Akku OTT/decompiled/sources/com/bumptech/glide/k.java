package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.model.AssetUriLoader;
import com.bumptech.glide.load.model.ByteArrayLoader;
import com.bumptech.glide.load.model.ByteBufferEncoder;
import com.bumptech.glide.load.model.ByteBufferFileLoader;
import com.bumptech.glide.load.model.DataUrlLoader;
import com.bumptech.glide.load.model.DirectResourceLoader;
import com.bumptech.glide.load.model.FileLoader;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.MediaStoreFileLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.load.model.ResourceLoader;
import com.bumptech.glide.load.model.ResourceUriLoader;
import com.bumptech.glide.load.model.StreamEncoder;
import com.bumptech.glide.load.model.StringLoader;
import com.bumptech.glide.load.model.UnitModelLoader;
import com.bumptech.glide.load.model.UriLoader;
import com.bumptech.glide.load.model.UrlUriLoader;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader;
import com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader;
import com.bumptech.glide.load.model.stream.QMediaStoreUriLoader;
import com.bumptech.glide.load.model.stream.UrlLoader;
import com.bumptech.glide.load.resource.bitmap.A;
import com.bumptech.glide.load.resource.bitmap.C0686a;
import com.bumptech.glide.load.resource.bitmap.C0687b;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.r;
import com.bumptech.glide.load.resource.bitmap.t;
import com.bumptech.glide.load.resource.bitmap.v;
import com.bumptech.glide.load.resource.bitmap.w;
import com.bumptech.glide.load.resource.bitmap.y;
import com.bumptech.glide.load.resource.bytes.a;
import com.bumptech.glide.load.resource.drawable.a;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class k {
    public static i a(b bVar, ArrayList arrayList) {
        ModelLoaderRegistry modelLoaderRegistry;
        Class cls;
        com.bumptech.glide.load.k gVar;
        com.bumptech.glide.load.k wVar;
        int i;
        Class cls2;
        com.bumptech.glide.load.engine.bitmap_recycle.d dVar = bVar.a;
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar2 = bVar.d;
        f fVar = bVar.c;
        Context applicationContext = fVar.getApplicationContext();
        g gVar2 = fVar.g;
        i iVar = new i();
        com.bumptech.glide.load.resource.bitmap.j jVar = new com.bumptech.glide.load.resource.bitmap.j();
        com.bumptech.glide.provider.b bVar3 = iVar.g;
        synchronized (bVar3) {
            bVar3.a.add(jVar);
        }
        ModelLoaderRegistry modelLoaderRegistry2 = iVar.a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            o oVar = new o();
            modelLoaderRegistry = modelLoaderRegistry2;
            com.bumptech.glide.provider.b bVar4 = iVar.g;
            synchronized (bVar4) {
                cls = AssetFileDescriptor.class;
                bVar4.a.add(oVar);
            }
        } else {
            modelLoaderRegistry = modelLoaderRegistry2;
            cls = AssetFileDescriptor.class;
        }
        Resources resources = applicationContext.getResources();
        ArrayList d = iVar.d();
        com.bumptech.glide.load.resource.gif.a aVar = new com.bumptech.glide.load.resource.gif.a(applicationContext, d, dVar, bVar2);
        A a = new A(dVar, new A.g());
        com.bumptech.glide.load.resource.bitmap.l lVar = new com.bumptech.glide.load.resource.bitmap.l(iVar.d(), resources.getDisplayMetrics(), dVar, bVar2);
        if (i2 < 28 || !gVar2.a.containsKey(d.class)) {
            gVar = new com.bumptech.glide.load.resource.bitmap.g(lVar);
            wVar = new w(lVar, bVar2);
        } else {
            wVar = new r();
            gVar = new com.bumptech.glide.load.resource.bitmap.h();
        }
        if (i2 >= 28) {
            i = i2;
            iVar.c("Animation", InputStream.class, Drawable.class, new a.c(new com.bumptech.glide.load.resource.drawable.a(d, bVar2)));
            iVar.c("Animation", ByteBuffer.class, Drawable.class, new a.b(new com.bumptech.glide.load.resource.drawable.a(d, bVar2)));
        } else {
            i = i2;
        }
        com.bumptech.glide.load.resource.drawable.e eVar = new com.bumptech.glide.load.resource.drawable.e(applicationContext);
        com.bumptech.glide.load.resource.bitmap.c cVar = new com.bumptech.glide.load.resource.bitmap.c(bVar2);
        com.bumptech.glide.load.resource.transcode.a aVar2 = new com.bumptech.glide.load.resource.transcode.a();
        com.bumptech.glide.load.resource.transcode.d dVar2 = new com.bumptech.glide.load.resource.transcode.d();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        iVar.a(ByteBuffer.class, new ByteBufferEncoder());
        iVar.a(InputStream.class, new StreamEncoder(bVar2));
        iVar.c("Bitmap", ByteBuffer.class, Bitmap.class, gVar);
        iVar.c("Bitmap", InputStream.class, Bitmap.class, wVar);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            cls2 = ParcelFileDescriptor.class;
        } else {
            t tVar = new t(lVar);
            cls2 = ParcelFileDescriptor.class;
            iVar.c("Bitmap", cls2, Bitmap.class, tVar);
        }
        iVar.c("Bitmap", cls, Bitmap.class, new A(dVar, new A.c()));
        iVar.c("Bitmap", cls2, Bitmap.class, a);
        ModelLoaderRegistry modelLoaderRegistry3 = modelLoaderRegistry;
        modelLoaderRegistry3.append(Bitmap.class, Bitmap.class, UnitModelLoader.Factory.getInstance());
        iVar.c("Bitmap", Bitmap.class, Bitmap.class, new y());
        iVar.b(Bitmap.class, cVar);
        iVar.c("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0686a(resources, gVar));
        iVar.c("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0686a(resources, wVar));
        iVar.c("BitmapDrawable", cls2, BitmapDrawable.class, new C0686a(resources, a));
        iVar.b(BitmapDrawable.class, new C0687b(dVar, cVar));
        iVar.c("Animation", InputStream.class, com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.j(d, aVar, bVar2));
        iVar.c("Animation", ByteBuffer.class, com.bumptech.glide.load.resource.gif.c.class, aVar);
        iVar.b(com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.d());
        modelLoaderRegistry3.append(com.bumptech.glide.gifdecoder.a.class, com.bumptech.glide.gifdecoder.a.class, UnitModelLoader.Factory.getInstance());
        iVar.c("Bitmap", com.bumptech.glide.gifdecoder.a.class, Bitmap.class, new com.bumptech.glide.load.resource.gif.h(dVar));
        iVar.c("legacy_append", Uri.class, Drawable.class, eVar);
        iVar.c("legacy_append", Uri.class, Bitmap.class, new v(eVar, dVar));
        iVar.f(new a.C0062a());
        modelLoaderRegistry3.append(File.class, ByteBuffer.class, new ByteBufferFileLoader.Factory());
        modelLoaderRegistry3.append(File.class, InputStream.class, new FileLoader.StreamFactory());
        iVar.c("legacy_append", File.class, File.class, new com.bumptech.glide.load.resource.file.a());
        modelLoaderRegistry3.append(File.class, cls2, new FileLoader.FileDescriptorFactory());
        modelLoaderRegistry3.append(File.class, File.class, UnitModelLoader.Factory.getInstance());
        iVar.f(new k.a(bVar2));
        if (!"robolectric".equals(str)) {
            iVar.f(new ParcelFileDescriptorRewinder.a());
        }
        ModelLoaderFactory<Integer, InputStream> inputStreamFactory = DirectResourceLoader.inputStreamFactory(applicationContext);
        ModelLoaderFactory<Integer, AssetFileDescriptor> assetFileDescriptorFactory = DirectResourceLoader.assetFileDescriptorFactory(applicationContext);
        ModelLoaderFactory<Integer, Drawable> drawableFactory = DirectResourceLoader.drawableFactory(applicationContext);
        Class cls3 = Integer.TYPE;
        modelLoaderRegistry3.append(cls3, InputStream.class, inputStreamFactory);
        modelLoaderRegistry3.append(Integer.class, InputStream.class, inputStreamFactory);
        Class cls4 = cls;
        modelLoaderRegistry3.append(cls3, cls4, assetFileDescriptorFactory);
        modelLoaderRegistry3.append(Integer.class, cls4, assetFileDescriptorFactory);
        modelLoaderRegistry3.append(cls3, Drawable.class, drawableFactory);
        modelLoaderRegistry3.append(Integer.class, Drawable.class, drawableFactory);
        modelLoaderRegistry3.append(Uri.class, InputStream.class, ResourceUriLoader.newStreamFactory(applicationContext));
        iVar.a.append(Uri.class, cls4, ResourceUriLoader.newAssetFileDescriptorFactory(applicationContext));
        ResourceLoader.UriFactory uriFactory = new ResourceLoader.UriFactory(resources);
        ResourceLoader.AssetFileDescriptorFactory assetFileDescriptorFactory2 = new ResourceLoader.AssetFileDescriptorFactory(resources);
        ResourceLoader.StreamFactory streamFactory = new ResourceLoader.StreamFactory(resources);
        modelLoaderRegistry3.append(Integer.class, Uri.class, uriFactory);
        modelLoaderRegistry3.append(cls3, Uri.class, uriFactory);
        modelLoaderRegistry3.append(Integer.class, cls4, assetFileDescriptorFactory2);
        modelLoaderRegistry3.append(cls3, cls4, assetFileDescriptorFactory2);
        modelLoaderRegistry3.append(Integer.class, InputStream.class, streamFactory);
        iVar.a.append(cls3, InputStream.class, streamFactory);
        modelLoaderRegistry3.append(String.class, InputStream.class, new DataUrlLoader.StreamFactory());
        modelLoaderRegistry3.append(Uri.class, InputStream.class, new DataUrlLoader.StreamFactory());
        modelLoaderRegistry3.append(String.class, InputStream.class, new StringLoader.StreamFactory());
        modelLoaderRegistry3.append(String.class, cls2, new StringLoader.FileDescriptorFactory());
        modelLoaderRegistry3.append(String.class, cls4, new StringLoader.AssetFileDescriptorFactory());
        modelLoaderRegistry3.append(Uri.class, InputStream.class, new AssetUriLoader.StreamFactory(applicationContext.getAssets()));
        modelLoaderRegistry3.append(Uri.class, cls4, new AssetUriLoader.FileDescriptorFactory(applicationContext.getAssets()));
        modelLoaderRegistry3.append(Uri.class, InputStream.class, new MediaStoreImageThumbLoader.Factory(applicationContext));
        iVar.a.append(Uri.class, InputStream.class, new MediaStoreVideoThumbLoader.Factory(applicationContext));
        if (i >= 29) {
            iVar.a.append(Uri.class, InputStream.class, new QMediaStoreUriLoader.InputStreamFactory(applicationContext));
            iVar.a.append(Uri.class, cls2, new QMediaStoreUriLoader.FileDescriptorFactory(applicationContext));
        }
        modelLoaderRegistry3.append(Uri.class, InputStream.class, new UriLoader.StreamFactory(contentResolver));
        modelLoaderRegistry3.append(Uri.class, cls2, new UriLoader.FileDescriptorFactory(contentResolver));
        modelLoaderRegistry3.append(Uri.class, cls4, new UriLoader.AssetFileDescriptorFactory(contentResolver));
        modelLoaderRegistry3.append(Uri.class, InputStream.class, new UrlUriLoader.StreamFactory());
        modelLoaderRegistry3.append(URL.class, InputStream.class, new UrlLoader.StreamFactory());
        modelLoaderRegistry3.append(Uri.class, File.class, new MediaStoreFileLoader.Factory(applicationContext));
        modelLoaderRegistry3.append(GlideUrl.class, InputStream.class, new HttpGlideUrlLoader.Factory());
        modelLoaderRegistry3.append(byte[].class, ByteBuffer.class, new ByteArrayLoader.ByteBufferFactory());
        modelLoaderRegistry3.append(byte[].class, InputStream.class, new ByteArrayLoader.StreamFactory());
        modelLoaderRegistry3.append(Uri.class, Uri.class, UnitModelLoader.Factory.getInstance());
        modelLoaderRegistry3.append(Drawable.class, Drawable.class, UnitModelLoader.Factory.getInstance());
        iVar.c("legacy_append", Drawable.class, Drawable.class, new com.bumptech.glide.load.resource.drawable.f());
        iVar.g(Bitmap.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.transcode.b(resources));
        iVar.g(Bitmap.class, byte[].class, aVar2);
        iVar.g(Drawable.class, byte[].class, new com.bumptech.glide.load.resource.transcode.c(dVar, aVar2, dVar2));
        iVar.g(com.bumptech.glide.load.resource.gif.c.class, byte[].class, dVar2);
        A a2 = new A(dVar, new A.d());
        iVar.c("legacy_append", ByteBuffer.class, Bitmap.class, a2);
        iVar.c("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0686a(resources, a2));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.bumptech.glide.module.b bVar5 = (com.bumptech.glide.module.b) it.next();
            try {
                bVar5.a();
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(bVar5.getClass().getName()), e);
            }
        }
        return iVar;
    }
}
