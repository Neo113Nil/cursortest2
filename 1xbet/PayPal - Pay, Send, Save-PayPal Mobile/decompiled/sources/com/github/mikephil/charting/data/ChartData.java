package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public abstract class ChartData<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> {
    protected java.util.List<T> mDataSets;
    protected float mLeftAxisMax;
    protected float mLeftAxisMin;
    protected float mRightAxisMax;
    protected float mRightAxisMin;
    protected float mXMax;
    protected float mXMin;
    protected float mYMax;
    protected float mYMin;

    public ChartData() {
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        this.mDataSets = new java.util.ArrayList();
    }

    public ChartData(T... tArr) {
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : tArr) {
            arrayList.add(t);
        }
        this.mDataSets = arrayList;
        notifyDataChanged();
    }

    public ChartData(java.util.List<T> list) {
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        this.mDataSets = list;
        notifyDataChanged();
    }

    public void notifyDataChanged() {
        calcMinMax();
    }

    public void calcMinMaxY(float f, float f2) {
        java.util.Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().calcMinMaxY(f, f2);
        }
        calcMinMax();
    }

    protected void calcMinMax() {
        java.util.List<T> list = this.mDataSets;
        if (list != null) {
            this.mYMax = -3.4028235E38f;
            this.mYMin = Float.MAX_VALUE;
            this.mXMax = -3.4028235E38f;
            this.mXMin = Float.MAX_VALUE;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                calcMinMax(it.next());
            }
            this.mLeftAxisMax = -3.4028235E38f;
            this.mLeftAxisMin = Float.MAX_VALUE;
            this.mRightAxisMax = -3.4028235E38f;
            this.mRightAxisMin = Float.MAX_VALUE;
            T firstLeft = getFirstLeft(this.mDataSets);
            if (firstLeft != null) {
                this.mLeftAxisMax = firstLeft.getYMax();
                this.mLeftAxisMin = firstLeft.getYMin();
                for (T t : this.mDataSets) {
                    if (t.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT) {
                        if (t.getYMin() < this.mLeftAxisMin) {
                            this.mLeftAxisMin = t.getYMin();
                        }
                        if (t.getYMax() > this.mLeftAxisMax) {
                            this.mLeftAxisMax = t.getYMax();
                        }
                    }
                }
            }
            T firstRight = getFirstRight(this.mDataSets);
            if (firstRight != null) {
                this.mRightAxisMax = firstRight.getYMax();
                this.mRightAxisMin = firstRight.getYMin();
                for (T t2 : this.mDataSets) {
                    if (t2.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT) {
                        if (t2.getYMin() < this.mRightAxisMin) {
                            this.mRightAxisMin = t2.getYMin();
                        }
                        if (t2.getYMax() > this.mRightAxisMax) {
                            this.mRightAxisMax = t2.getYMax();
                        }
                    }
                }
            }
        }
    }

    public int getDataSetCount() {
        java.util.List<T> list = this.mDataSets;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public float getYMin() {
        return this.mYMin;
    }

    public float getYMin(com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        if (axisDependency == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT) {
            float f = this.mLeftAxisMin;
            return f == Float.MAX_VALUE ? this.mRightAxisMin : f;
        }
        float f2 = this.mRightAxisMin;
        return f2 == Float.MAX_VALUE ? this.mLeftAxisMin : f2;
    }

    public float getYMax() {
        return this.mYMax;
    }

    public float getYMax(com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        if (axisDependency == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT) {
            float f = this.mLeftAxisMax;
            return f == -3.4028235E38f ? this.mRightAxisMax : f;
        }
        float f2 = this.mRightAxisMax;
        return f2 == -3.4028235E38f ? this.mLeftAxisMax : f2;
    }

    public float getXMin() {
        return this.mXMin;
    }

    public float getXMax() {
        return this.mXMax;
    }

    public java.util.List<T> getDataSets() {
        return this.mDataSets;
    }

    protected int getDataSetIndexByLabel(java.util.List<T> list, java.lang.String str, boolean z) {
        int i = 0;
        if (z) {
            while (i < list.size()) {
                if (str.equalsIgnoreCase(list.get(i).getLabel())) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < list.size()) {
            if (str.equals(list.get(i).getLabel())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public java.lang.String[] getDataSetLabels() {
        java.lang.String[] strArr = new java.lang.String[this.mDataSets.size()];
        for (int i = 0; i < this.mDataSets.size(); i++) {
            strArr[i] = this.mDataSets.get(i).getLabel();
        }
        return strArr;
    }

    public com.github.mikephil.charting.data.Entry getEntryForHighlight(com.github.mikephil.charting.highlight.Highlight highlight) {
        if (highlight.getDataSetIndex() >= this.mDataSets.size()) {
            return null;
        }
        return this.mDataSets.get(highlight.getDataSetIndex()).getEntryForXValue(highlight.getX(), highlight.getY());
    }

    public T getDataSetByLabel(java.lang.String str, boolean z) {
        int dataSetIndexByLabel = getDataSetIndexByLabel(this.mDataSets, str, z);
        if (dataSetIndexByLabel < 0 || dataSetIndexByLabel >= this.mDataSets.size()) {
            return null;
        }
        return this.mDataSets.get(dataSetIndexByLabel);
    }

    public T getDataSetByIndex(int i) {
        java.util.List<T> list = this.mDataSets;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return this.mDataSets.get(i);
    }

    public void addDataSet(T t) {
        if (t == null) {
            return;
        }
        calcMinMax(t);
        this.mDataSets.add(t);
    }

    public boolean removeDataSet(T t) {
        if (t == null) {
            return false;
        }
        boolean remove = this.mDataSets.remove(t);
        if (remove) {
            calcMinMax();
        }
        return remove;
    }

    public boolean removeDataSet(int i) {
        if (i >= this.mDataSets.size() || i < 0) {
            return false;
        }
        return removeDataSet((com.github.mikephil.charting.data.ChartData<T>) this.mDataSets.get(i));
    }

    public void addEntry(com.github.mikephil.charting.data.Entry entry, int i) {
        if (this.mDataSets.size() <= i || i < 0) {
            return;
        }
        T t = this.mDataSets.get(i);
        if (t.addEntry(entry)) {
            calcMinMax(entry, t.getAxisDependency());
        }
    }

    protected void calcMinMax(com.github.mikephil.charting.data.Entry entry, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        if (this.mYMax < entry.getY()) {
            this.mYMax = entry.getY();
        }
        if (this.mYMin > entry.getY()) {
            this.mYMin = entry.getY();
        }
        if (this.mXMax < entry.getX()) {
            this.mXMax = entry.getX();
        }
        if (this.mXMin > entry.getX()) {
            this.mXMin = entry.getX();
        }
        if (axisDependency == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT) {
            if (this.mLeftAxisMax < entry.getY()) {
                this.mLeftAxisMax = entry.getY();
            }
            if (this.mLeftAxisMin > entry.getY()) {
                this.mLeftAxisMin = entry.getY();
                return;
            }
            return;
        }
        if (this.mRightAxisMax < entry.getY()) {
            this.mRightAxisMax = entry.getY();
        }
        if (this.mRightAxisMin > entry.getY()) {
            this.mRightAxisMin = entry.getY();
        }
    }

    protected void calcMinMax(T t) {
        if (this.mYMax < t.getYMax()) {
            this.mYMax = t.getYMax();
        }
        if (this.mYMin > t.getYMin()) {
            this.mYMin = t.getYMin();
        }
        if (this.mXMax < t.getXMax()) {
            this.mXMax = t.getXMax();
        }
        if (this.mXMin > t.getXMin()) {
            this.mXMin = t.getXMin();
        }
        if (t.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT) {
            if (this.mLeftAxisMax < t.getYMax()) {
                this.mLeftAxisMax = t.getYMax();
            }
            if (this.mLeftAxisMin > t.getYMin()) {
                this.mLeftAxisMin = t.getYMin();
                return;
            }
            return;
        }
        if (this.mRightAxisMax < t.getYMax()) {
            this.mRightAxisMax = t.getYMax();
        }
        if (this.mRightAxisMin > t.getYMin()) {
            this.mRightAxisMin = t.getYMin();
        }
    }

    public boolean removeEntry(com.github.mikephil.charting.data.Entry entry, int i) {
        T t;
        if (entry == null || i >= this.mDataSets.size() || (t = this.mDataSets.get(i)) == null) {
            return false;
        }
        boolean removeEntry = t.removeEntry(entry);
        if (removeEntry) {
            calcMinMax();
        }
        return removeEntry;
    }

    public boolean removeEntry(float f, int i) {
        com.github.mikephil.charting.data.Entry entryForXValue;
        if (i < this.mDataSets.size() && (entryForXValue = this.mDataSets.get(i).getEntryForXValue(f, Float.NaN)) != null) {
            return removeEntry(entryForXValue, i);
        }
        return false;
    }

    public T getDataSetForEntry(com.github.mikephil.charting.data.Entry entry) {
        if (entry == null) {
            return null;
        }
        for (int i = 0; i < this.mDataSets.size(); i++) {
            T t = this.mDataSets.get(i);
            for (int i2 = 0; i2 < t.getEntryCount(); i2++) {
                if (entry.equalTo(t.getEntryForXValue(entry.getX(), entry.getY()))) {
                    return t;
                }
            }
        }
        return null;
    }

    public int[] getColors() {
        if (this.mDataSets == null) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.mDataSets.size(); i2++) {
            i += this.mDataSets.get(i2).getColors().size();
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < this.mDataSets.size(); i4++) {
            java.util.Iterator<java.lang.Integer> it = this.mDataSets.get(i4).getColors().iterator();
            while (it.hasNext()) {
                iArr[i3] = it.next().intValue();
                i3++;
            }
        }
        return iArr;
    }

    public int getIndexOfDataSet(T t) {
        return this.mDataSets.indexOf(t);
    }

    protected T getFirstLeft(java.util.List<T> list) {
        for (T t : list) {
            if (t.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT) {
                return t;
            }
        }
        return null;
    }

    public T getFirstRight(java.util.List<T> list) {
        for (T t : list) {
            if (t.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT) {
                return t;
            }
        }
        return null;
    }

    public void setValueFormatter(com.github.mikephil.charting.formatter.ValueFormatter valueFormatter) {
        if (valueFormatter != null) {
            java.util.Iterator<T> it = this.mDataSets.iterator();
            while (it.hasNext()) {
                it.next().setValueFormatter(valueFormatter);
            }
        }
    }

    public void setValueTextColor(int i) {
        java.util.Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueTextColor(i);
        }
    }

    public void setValueTextColors(java.util.List<java.lang.Integer> list) {
        java.util.Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueTextColors(list);
        }
    }

    public void setValueTypeface(android.graphics.Typeface typeface) {
        java.util.Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueTypeface(typeface);
        }
    }

    public void setValueTextSize(float f) {
        java.util.Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueTextSize(f);
        }
    }

    public void setDrawValues(boolean z) {
        java.util.Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setDrawValues(z);
        }
    }

    public void setHighlightEnabled(boolean z) {
        java.util.Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setHighlightEnabled(z);
        }
    }

    public boolean isHighlightEnabled() {
        java.util.Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            if (!it.next().isHighlightEnabled()) {
                return false;
            }
        }
        return true;
    }

    public void clearValues() {
        java.util.List<T> list = this.mDataSets;
        if (list != null) {
            list.clear();
        }
        notifyDataChanged();
    }

    public boolean contains(T t) {
        java.util.Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            if (it.next().equals(t)) {
                return true;
            }
        }
        return false;
    }

    public int getEntryCount() {
        java.util.Iterator<T> it = this.mDataSets.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().getEntryCount();
        }
        return i;
    }

    public T getMaxEntryCountSet() {
        java.util.List<T> list = this.mDataSets;
        if (list == null || list.isEmpty()) {
            return null;
        }
        T t = this.mDataSets.get(0);
        for (T t2 : this.mDataSets) {
            if (t2.getEntryCount() > t.getEntryCount()) {
                t = t2;
            }
        }
        return t;
    }
}
