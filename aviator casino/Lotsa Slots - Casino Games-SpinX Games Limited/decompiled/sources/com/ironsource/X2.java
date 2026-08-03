package com.ironsource;

/* loaded from: classes5.dex */
public interface X2 extends com.ironsource.Ib<java.lang.Integer, java.lang.Integer> {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.X2.a f6056a = new com.ironsource.X2.a();
        public static final int b = 3009;
        public static final int c = 3008;

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.X2.b f6057a = new com.ironsource.X2.b();
        public static final int b = 3002;
        public static final int c = 3005;
        public static final int d = 3300;
        public static final int e = 3503;
        public static final int f = 3504;

        private b() {
        }
    }

    public static final class c implements com.ironsource.X2 {
        @Override // com.ironsource.Ib
        public /* bridge */ /* synthetic */ java.lang.Integer a(java.lang.Integer num) {
            return a(num.intValue());
        }

        public java.lang.Integer a(int i) throws java.lang.IllegalArgumentException {
            int i2;
            if (i == 206) {
                i2 = com.ironsource.X2.b.e;
            } else if (i == 207) {
                i2 = com.ironsource.X2.b.f;
            } else if (i == 405) {
                i2 = 3009;
            } else if (i != 406) {
                switch (i) {
                    case 101:
                        i2 = 83500;
                        break;
                    case 102:
                        i2 = 83510;
                        break;
                    case 103:
                        i2 = com.ironsource.X2.d.h;
                        break;
                    case 104:
                        i2 = 83300;
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
                                break;
                            case 112:
                                i2 = 3305;
                                break;
                            case 113:
                                i2 = 3306;
                                break;
                            default:
                                switch (i) {
                                    case 201:
                                        i2 = 3002;
                                        break;
                                    case 202:
                                        i2 = 3005;
                                        break;
                                    case 203:
                                        i2 = 3300;
                                        break;
                                    default:
                                        throw new java.lang.IllegalArgumentException("Unknown event code: " + i);
                                }
                        }
                    case 105:
                        i2 = 83302;
                        break;
                }
            } else {
                i2 = 3008;
            }
            return java.lang.Integer.valueOf(i2);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.X2.d f6058a = new com.ironsource.X2.d();
        public static final int b = 83500;
        public static final int c = 83510;
        public static final int d = 83300;
        public static final int e = 83302;
        public static final int f = 83004;
        public static final int g = 88002;
        public static final int h = 83301;
        public static final int i = 83302;
        public static final int j = 3305;
        public static final int k = 3306;

        private d() {
        }
    }
}
