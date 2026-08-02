package org.modelmapper;

import java.io.Serializable;
import org.modelmapper.internal.bytebuddy.implementation.MethodDelegation;
import org.modelmapper.internal.util.Assert;
import org.modelmapper.spi.MappingContext;

/* loaded from: classes4.dex */
public class Conditions {
    private static final Condition<?, ?> IS_NULL = new AbstractCondition<Object, Object>() { // from class: org.modelmapper.Conditions.1
        private static final long serialVersionUID = 0;

        @Override // org.modelmapper.Condition
        public boolean applies(MappingContext<Object, Object> mappingContext) {
            return mappingContext.getSource() == null;
        }

        public String toString() {
            return "isNull()";
        }
    };
    private static final Condition<?, ?> IS_NOT_NULL = new AbstractCondition<Object, Object>() { // from class: org.modelmapper.Conditions.2
        private static final long serialVersionUID = 0;

        @Override // org.modelmapper.Condition
        public boolean applies(MappingContext<Object, Object> mappingContext) {
            return mappingContext.getSource() != null;
        }

        public String toString() {
            return "isNotNull()";
        }
    };

    private static class AndCondition<S, D> extends AbstractCondition<S, D> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Condition<S, D> a;
        private final Condition<S, D> b;

        AndCondition(Condition<S, D> condition, Condition<S, D> condition2) {
            this.a = condition;
            this.b = condition2;
        }

        @Override // org.modelmapper.Condition
        public boolean applies(MappingContext<S, D> mappingContext) {
            return this.a.applies(mappingContext) && this.b.applies(mappingContext);
        }

        public boolean equals(Object obj) {
            if (obj instanceof AndCondition) {
                AndCondition andCondition = (AndCondition) obj;
                if (andCondition.a.equals(this.a) && andCondition.b.equals(this.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() ^ this.b.hashCode()) * 41;
        }

        public String toString() {
            return String.format("and(%s, %s)", this.a, this.b);
        }
    }

    private static class Not<S, D> extends AbstractCondition<S, D> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Condition<S, D> delegate;

        private Not(Condition<S, D> condition) {
            this.delegate = (Condition) Assert.notNull(condition, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX);
        }

        @Override // org.modelmapper.Condition
        public boolean applies(MappingContext<S, D> mappingContext) {
            return !this.delegate.applies(mappingContext);
        }

        public boolean equals(Object obj) {
            return (obj instanceof Not) && ((Not) obj).delegate.equals(this.delegate);
        }

        public int hashCode() {
            return -this.delegate.hashCode();
        }

        public String toString() {
            return "not(" + this.delegate + ")";
        }
    }

    private static class OrCondition<S, D> extends AbstractCondition<S, D> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Condition<S, D> a;
        private final Condition<S, D> b;

        OrCondition(Condition<S, D> condition, Condition<S, D> condition2) {
            this.a = condition;
            this.b = condition2;
        }

        @Override // org.modelmapper.Condition
        public boolean applies(MappingContext<S, D> mappingContext) {
            return this.a.applies(mappingContext) || this.b.applies(mappingContext);
        }

        public boolean equals(Object obj) {
            if (obj instanceof OrCondition) {
                OrCondition orCondition = (OrCondition) obj;
                if (orCondition.a.equals(this.a) && orCondition.b.equals(this.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() ^ this.b.hashCode()) * 37;
        }

        public String toString() {
            return String.format("or(%s, %s)", this.a, this.b);
        }
    }

    public static <S, D> Condition<S, D> and(Condition<S, D> condition, Condition<S, D> condition2) {
        Assert.notNull(condition, "condition1");
        Assert.notNull(condition2, "condition2");
        return new AndCondition(condition, condition2);
    }

    public static Condition<?, ?> isNotNull() {
        return IS_NOT_NULL;
    }

    public static Condition<?, ?> isNull() {
        return IS_NULL;
    }

    public static Condition<?, ?> isType(final Class<?> cls) {
        return new Condition<Object, Object>() { // from class: org.modelmapper.Conditions.3
            @Override // org.modelmapper.Condition
            public boolean applies(MappingContext<Object, Object> mappingContext) {
                return cls.isAssignableFrom(mappingContext.getSourceType());
            }
        };
    }

    public static <S, D> Condition<S, D> not(Condition<S, D> condition) {
        Assert.notNull(condition, "condition");
        return new Not(condition);
    }

    public static <S, D> Condition<S, D> or(Condition<S, D> condition, Condition<S, D> condition2) {
        Assert.notNull(condition, "condition1");
        Assert.notNull(condition2, "condition2");
        return new OrCondition(condition, condition2);
    }
}
