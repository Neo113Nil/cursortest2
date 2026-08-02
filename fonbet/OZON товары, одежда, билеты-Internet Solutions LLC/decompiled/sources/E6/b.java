package E6;

import E6.e;
import E6.e.d;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ImageView;

/* loaded from: classes8.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private int f7538a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f7539b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final ScaleGestureDetector f7540c;

    /* renamed from: d, reason: collision with root package name */
    private VelocityTracker f7541d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7542e;

    /* renamed from: f, reason: collision with root package name */
    private float f7543f;

    /* renamed from: g, reason: collision with root package name */
    private float f7544g;

    /* renamed from: h, reason: collision with root package name */
    private final float f7545h;

    /* renamed from: i, reason: collision with root package name */
    private final float f7546i;

    /* renamed from: j, reason: collision with root package name */
    private e.a f7547j;

    b(Context context, e.a aVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7546i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7545h = viewConfiguration.getScaledTouchSlop();
        this.f7547j = aVar;
        this.f7540c = new ScaleGestureDetector(context, new a(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f7, code lost:
    
        if (r8 <= (-1.0f)) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e(MotionEvent motionEvent) {
        float x11;
        float y11;
        float x12;
        float y12;
        e.d dVar;
        e.d dVar2;
        float x13;
        float y13;
        b bVar;
        boolean z11;
        b bVar2;
        boolean z12;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            e.a aVar = this.f7547j;
            if (action == 1) {
                this.f7538a = -1;
                if (this.f7542e && this.f7541d != null) {
                    try {
                        x12 = motionEvent.getX(this.f7539b);
                    } catch (Exception unused) {
                        x12 = motionEvent.getX();
                    }
                    this.f7543f = x12;
                    try {
                        y12 = motionEvent.getY(this.f7539b);
                    } catch (Exception unused2) {
                        y12 = motionEvent.getY();
                    }
                    this.f7544g = y12;
                    this.f7541d.addMovement(motionEvent);
                    this.f7541d.computeCurrentVelocity(1000);
                    float xVelocity = this.f7541d.getXVelocity();
                    float yVelocity = this.f7541d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f7546i) {
                        e eVar = e.this;
                        eVar.f7566s = eVar.new d(eVar.f7555h.getContext());
                        dVar = eVar.f7566s;
                        ImageView imageView = eVar.f7555h;
                        int width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
                        ImageView imageView2 = eVar.f7555h;
                        dVar.b(width, (imageView2.getHeight() - imageView2.getPaddingTop()) - imageView2.getPaddingBottom(), (int) (-xVelocity), (int) (-yVelocity));
                        ImageView imageView3 = eVar.f7555h;
                        dVar2 = eVar.f7566s;
                        imageView3.post(dVar2);
                    }
                }
                VelocityTracker velocityTracker = this.f7541d;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f7541d = null;
                }
            } else if (action == 2) {
                try {
                    x13 = motionEvent.getX(this.f7539b);
                } catch (Exception unused3) {
                    x13 = motionEvent.getX();
                }
                try {
                    y13 = motionEvent.getY(this.f7539b);
                } catch (Exception unused4) {
                    y13 = motionEvent.getY();
                }
                float f7 = x13 - this.f7543f;
                float f11 = y13 - this.f7544g;
                if (!this.f7542e) {
                    this.f7542e = Math.sqrt((double) ((f11 * f11) + (f7 * f7))) >= ((double) this.f7545h);
                }
                if (this.f7542e) {
                    e eVar2 = e.this;
                    bVar = eVar2.f7557j;
                    if (!bVar.f7540c.isInProgress()) {
                        eVar2.f7560m.postTranslate(f7, f11);
                        eVar2.r();
                        ViewParent parent = eVar2.f7555h.getParent();
                        z11 = eVar2.f7553f;
                        if (z11) {
                            bVar2 = eVar2.f7557j;
                            if (!bVar2.f7540c.isInProgress()) {
                                z12 = eVar2.f7554g;
                                if (!z12) {
                                    i11 = eVar2.f7567t;
                                    if (i11 != 2) {
                                        i12 = eVar2.f7567t;
                                        if (i12 != 0 || f7 < 1.0f) {
                                            i13 = eVar2.f7567t;
                                            if (i13 != 1 || f7 > -1.0f) {
                                                i14 = eVar2.f7568u;
                                                if (i14 != 0 || f11 < 1.0f) {
                                                    i15 = eVar2.f7568u;
                                                    if (i15 == 1) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(false);
                                    }
                                }
                            }
                        }
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.f7543f = x13;
                    this.f7544g = y13;
                    VelocityTracker velocityTracker2 = this.f7541d;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                }
            } else if (action == 3) {
                this.f7538a = -1;
                VelocityTracker velocityTracker3 = this.f7541d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f7541d = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == this.f7538a) {
                    int i16 = action2 != 0 ? 0 : 1;
                    this.f7538a = motionEvent.getPointerId(i16);
                    this.f7543f = motionEvent.getX(i16);
                    this.f7544g = motionEvent.getY(i16);
                }
            }
        } else {
            this.f7538a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f7541d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.f7539b);
            } catch (Exception unused5) {
                x11 = motionEvent.getX();
            }
            this.f7543f = x11;
            try {
                y11 = motionEvent.getY(this.f7539b);
            } catch (Exception unused6) {
                y11 = motionEvent.getY();
            }
            this.f7544g = y11;
            this.f7542e = false;
        }
        int i17 = this.f7538a;
        this.f7539b = motionEvent.findPointerIndex(i17 != -1 ? i17 : 0);
    }

    public final boolean b() {
        return this.f7542e;
    }

    public final boolean c() {
        return this.f7540c.isInProgress();
    }

    public final void d(MotionEvent motionEvent) {
        try {
            this.f7540c.onTouchEvent(motionEvent);
            e(motionEvent);
        } catch (IllegalArgumentException unused) {
        }
    }
}
