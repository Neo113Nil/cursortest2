package Kg0;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15968c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f15966a = i11;
        this.f15967b = obj;
        this.f15968c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i11) {
        switch (this.f15966a) {
            case 0:
                Function1 function1 = (Function1) this.f15967b;
                if (i11 != 0) {
                    function1.invoke(null);
                    break;
                } else {
                    function1.invoke((Bitmap) this.f15968c);
                    break;
                }
            default:
                ((AtomicBoolean) this.f15967b).set(i11 == 0);
                ((CountDownLatch) this.f15968c).countDown();
                break;
        }
    }
}
