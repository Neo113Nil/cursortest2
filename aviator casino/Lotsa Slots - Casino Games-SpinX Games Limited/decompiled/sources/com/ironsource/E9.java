package com.ironsource;

/* loaded from: classes5.dex */
public interface E9 extends com.ironsource.Ib<java.lang.Integer, java.lang.Integer> {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.E9.a f5682a = new com.ironsource.E9.a();
        public static final int b = 2201;
        public static final int c = 2203;
        public static final int d = 2005;
        public static final int e = 2210;
        public static final int f = 2006;
        public static final int g = 2204;
        public static final int h = 2507;
        public static final int i = 2211;
        public static final int j = 2212;

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.E9.b f5683a = new com.ironsource.E9.b();
        public static final int b = 2002;
        public static final int c = 2003;
        public static final int d = 2200;
        public static final int e = 2503;
        public static final int f = 2504;
        public static final int g = 2300;

        private b() {
        }
    }

    public static final class c implements com.ironsource.E9 {
        @Override // com.ironsource.Ib
        public /* bridge */ /* synthetic */ java.lang.Integer a(java.lang.Integer num) {
            return a(num.intValue());
        }

        public java.lang.Integer a(int i) throws java.lang.IllegalArgumentException {
            int i2;
            if (i == 206) {
                i2 = com.ironsource.E9.b.e;
            } else if (i == 207) {
                i2 = com.ironsource.E9.b.f;
            } else if (i == 401) {
                i2 = com.ironsource.E9.a.b;
            } else if (i == 410) {
                i2 = com.ironsource.E9.a.i;
            } else if (i != 411) {
                switch (i) {
                    case 101:
                        i2 = com.ironsource.E9.d.b;
                        break;
                    case 102:
                        i2 = com.ironsource.E9.d.c;
                        break;
                    case 103:
                        i2 = com.ironsource.E9.d.h;
                        break;
                    case 104:
                        i2 = com.ironsource.E9.d.d;
                        break;
                    case 105:
                        i2 = com.ironsource.E9.d.e;
                        break;
                    default:
                        switch (i) {
                            case 109:
                                i2 = 88002;
                                break;
                            case 110:
                                i2 = 83004;
                                break;
                            case 111:
                                i2 = com.ironsource.E9.d.i;
                                break;
                            case 112:
                                i2 = com.ironsource.E9.d.j;
                                break;
                            case 113:
                                i2 = com.ironsource.E9.d.k;
                                break;
                            default:
                                switch (i) {
                                    case 201:
                                        i2 = 2002;
                                        break;
                                    case 202:
                                        i2 = 2003;
                                        break;
                                    case 203:
                                        i2 = com.ironsource.E9.b.d;
                                        break;
                                    case 204:
                                        i2 = com.ironsource.E9.b.g;
                                        break;
                                    default:
                                        switch (i) {
                                            case 403:
                                                i2 = com.ironsource.E9.a.c;
                                                break;
                                            case com.ironsource.InterfaceC3141l1.a.b.d /* 404 */:
                                                i2 = 2005;
                                                break;
                                            case com.ironsource.InterfaceC3141l1.a.b.e /* 405 */:
                                                i2 = com.ironsource.E9.a.e;
                                                break;
                                            case com.ironsource.InterfaceC3141l1.a.b.f /* 406 */:
                                                i2 = 2006;
                                                break;
                                            case com.ironsource.InterfaceC3141l1.a.b.g /* 407 */:
                                                i2 = com.ironsource.E9.a.g;
                                                break;
                                            case com.ironsource.InterfaceC3141l1.a.b.h /* 408 */:
                                                i2 = com.ironsource.E9.a.h;
                                                break;
                                            default:
                                                throw new java.lang.IllegalArgumentException("Unknown event code: " + i);
                                        }
                                }
                        }
                }
            } else {
                i2 = com.ironsource.E9.a.j;
            }
            return java.lang.Integer.valueOf(i2);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.E9.d f5684a = new com.ironsource.E9.d();
        public static final int b = 82500;
        public static final int c = 82510;
        public static final int d = 82300;
        public static final int e = 82002;
        public static final int f = 83004;
        public static final int g = 88002;
        public static final int h = 82301;
        public static final int i = 82302;
        public static final int j = 82076;
        public static final int k = 82077;

        private d() {
        }
    }
}
