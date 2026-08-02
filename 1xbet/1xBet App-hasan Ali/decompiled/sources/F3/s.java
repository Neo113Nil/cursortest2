package F3;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s extends o {

    /* renamed from: k, reason: collision with root package name */
    public final Serializable f1560k;

    public s(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f1560k = bool;
    }

    public static boolean f(s sVar) {
        Serializable serializable = sVar.f1560k;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final BigInteger c() {
        Serializable serializable = this.f1560k;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (f(this)) {
            return BigInteger.valueOf(d().longValue());
        }
        String e3 = e();
        H3.d.d(e3);
        return new BigInteger(e3);
    }

    public final Number d() {
        Serializable serializable = this.f1560k;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new H3.k((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String e() {
        Serializable serializable = this.f1560k;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return d().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        Serializable serializable = this.f1560k;
        Serializable serializable2 = sVar.f1560k;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (f(this) && f(sVar)) {
            return ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) ? c().equals(sVar.c()) : d().longValue() == sVar.d().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
            return (serializable instanceof BigDecimal ? (BigDecimal) serializable : H3.d.i(e())).compareTo(serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : H3.d.i(sVar.e())) == 0;
        }
        double doubleValue = serializable instanceof Number ? d().doubleValue() : Double.parseDouble(e());
        double doubleValue2 = serializable2 instanceof Number ? sVar.d().doubleValue() : Double.parseDouble(sVar.e());
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f1560k;
        if (serializable == null) {
            return 31;
        }
        if (f(this)) {
            doubleToLongBits = d().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(d().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public s(Number number) {
        Objects.requireNonNull(number);
        this.f1560k = number;
    }

    public s(String str) {
        Objects.requireNonNull(str);
        this.f1560k = str;
    }
}
