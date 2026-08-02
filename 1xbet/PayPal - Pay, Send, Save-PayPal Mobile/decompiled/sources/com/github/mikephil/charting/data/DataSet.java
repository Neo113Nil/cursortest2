package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public abstract class DataSet<T extends com.github.mikephil.charting.data.Entry> extends com.github.mikephil.charting.data.BaseDataSet<T> {
    protected java.util.List<T> mValues;
    protected float mXMax;
    protected float mXMin;
    protected float mYMax;
    protected float mYMin;

    public enum Rounding {
        UP,
        DOWN,
        CLOSEST
    }

    public abstract com.github.mikephil.charting.data.DataSet<T> copy();

    public DataSet(java.util.List<T> list, java.lang.String str) {
        super(str);
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mValues = list;
        if (list == null) {
            this.mValues = new java.util.ArrayList();
        }
        calcMinMax();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void calcMinMax() {
        java.util.List<T> list = this.mValues;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        java.util.Iterator<T> it = this.mValues.iterator();
        while (it.hasNext()) {
            calcMinMax(it.next());
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void calcMinMaxY(float f, float f2) {
        java.util.List<T> list = this.mValues;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        int entryIndex = getEntryIndex(f2, Float.NaN, com.github.mikephil.charting.data.DataSet.Rounding.UP);
        for (int entryIndex2 = getEntryIndex(f, Float.NaN, com.github.mikephil.charting.data.DataSet.Rounding.DOWN); entryIndex2 <= entryIndex; entryIndex2++) {
            calcMinMaxY(this.mValues.get(entryIndex2));
        }
    }

    protected void calcMinMax(T t) {
        if (t == null) {
            return;
        }
        calcMinMaxX(t);
        calcMinMaxY(t);
    }

    protected void calcMinMaxX(T t) {
        if (t.getX() < this.mXMin) {
            this.mXMin = t.getX();
        }
        if (t.getX() > this.mXMax) {
            this.mXMax = t.getX();
        }
    }

    protected void calcMinMaxY(T t) {
        if (t.getY() < this.mYMin) {
            this.mYMin = t.getY();
        }
        if (t.getY() > this.mYMax) {
            this.mYMax = t.getY();
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getEntryCount() {
        return this.mValues.size();
    }

    public java.util.List<T> getValues() {
        return this.mValues;
    }

    public void setValues(java.util.List<T> list) {
        this.mValues = list;
        notifyDataSetChanged();
    }

    protected void copy(com.github.mikephil.charting.data.DataSet dataSet) {
        super.copy((com.github.mikephil.charting.data.BaseDataSet) dataSet);
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(toSimpleString());
        for (int i = 0; i < this.mValues.size(); i++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.mValues.get(i).toString());
            sb.append(" ");
            stringBuffer.append(sb.toString());
        }
        return stringBuffer.toString();
    }

    public java.lang.String toSimpleString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataSet, label: ");
        sb.append(getLabel() == null ? "" : getLabel());
        sb.append(", entries: ");
        sb.append(this.mValues.size());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getYMin() {
        return this.mYMin;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getYMax() {
        return this.mYMax;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getXMin() {
        return this.mXMin;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getXMax() {
        return this.mXMax;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void addEntryOrdered(T t) {
        if (t == null) {
            return;
        }
        if (this.mValues == null) {
            this.mValues = new java.util.ArrayList();
        }
        calcMinMax(t);
        if (this.mValues.size() > 0) {
            if (this.mValues.get(r0.size() - 1).getX() > t.getX()) {
                this.mValues.add(getEntryIndex(t.getX(), t.getY(), com.github.mikephil.charting.data.DataSet.Rounding.UP), t);
                return;
            }
        }
        this.mValues.add(t);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void clear() {
        this.mValues.clear();
        notifyDataSetChanged();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean addEntry(T t) {
        if (t == null) {
            return false;
        }
        java.util.List<T> values = getValues();
        if (values == null) {
            values = new java.util.ArrayList<>();
        }
        calcMinMax(t);
        return values.add(t);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean removeEntry(T t) {
        java.util.List<T> list;
        if (t == null || (list = this.mValues) == null) {
            return false;
        }
        boolean remove = list.remove(t);
        if (remove) {
            calcMinMax();
        }
        return remove;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getEntryIndex(com.github.mikephil.charting.data.Entry entry) {
        return this.mValues.indexOf(entry);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public T getEntryForXValue(float f, float f2, com.github.mikephil.charting.data.DataSet.Rounding rounding) {
        int entryIndex = getEntryIndex(f, f2, rounding);
        if (entryIndex >= 0) {
            return this.mValues.get(entryIndex);
        }
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public T getEntryForXValue(float f, float f2) {
        return getEntryForXValue(f, f2, com.github.mikephil.charting.data.DataSet.Rounding.CLOSEST);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public T getEntryForIndex(int i) {
        return this.mValues.get(i);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getEntryIndex(float f, float f2, com.github.mikephil.charting.data.DataSet.Rounding rounding) {
        T t;
        java.util.List<T> list = this.mValues;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = this.mValues.size() - 1;
        int i = 0;
        while (i < size) {
            int i2 = (i + size) / 2;
            float x = this.mValues.get(i2).getX() - f;
            int i3 = i2 + 1;
            float x2 = this.mValues.get(i3).getX();
            float abs = java.lang.Math.abs(x);
            float abs2 = java.lang.Math.abs(x2 - f);
            if (abs2 >= abs) {
                if (abs >= abs2) {
                    double d = x;
                    if (d < 0.0d) {
                        if (d < 0.0d) {
                        }
                    }
                }
                size = i2;
            }
            i = i3;
        }
        if (size != -1) {
            float x3 = this.mValues.get(size).getX();
            if (rounding == com.github.mikephil.charting.data.DataSet.Rounding.UP) {
                if (x3 < f && size < this.mValues.size() - 1) {
                    size++;
                }
            } else if (rounding == com.github.mikephil.charting.data.DataSet.Rounding.DOWN && x3 > f && size > 0) {
                size--;
            }
            if (!java.lang.Float.isNaN(f2)) {
                while (size > 0 && this.mValues.get(size - 1).getX() == x3) {
                    size--;
                }
                float y = this.mValues.get(size).getY();
                loop2: while (true) {
                    int i4 = size;
                    do {
                        i4++;
                        if (i4 >= this.mValues.size()) {
                            break loop2;
                        }
                        t = this.mValues.get(i4);
                        if (t.getX() != x3) {
                            break loop2;
                        }
                    } while (java.lang.Math.abs(t.getY() - f2) >= java.lang.Math.abs(y - f2));
                    y = f2;
                    size = i4;
                }
            }
        }
        return size;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public java.util.List<T> getEntriesForXValue(float f) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = this.mValues.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            }
            int i2 = (size + i) / 2;
            T t = this.mValues.get(i2);
            if (f == t.getX()) {
                while (i2 > 0 && this.mValues.get(i2 - 1).getX() == f) {
                    i2--;
                }
                int size2 = this.mValues.size();
                while (i2 < size2) {
                    T t2 = this.mValues.get(i2);
                    if (t2.getX() != f) {
                        break;
                    }
                    arrayList.add(t2);
                    i2++;
                }
            } else if (f > t.getX()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }
}
