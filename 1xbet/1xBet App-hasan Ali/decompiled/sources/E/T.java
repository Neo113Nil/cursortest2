package E;

import A0.J0;
import android.view.KeyEvent;
import r0.AbstractC2346c;
import r0.C2344a;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1080a;

    public /* synthetic */ T(int i) {
        this.f1080a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a7, code lost:
    
        if (r0.C2344a.a(t3.AbstractC2425d.b(r10.getKeyCode()), E.AbstractC0100g0.f1161g) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x027e, code lost:
    
        if (r0.C2344a.a(r0, E.AbstractC0100g0.f1170q) != false) goto L197;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(KeyEvent keyEvent) {
        int i;
        int i5 = 20;
        switch (this.f1080a) {
            case 0:
                int i6 = U.f1081l;
                if (!keyEvent.isCtrlPressed() || !keyEvent.isShiftPressed()) {
                    if (keyEvent.isCtrlPressed()) {
                        long q5 = AbstractC2346c.q(keyEvent);
                        if (!(C2344a.a(q5, AbstractC0100g0.f1157b) ? true : C2344a.a(q5, AbstractC0100g0.f1170q))) {
                            if (!C2344a.a(q5, AbstractC0100g0.f1159d)) {
                                if (!C2344a.a(q5, AbstractC0100g0.f)) {
                                    if (C2344a.a(q5, AbstractC0100g0.f1156a)) {
                                        return 26;
                                    }
                                    if (!C2344a.a(q5, AbstractC0100g0.f1160e)) {
                                        if (C2344a.a(q5, AbstractC0100g0.f1161g)) {
                                            return 46;
                                        }
                                        return 0;
                                    }
                                    return 47;
                                }
                                return 19;
                            }
                            return 18;
                        }
                        return 17;
                    }
                    if (!keyEvent.isCtrlPressed()) {
                        if (!keyEvent.isShiftPressed()) {
                            long b3 = AbstractC2425d.b(keyEvent.getKeyCode());
                            if (C2344a.a(b3, AbstractC0100g0.i)) {
                                return 1;
                            }
                            if (C2344a.a(b3, AbstractC0100g0.f1163j)) {
                                return 2;
                            }
                            if (C2344a.a(b3, AbstractC0100g0.f1164k)) {
                                return 11;
                            }
                            if (C2344a.a(b3, AbstractC0100g0.f1165l)) {
                                return 12;
                            }
                            if (C2344a.a(b3, AbstractC0100g0.f1166m)) {
                                return 13;
                            }
                            if (C2344a.a(b3, AbstractC0100g0.f1167n)) {
                                return 14;
                            }
                            if (C2344a.a(b3, AbstractC0100g0.f1168o)) {
                                return 7;
                            }
                            if (C2344a.a(b3, AbstractC0100g0.f1169p)) {
                                return 8;
                            }
                            if (C2344a.a(b3, AbstractC0100g0.f1171r)) {
                                return 44;
                            }
                            if (C2344a.a(b3, AbstractC0100g0.f1172s)) {
                                return 20;
                            }
                            if (C2344a.a(b3, AbstractC0100g0.f1173t)) {
                                return 21;
                            }
                            if (!C2344a.a(b3, AbstractC0100g0.f1174u)) {
                                if (!C2344a.a(b3, AbstractC0100g0.f1175v)) {
                                    if (!C2344a.a(b3, AbstractC0100g0.f1176w)) {
                                        if (C2344a.a(b3, AbstractC0100g0.f1177x)) {
                                            return 45;
                                        }
                                    }
                                    return 17;
                                }
                                return 19;
                            }
                            return 18;
                        }
                        long b5 = AbstractC2425d.b(keyEvent.getKeyCode());
                        if (!C2344a.a(b5, AbstractC0100g0.i)) {
                            if (!C2344a.a(b5, AbstractC0100g0.f1163j)) {
                                if (!C2344a.a(b5, AbstractC0100g0.f1164k)) {
                                    if (!C2344a.a(b5, AbstractC0100g0.f1165l)) {
                                        if (!C2344a.a(b5, AbstractC0100g0.f1166m)) {
                                            if (!C2344a.a(b5, AbstractC0100g0.f1167n)) {
                                                if (!C2344a.a(b5, AbstractC0100g0.f1168o)) {
                                                    if (!C2344a.a(b5, AbstractC0100g0.f1169p)) {
                                                        break;
                                                    } else {
                                                        return 40;
                                                    }
                                                } else {
                                                    return 39;
                                                }
                                            } else {
                                                return 32;
                                            }
                                        } else {
                                            return 31;
                                        }
                                    } else {
                                        return 30;
                                    }
                                } else {
                                    return 29;
                                }
                            } else {
                                return 28;
                            }
                        } else {
                            return 27;
                        }
                    }
                    return 0;
                }
                break;
                break;
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                    long b6 = AbstractC2425d.b(keyEvent.getKeyCode());
                    if (C2344a.a(b6, AbstractC0100g0.i)) {
                        i = 41;
                    } else if (C2344a.a(b6, AbstractC0100g0.f1163j)) {
                        i = 42;
                    } else if (C2344a.a(b6, AbstractC0100g0.f1164k)) {
                        i = 33;
                    } else {
                        if (C2344a.a(b6, AbstractC0100g0.f1165l)) {
                            i = 34;
                        }
                        i = 0;
                    }
                } else {
                    if (keyEvent.isAltPressed()) {
                        long b7 = AbstractC2425d.b(keyEvent.getKeyCode());
                        if (C2344a.a(b7, AbstractC0100g0.i)) {
                            i = 9;
                        } else if (C2344a.a(b7, AbstractC0100g0.f1163j)) {
                            i = 10;
                        } else if (C2344a.a(b7, AbstractC0100g0.f1164k)) {
                            i = 15;
                        } else if (C2344a.a(b7, AbstractC0100g0.f1165l)) {
                            i = 16;
                        }
                    }
                    i = 0;
                }
                if (i != 0) {
                    return i;
                }
                J0 j02 = V.f1082a;
                j02.getClass();
                if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                    long b8 = AbstractC2425d.b(keyEvent.getKeyCode());
                    if (C2344a.a(b8, AbstractC0100g0.i)) {
                        i5 = 35;
                    } else if (C2344a.a(b8, AbstractC0100g0.f1163j)) {
                        i5 = 36;
                    } else if (C2344a.a(b8, AbstractC0100g0.f1164k)) {
                        i5 = 38;
                    } else {
                        if (C2344a.a(b8, AbstractC0100g0.f1165l)) {
                            i5 = 37;
                        }
                        i5 = 0;
                    }
                } else if (keyEvent.isCtrlPressed()) {
                    long b9 = AbstractC2425d.b(keyEvent.getKeyCode());
                    if (C2344a.a(b9, AbstractC0100g0.i)) {
                        i5 = 4;
                    } else if (C2344a.a(b9, AbstractC0100g0.f1163j)) {
                        i5 = 3;
                    } else if (C2344a.a(b9, AbstractC0100g0.f1164k)) {
                        i5 = 6;
                    } else if (C2344a.a(b9, AbstractC0100g0.f1165l)) {
                        i5 = 5;
                    } else if (!C2344a.a(b9, AbstractC0100g0.f1158c)) {
                        if (C2344a.a(b9, AbstractC0100g0.f1173t)) {
                            i5 = 23;
                        } else if (C2344a.a(b9, AbstractC0100g0.f1172s)) {
                            i5 = 22;
                        } else {
                            if (C2344a.a(b9, AbstractC0100g0.f1162h)) {
                                i5 = 43;
                            }
                            i5 = 0;
                        }
                    }
                } else if (keyEvent.isShiftPressed()) {
                    long b10 = AbstractC2425d.b(keyEvent.getKeyCode());
                    if (C2344a.a(b10, AbstractC0100g0.f1168o)) {
                        i5 = 41;
                    } else {
                        if (C2344a.a(b10, AbstractC0100g0.f1169p)) {
                            i5 = 42;
                        }
                        i5 = 0;
                    }
                } else {
                    if (keyEvent.isAltPressed()) {
                        long b11 = AbstractC2425d.b(keyEvent.getKeyCode());
                        if (C2344a.a(b11, AbstractC0100g0.f1172s)) {
                            i5 = 24;
                        } else if (C2344a.a(b11, AbstractC0100g0.f1173t)) {
                            i5 = 25;
                        }
                    }
                    i5 = 0;
                }
                return i5 == 0 ? ((T) j02.f304k).a(keyEvent) : i5;
        }
    }
}
