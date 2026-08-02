package org.betup.utils;

/* loaded from: classes4.dex */
public final class BetHelper {
    private BetHelper() {
    }

    public enum BetType {
        WIN_1(1),
        WIN_2(3),
        DRAW(2),
        ANOTHER(4);

        private int id;

        BetType(int id) {
            this.id = id;
        }

        @Override // java.lang.Enum
        public String toString() {
            return String.valueOf(this.id);
        }

        public int getId() {
            return this.id;
        }
    }

    public enum BetGroupType {
        WHO_WILL_WIN(1),
        DOUBLE_CHANCE(2),
        HANDICAP(3),
        TOTAL(4);

        private int id;

        BetGroupType(int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }
    }

    public static BetType getTypeById(int id) {
        if (id == 1) {
            return BetType.WIN_1;
        }
        if (id == 2) {
            return BetType.DRAW;
        }
        if (id == 3) {
            return BetType.WIN_2;
        }
        return BetType.ANOTHER;
    }

    public static boolean areCoefsEqual(float a, float b) {
        return Math.abs(a - b) < 0.001f;
    }
}
