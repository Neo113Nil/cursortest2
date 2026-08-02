package B0;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import v1.C10176a;
import v1.C10177b;
import v1.C10179d;
import v1.C10181f;

/* loaded from: classes8.dex */
public final class I0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final b f1406a = new b(new H0(a.f1407a));

    /* synthetic */ class a extends kotlin.jvm.internal.E {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1407a = new a(C10179d.class, "isCtrlPressed", "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z", 1);

        @Override // kotlin.jvm.internal.E, kotlin.reflect.o
        public final Object get(Object obj) {
            return Boolean.valueOf(((C10177b) obj).b().isCtrlPressed());
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H0 f1408a;

        b(H0 h02) {
            this.f1408a = h02;
        }

        public final F0 a(@NotNull KeyEvent keyEvent) {
            F0 f02 = null;
            if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                long a11 = C10181f.a(keyEvent.getKeyCode());
                if (C10176a.n(a11, Z0.i())) {
                    f02 = F0.SELECT_LEFT_WORD;
                } else if (C10176a.n(a11, Z0.j())) {
                    f02 = F0.SELECT_RIGHT_WORD;
                } else if (C10176a.n(a11, Z0.k())) {
                    f02 = F0.SELECT_PREV_PARAGRAPH;
                } else if (C10176a.n(a11, Z0.h())) {
                    f02 = F0.SELECT_NEXT_PARAGRAPH;
                }
            } else if (keyEvent.isCtrlPressed()) {
                long a12 = C10181f.a(keyEvent.getKeyCode());
                if (C10176a.n(a12, Z0.i())) {
                    f02 = F0.LEFT_WORD;
                } else if (C10176a.n(a12, Z0.j())) {
                    f02 = F0.RIGHT_WORD;
                } else if (C10176a.n(a12, Z0.k())) {
                    f02 = F0.PREV_PARAGRAPH;
                } else if (C10176a.n(a12, Z0.h())) {
                    f02 = F0.NEXT_PARAGRAPH;
                } else if (C10176a.n(a12, Z0.m())) {
                    f02 = F0.DELETE_PREV_CHAR;
                } else if (C10176a.n(a12, Z0.g())) {
                    f02 = F0.DELETE_NEXT_WORD;
                } else if (C10176a.n(a12, Z0.c())) {
                    f02 = F0.DELETE_PREV_WORD;
                } else if (C10176a.n(a12, Z0.b())) {
                    f02 = F0.DESELECT;
                }
            } else if (keyEvent.isShiftPressed()) {
                long a13 = C10181f.a(keyEvent.getKeyCode());
                if (C10176a.n(a13, Z0.p())) {
                    f02 = F0.SELECT_LINE_LEFT;
                } else if (C10176a.n(a13, Z0.o())) {
                    f02 = F0.SELECT_LINE_RIGHT;
                }
            } else if (keyEvent.isAltPressed()) {
                long a14 = C10181f.a(keyEvent.getKeyCode());
                if (C10176a.n(a14, Z0.c())) {
                    f02 = F0.DELETE_FROM_LINE_START;
                } else if (C10176a.n(a14, Z0.g())) {
                    f02 = F0.DELETE_TO_LINE_END;
                }
            }
            if (f02 != null) {
                return f02;
            }
            H0 h02 = this.f1408a;
            C10177b a15 = C10177b.a(keyEvent);
            Function1<C10177b, Boolean> function1 = h02.f1402a;
            if (function1.invoke(a15).booleanValue() && keyEvent.isShiftPressed()) {
                if (C10176a.n(C10181f.a(keyEvent.getKeyCode()), Z0.x())) {
                    return F0.REDO;
                }
            } else if (function1.invoke(C10177b.a(keyEvent)).booleanValue()) {
                long a16 = C10179d.a(keyEvent);
                if (C10176a.n(a16, Z0.d()) ? true : C10176a.n(a16, Z0.n())) {
                    return F0.COPY;
                }
                if (C10176a.n(a16, Z0.u())) {
                    return F0.PASTE;
                }
                if (C10176a.n(a16, Z0.v())) {
                    return F0.CUT;
                }
                if (C10176a.n(a16, Z0.a())) {
                    return F0.SELECT_ALL;
                }
                if (C10176a.n(a16, Z0.w())) {
                    return F0.REDO;
                }
                if (C10176a.n(a16, Z0.x())) {
                    return F0.UNDO;
                }
            } else if (!keyEvent.isCtrlPressed()) {
                if (keyEvent.isShiftPressed()) {
                    long a17 = C10181f.a(keyEvent.getKeyCode());
                    if (C10176a.n(a17, Z0.i())) {
                        return F0.SELECT_LEFT_CHAR;
                    }
                    if (C10176a.n(a17, Z0.j())) {
                        return F0.SELECT_RIGHT_CHAR;
                    }
                    if (C10176a.n(a17, Z0.k())) {
                        return F0.SELECT_UP;
                    }
                    if (C10176a.n(a17, Z0.h())) {
                        return F0.SELECT_DOWN;
                    }
                    if (C10176a.n(a17, Z0.r())) {
                        return F0.SELECT_PAGE_UP;
                    }
                    if (C10176a.n(a17, Z0.q())) {
                        return F0.SELECT_PAGE_DOWN;
                    }
                    if (C10176a.n(a17, Z0.p())) {
                        return F0.SELECT_LINE_START;
                    }
                    if (C10176a.n(a17, Z0.o())) {
                        return F0.SELECT_LINE_END;
                    }
                    if (C10176a.n(a17, Z0.n())) {
                        return F0.PASTE;
                    }
                } else {
                    long a18 = C10181f.a(keyEvent.getKeyCode());
                    if (C10176a.n(a18, Z0.i())) {
                        return F0.LEFT_CHAR;
                    }
                    if (C10176a.n(a18, Z0.j())) {
                        return F0.RIGHT_CHAR;
                    }
                    if (C10176a.n(a18, Z0.k())) {
                        return F0.UP;
                    }
                    if (C10176a.n(a18, Z0.h())) {
                        return F0.DOWN;
                    }
                    if (C10176a.n(a18, Z0.r())) {
                        return F0.PAGE_UP;
                    }
                    if (C10176a.n(a18, Z0.q())) {
                        return F0.PAGE_DOWN;
                    }
                    if (C10176a.n(a18, Z0.p())) {
                        return F0.LINE_START;
                    }
                    if (C10176a.n(a18, Z0.o())) {
                        return F0.LINE_END;
                    }
                    if (C10176a.n(a18, Z0.l())) {
                        return F0.NEW_LINE;
                    }
                    if (C10176a.n(a18, Z0.c())) {
                        return F0.DELETE_PREV_CHAR;
                    }
                    if (C10176a.n(a18, Z0.g())) {
                        return F0.DELETE_NEXT_CHAR;
                    }
                    if (C10176a.n(a18, Z0.s())) {
                        return F0.PASTE;
                    }
                    if (C10176a.n(a18, Z0.f())) {
                        return F0.CUT;
                    }
                    if (C10176a.n(a18, Z0.e())) {
                        return F0.COPY;
                    }
                    if (C10176a.n(a18, Z0.t())) {
                        return F0.TAB;
                    }
                }
            }
            return null;
        }
    }

    @NotNull
    public static final b a() {
        return f1406a;
    }
}
